package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Завданя 1: \nВведіть радіус клумби:");
        int radius = Integer.parseInt(br.readLine());
        PerimeterAndArea(radius);
        System.out.println("Завдання 2: \nWhat is your name?");
        String name = br.readLine();
        System.out.println("Where are you live "+ name+"?");
        String address = br.readLine();
        System.out.println("Nice to meet you "+name+" from "+address);
        System.out.println("Завдання 3: \nВведіть 6 чисел:");
        int c1 = Integer.parseInt(br.readLine());
        int c2 = Integer.parseInt(br.readLine());
        int c3 = Integer.parseInt(br.readLine());
        int t1 = Integer.parseInt(br.readLine());
        int t2 = Integer.parseInt(br.readLine());
        int t3 = Integer.parseInt(br.readLine());
        PhoneCalls(c1,c2,c3,t1,t2,t3);

    }

    public static void PerimeterAndArea(int radius){
        double perimeter = 2*Math.PI*radius;
        double area =  Math.PI*radius*radius;
        System.out.println("Відровідь:\nПериметр: "+perimeter+" Площа: "+area);
    }
    public static void PhoneCalls (int c1, int c2, int c3, int t1,int t2,int t3){
        System.out.printf("Для першого:%d Для другого:%d Для третього:%d Для всіх разом:%d",c1*t1,c2*t2,c3*t3,c1*t1+c2*t2+c3*t3);
    }
}
