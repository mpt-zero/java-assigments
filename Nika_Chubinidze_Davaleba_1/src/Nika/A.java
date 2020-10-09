package Nika;

import java.util.Scanner;

public class A {
    A(){
        System.out.println("hello");
    }
    static int x;
    public void setValue(){
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.println("Enter Value for x");
        x= sc.nextInt();
    }
    public int printValue(){
        return x+12;
    }
    public String evenOrOdd(){
        if(x%2==0){
            return x+" is Even";
        }
        else{
            return x+"is Odd";
        }

    }
}
 class B extends A{


     int y;
    public void SetValue(){
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.println("Enter Value Of Y");
        y= sc.nextInt();
    }
    public int Summ(){
        return x+y;
    }
}