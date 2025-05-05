package tranning25_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	Scanner in = new Scanner(System.in);
	   
    int add(){
        int n=0,num=0,res=0;
        try{
            System.out.print("enter number of inputs: ");
            n = in.nextInt();   
        }catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter a valid integer.");
        }
        if (n==0) 
            return 0;
        for(int i=1;i<=n ;i++){
            try{
                System.out.print("enter " + i +" number : ");
                num = in.nextInt();
            }catch (InputMismatchException e){
            System.out.println("InputMismatchException: Please enter a valid integer.");
            }
            if (num==0) 
                return 0;
            res+=num;
        }
        System.out.println("Result : " + res);
        return 0;
    }
   
    int sub(){
        int n=0,num=0,res=0;
        try{
            System.out.print("enter number of inputs: ");
             n = in.nextInt();   
        }catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter a valid integer.");
        }
        if (n==0) 
                return 0;
        for(int i=1;i<=n ;i++){
            try{
                System.out.print("enter " + i +" number : ");
                num = in.nextInt();
            }catch (InputMismatchException e){
            System.out.println("InputMismatchException: Please enter a valid integer.");
            }
            if (num==0) 
                return 0;
            if( i==1){
                res=num;
            }
            else{
                res-=num;
            }
        }
        System.out.println("Result : " + res);
        return 0;
    }
    
    int mul(){
        int n=0,num=1,res=1;
        try{
            System.out.print("enter number of inputs: ");
             n = in.nextInt();   
        }catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter a valid integer.");
        }
        if (n==0) 
            return 0;
        for(int i=1;i<=n ;i++){
            try{
                System.out.print("enter " + i +" number : ");
                num = in.nextInt();
            }catch (InputMismatchException e){
            System.out.println("InputMismatchException: Please enter a valid integer.");
            }
            if (num==0) 
                return 0;
            res*=num;
        }
        System.out.println("Result : " + res);
        return 0;
    }
    
    int div(){
        int n=0,num=1;
        double res=0;
        try{
            System.out.print("enter number of inputs: ");
            n = in.nextInt();   
        }catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter a valid integer.");
        }
        if (n==0) 
            return 0;
        for(int i=1;i<=n ;i++){
            try{
                System.out.print("enter " + i +" number : ");
                num = in.nextInt();
            }catch (InputMismatchException e){
            System.out.println("InputMismatchException: Please enter a valid integer.");
            }
            if (num==0 && i !=1){
                System.out.println("ArithmeticException: Please enter a valid interger");
                return 0;
            }
            if(i==1){
                res=num;
            }
            else{
                res/=num;
            }
        }
        System.out.println("Result : " + res);
        return 0;
    }
}
