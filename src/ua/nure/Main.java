package ua.nure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {

    static final double SIZE_CHELES_MIN = 4.3;
    static final double SIZE_CHELES_MAX = 6.8;

    static double WIDTH_CHELES_MIN = 2.2;
    static double WIDTH_CHELES_MAX = 4.4;

    static double SIZE_LEP_MIN = 1.;
    static double SIZE_LEP_MAX = 6.9;

    static double WIDTH_LEP_MIN = 0.1;
    static double WIDTH_LEP_MAX = 2.5;
    static int[] Ag1 = {0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0};
    static int[] Ag2 = {1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1};
    static int[] Ag3 = {1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1};

    static  Type[] S = {new Type(Ag1,"Ag1"),new Type(Ag2,"Ag2"), new Type(Ag1,"Ag1")};


    //static List<Type> setosaList = new ArrayList<Type>();
    static List<Type> detectors = new ArrayList<Type>();

    public static void main(String... args) throws FileNotFoundException {

//        File file = new File("1.txt");
//
//
//        Scanner s = new Scanner(file);
//
//        while (s.hasNext()) {
//            String str = s.nextLine();
//            String parts[] = str.split(" ");
//            double sizeCheles = Double.parseDouble(parts[0].replace(",", "."));
//            double widthCheles = Double.parseDouble(parts[1].replace(",", "."));
//            double sizeLep = Double.parseDouble(parts[2].replace(",", "."));
//            double widthLep = Double.parseDouble(parts[3].replace(",", "."));
//            String name = parts[4];
//
//            //setosaList.add(new Type(sizeCheles, widthCheles, sizeLep, widthLep, name));
//        }name
        int itr = 1000;
        while (itr > 0) {
            genDetector();
            itr--;
        }
         int[] ag1Change = {0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1};
        Type unCorrect = new Type(ag1Change,"Un Correct");

        System.out.println(detectors.size());

        S[2] = unCorrect;
        for(int i= 0; i<3;i++) {
            for (Type d : detectors) {
                if(S[i].getName().equals("Un Correct")){
                    System.out.println(S[i].getName());
                    for(int a:S[i].getArray())
                    System.out.print(a);
                    break;
                }

            }
        }



       // System.out.println(setosaList.size() + "\n" + detectors.size());

//        for (Type t : setosaList) {
//            for (Type d : detectors) {
//                if (t.equals(d)) {
//                    t.setName("Enemy");
//                }
//
//            }
//            if (t.getName().equals("Enemy"))
//                System.out.println(t.toString());
//        }


    }

    public static void genDetector() {

        Type dec = new Type("Setosa");
        boolean mark = false;
        for(int i= 0; i <2;i++){
            if(S[i].equals(dec)){
                mark = true;
                break;
            }
        }
        if (mark) {
            detectors.add(dec);
        }


    }
}
