package Homework2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть n:");
        int n = Integer.parseInt(br.readLine());
        task2_a(n);
        task2_b(n);
        task2_c(n);
        task2_d(n);
}
 public static void task2_a(int n){
     int squared = n*n;
     String r = Integer.toString(squared);
     if (r.indexOf('3')!=-1){
         System.out.println("a) Цифра 3 присутня в числі "+squared);
     }else{
         System.out.println("a) Цифра 3 відсутня в числі "+squared);
     }
 }

 public static void task2_b(int n){
     System.out.println("б) "+new StringBuffer(Integer.toString(n)).reverse().toString());
 }

 public static void task2_c(int n){
        String str = Integer.toString(n);
         System.out.println("в) "+str.charAt(str.length()-1)+str.substring(1,str.length()-1)+str.charAt(0));

 }
 public static void task2_d(int n){
        StringBuilder sb = new StringBuilder(Integer.toString(n));
        System.out.println("г) "+sb.insert(0,'1').insert(sb.length(),'1'));
 }
}
