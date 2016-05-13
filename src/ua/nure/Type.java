package ua.nure;

public class Type {

    private double sizeCheles;
    private double widthCheles;
    private double sizeLep;
    private double widthLep;
    private String name;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Type)) return false;

        Type type = (Type) o;

        if (Math.abs(type.sizeCheles - sizeCheles)>0.1) {
            if (Math.abs(type.widthCheles-widthCheles)>0.1){
                if (Math.abs(type.sizeLep - sizeLep)>0.1){
                    if(Math.abs(type.widthLep-widthLep)>0.1){
                        return false;
                    }
                }
            }
        }

        return true;

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
