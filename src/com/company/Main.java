package com.company;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        print10();
        System.out.println(sum());
        //3.
      /*  Scanner sc = new Scanner(System.in);
        int n1;
        do {
            System.out.println("Enter a positive number:");
            n1 = sc.nextInt();
        }while(n1<=0);
        printMultTable(n1);*/


        //4. write method to find factorial of n

        int n = 5;
        System.out.println("Factorial "+n+" ="+findFactorial(n));
        //5. Написать метод, находящий заданное число n в степени в заданной степени m
        // (Do not use Java built-in methods!)
        int m=3;
        System.out.println(n+" in power "+m+" = "+getPower(n,m));

       // 6.Write method where a do-while loop that prompts user to enter two numbers.
        // The method should then add the numbers and display the sum.
        // the loop should ask if the user wants to repeat the operation(1-to repeat,
        // any other digit to terminate). And repeat it if 1 is entered
   /*     Scanner scan = new Scanner(System.in);
        int num1, num2;
        do {
            System.out.println("Enter two numbers");
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            System.out.println("Sum = "+(num1+num2));
            System.out.println("Do you want to repeat? If yes - enter 1, if no - any other digit");
        }while(scan.nextInt()==1);

    */
        // 7.write a method to find a Fibonacci number
        // 0,1,1,2,3,5,8,13,21,34
        int f = 8;
        System.out.println("Fibonacci row:");
        System.out.println("Fibonacci "+f+": "+getFibonacci(f));
    }

    public static void print10(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static int sum(){
        int sum=0;
        for (int i=1; i<=5; i++){
            sum+=i;
        }
        return sum;
    }

    ////3. вывести на экран таблицу умножения
    public static void printMultTable(int n){
        for (int i=1; i<=10; i++){
            System.out.print(n*i+"\t");
        }
        System.out.println();
    }

    //4. Factorial n
    public static int findFactorial(int n){
        int fact=1;
        for (int i = 2; i <= n; i++) {
            fact*=i;
        }
        return fact;
    }

    //5.
    public static int getPower(int n, int m){
       if(m==0)return 1;
       if (m==1) return n;
       int res=n;
        for (int i = 2; i <= m; i++) {
            res*=n;
        }
        return res;
    }

    //7. Fibonacci f
    public static int getFibonacci(int f){
        if(f<2) return f;
        //sdgk yd-xlvs
        int fMinus2 =0;
        int fMinus1 =1;
        int fRes =0;
        System.out.print(fMinus2+"\t"+fMinus1+"\t");
        for (int i = 2; i <=f ; i++) {
            fRes = fMinus1+fMinus2;
            System.out.print(fRes+"\t");
            fMinus2=fMinus1;
            fMinus1=fRes;
        }
        System.out.println();
        return fRes;
    }
}
