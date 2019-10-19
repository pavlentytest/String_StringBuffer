package ru.pavlenty;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char a = 'A';
        char b = '1';
        String str = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str.equals(str2));
        // НЕИЗМЕНЯЕМАЯ - IMMUTABLE
        String abc = "Moscow";
       // System.out.println(abc.hashCode());
        abc = abc + "dddd";
        //abc = abc.concat("dddd");
       // System.out.println(abc.hashCode());
        //System.out.println(abc);

        StringBuffer t = new StringBuffer("dfgasdfads");
        System.out.println(t.hashCode());
        t.append(" 4444444444");
        System.out.println(t.hashCode());
        System.out.println(t);

        String buff = t.toString();

        StringBuffer rr = new StringBuffer(buff);
        StringBuffer rrr = "";

        Scanner scan = new Scanner(System.in);
        StringBuffer p = new StringBuffer(scan.next());











    }
}
