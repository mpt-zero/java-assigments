package Nika;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    C obj_1=new C();
        obj_1.getValues();
        System.out.println("Last Digit is "+obj_1.lastDigit());
        System.out.println("First Digit is "+obj_1.firstDigit());
        System.out.println("Sum of Digit is "+obj_1.sumOfVar());
        System.out.println(obj_1.method5());
        System.out.println(obj_1.method6());


        A obj_2=new A();
        obj_2.setValue();
        System.out.println(obj_2.printValue());
        System.out.println(obj_2.evenOrOdd());
        B obj_3=new B();
        obj_3.SetValue();
        System.out.println(obj_3.Summ());

        int  a,b;
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.print("Etner Value of a");
        a= sc.nextInt();
        System.out.print("Etner Value of b");
        b=sc.nextInt();





    rndRange(a,b);

    }
    public static void rndRange(int start, int finish){
        Random rand = new Random();
        int even=0;
        int odd=0;

                for(int i=0;i<40;i++){
                    if(start<finish) {
                        int rndint = rand.nextInt(finish + 1 - start) + start;
                        System.out.println(rndint);
                        if(rndint%2==0){
                            even++;
                        }
                        else{
                            odd++;
                        }

                    }
                    else if(start>finish){
                        int rndint = rand.nextInt(start + 1 - finish) + finish;
                        System.out.println(rndint);
                        if(rndint%2==0){
                            even++;
                        }
                        else{
                            odd++;
                        }
                    }


                    }
                        System.out.println("sum of even numbers is "+even);
                        System.out.println("sum of odd numbers is "+odd);
                        System.out.println(even+odd);
                        for(int y=0;y<5;y++) {
                            if (even < odd) {
                                int oddIsMore = rand.nextInt(odd + 1 - even) + even;
                                System.out.println(oddIsMore);
                            } else if (even > odd) {
                                int evenisMore = rand.nextInt(even + 1 - odd) + odd;
                                System.out.println(evenisMore);
                            }
                        }
                    }



    }


