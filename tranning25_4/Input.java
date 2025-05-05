package tranning25_4;

import java.util.InputMismatchException;
import java.util.Scanner;

class Input extends Calculator{
    Scanner in = new Scanner(System.in);
    Calculator cal = new Calculator();
    int operation(){
        boolean ch;
        int op=0;
    do{
        System.out.println("0 - exit,1 - Addition,2- Subraction,3 - Multipilcation,4 - Division");
        try{
            System.out.print("Enter operationn number: ");
            op = in.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter a valid integer.");
        }
        switch(op){
            case 0:
                return 0;
            case 1:
                cal.add();
                break;
            case 2:
                cal.sub();
                break;
            case 3:
                cal.mul();
                break;
            case 4:
                cal.div();
                break;
            default:
                System.out.println("Invalid input");
         }
        System.out.println("type \"exit\" to exit and others to continue : " );
        String choice = in.next();
        ch = choice.equalsIgnoreCase("exit");
        System.out.println("--------------------");
        }while(!ch);
        return 0;
    }
}