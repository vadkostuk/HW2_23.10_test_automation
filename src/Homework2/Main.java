package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int x,r,a,b,c;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть довжину отвору: x= ");
        x=Integer.parseInt(br.readLine());
        System.out.println("Введіть ширину отвору: r= ");
        r=Integer.parseInt(br.readLine());
        System.out.println("Введіть довжину цеглини: a= ");
        a=Integer.parseInt(br.readLine());
        System.out.println("Введіть ширину цеглини: b= ");
        b=Integer.parseInt(br.readLine());
        System.out.println("Введіть висоту цеглини: c= ");
        c=Integer.parseInt(br.readLine());
        BrickAndHole(x,r,a,b,c);
    }

    public static void BrickAndHole(int h_length, int h_width, int b_length, int b_width, int b_height){
        if ( (b_length<=h_length && b_height<=h_width) || (b_length<=h_width && b_height<=h_length ) ||
                (b_length<=h_length && b_width<=h_width) || (b_length<=h_width && b_width<=h_length) ||
                (b_width<=h_length && b_height<=h_width) || (b_height<=h_length && b_width<=h_width)){
            System.out.println("Цеглина може пройти через отвір");
        }else{
            System.out.println("Цеглина не пройде через отвір");
        }
    }
}
