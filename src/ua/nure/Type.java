package ua.nure;

import java.util.Random;

public class Type {

    private double sizeCheles;
    private double widthCheles;
    private double sizeLep;
    private double widthLep;
    private String name;
    private int[] array = new int[12];

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public Type(int ar[], String name){
        this.array=ar;
        this.name = name;
    }
    public Type (String name){
        Random r = new Random();
        for (int i = 0; i<12;i++){
            array[i] = r.nextInt(2);
        }
        this.name = name;

    }
    public Type(double sizeCheles, double widthCheles, double sizeLep, double widthLep) {

        this.sizeCheles = sizeCheles;
        this.widthCheles = widthCheles;
        this.sizeLep = sizeLep;
        this.widthLep = widthLep;

    }

    public Type(double sizeCheles, double widthCheles, double sizeLep, double widthLep, String name) {

        this.sizeCheles = sizeCheles;
        this.widthCheles = widthCheles;
        this.sizeLep = sizeLep;
        this.widthLep = widthLep;
        this.name = name;
    }


    public boolean equals(Type o) {
        int amoung = 0;
        int[] ar = o.getArray();
        for (int i = 0; i < 12; i++) {
            if (ar[i] != array[i]) {
                amoung++;
            }

        }
        if (amoung > 2){
            return false;
        }else
        {
            return true;
        }

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sizeCheles);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(widthCheles);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sizeLep);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(widthLep);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Type{" +
                "sizeCheles=" + sizeCheles +
                ", widthCheles=" + widthCheles +
                ", sizeLep=" + sizeLep +
                ", widthLep=" + widthLep +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSizeCheles() {
        return sizeCheles;
    }

    public void setSizeCheles(double sizeCheles) {
        this.sizeCheles = sizeCheles;
    }

    public double getWidthCheles() {
        return widthCheles;
    }

    public void setWidthCheles(double widthCheles) {
        this.widthCheles = widthCheles;
    }

    public double getSizeLep() {
        return sizeLep;
    }

    public void setSizeLep(double sizeLep) {
        this.sizeLep = sizeLep;
    }

    public double getWidthLep() {
        return widthLep;
    }

    public void setWidthLep(double widthLep) {
        this.widthLep = widthLep;
    }
}
