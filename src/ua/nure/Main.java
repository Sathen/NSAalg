package ua.nure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by aleksii on 13.05.16.
 */
public class Main {

    static final double SIZE_CHELES_MIN = 4.3;
    static final double SIZE_CHELES_MAX = 6.8;

    static double WIDTH_CHELES_MIN = 2.2;
    static double WIDTH_CHELES_MAX = 4.4;

    static double SIZE_LEP_MIN = 1.;
    static double SIZE_LEP_MAX = 6.9;

    static double WIDTH_LEP_MIN = 0.1;
    static double WIDTH_LEP_MAX = 2.5;


    static List<Type> setosaList = new ArrayList<Type>();
    static List<Type> detectors = new ArrayList<Type>();

    public static void main(String... args) throws FileNotFoundException {

        File file = new File("1.txt");


        Scanner s = new Scanner(file);

        while (s.hasNext()) {
            String str = s.nextLine();
            String parts[] = str.split(" ");
            double sizeCheles = Double.parseDouble(parts[0].replace(",", "."));
            double widthCheles = Double.parseDouble(parts[1].replace(",", "."));
            double sizeLep = Double.parseDouble(parts[2].replace(",", "."));
            double widthLep = Double.parseDouble(parts[3].replace(",", "."));
            String name = parts[4];

            setosaList.add(new Type(sizeCheles, widthCheles, sizeLep, widthLep, name));
        }
        int itr = 1000;
        while (itr > 0) {
            genDetector();
            itr--;
        }


        setosaList.add(new Type(6.4, 3.1, 5.5, 1.8));
        setosaList.add(new Type(5.8, 2.7, 5.1, 1.9));
        setosaList.add(new Type(5.6, 2.7, 4.2, 1.3));
        setosaList.add(new Type(4.4, 2.2, 2.5,0.2));

        System.out.println(setosaList.size() + "\n" + detectors.size());

        for (Type t : setosaList) {
            for (Type d : detectors) {
                if (t.equals(d)) {
                    t.setName("Enemy");
                }

            }
            if (t.getName().equals("Enemy"))
                System.out.println(t.toString());
        }


    }

    public static void genDetector() {
        Random r = new Random();
        double sizeCheles = SIZE_CHELES_MIN + (r.nextDouble() * (SIZE_CHELES_MAX - SIZE_CHELES_MIN));
        double widthCheles = WIDTH_CHELES_MIN + (r.nextDouble() * (WIDTH_CHELES_MAX - WIDTH_CHELES_MIN));
        double sizeLep = SIZE_LEP_MIN + (r.nextDouble() * (SIZE_LEP_MAX - SIZE_LEP_MIN));
        double widthLep = WIDTH_LEP_MIN + (r.nextDouble() * (WIDTH_LEP_MAX - WIDTH_LEP_MIN));

        Type dec = new Type(sizeCheles, widthCheles, sizeLep, widthLep);
        boolean mark = true;
        for (Type t : setosaList) {
            if (t.equals(dec)) {
                mark = false;
            }
        }
        if (mark) {
            detectors.add(dec);
        }


    }
}
