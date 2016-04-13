package com.company;

import anastasia.sd.MyMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

    static double readDouble(String prompt, String errorMsg ) throws IOException {
        while(true) {
           System.out.print(prompt);
           try {
               return Double.parseDouble(stdIn.readLine());

           } catch (NumberFormatException e) {
               System.out.println(errorMsg);

           }
        }

    }


    public static void main(String[] args) throws IOException {
        System.out.println("Введите коефициенты: ");

        double a=readDouble("a=","Вы ввели не верное значение a");
        double b=readDouble("b=","Вы ввели не верное значение b");
        double c=readDouble("c=","Вы ввели не верное значение с");

        System.out.format("%sx^2+%sx+%s=0\n",a, b, c);

        double d = MyMath.discriminant(a, b, c);
        System.out.format("D=%s\n",d);
        System.out.println(d);

        if (d < 0) {
            System.out.print("Корней не существует,d<0");


        } else if (d == 0) {
            double x= -b/(2*a);
            System.out.format("x=%s\n",x);
            System.out.println(x);

        }
        else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.format("x1=%s\n",x1);
            System.out.println(x1);
            System.out.format("x2=%s\n",x2);
            System.out.println(x2);

        }
    }
}



