package Nika;
import java.util.Scanner;

public class C {
    int a,b,c;
    public void getValues(){
        System.out.println("Value for first num");
        Scanner sc;
        sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Value for second num");
        b=sc.nextInt();
        System.out.println("Value for third num");
        c=sc.nextInt();

    }
    public int lastDigit(){
         return a%10;
    }
    public int firstDigit(){
        while(b>=10){
            b=b/10;
        }
        return b;
    }
    public int sumOfVar(){
        int sum=0;
        while(c>0){
            int rem=c%10;
            sum=sum+rem;
            c=c/10;
        }
        return sum;

    }
    public int method5(){
        return (a%10)*b;
    }
    public int method6(){
        return (a%10)*b+b;
    }

}
