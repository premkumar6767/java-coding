import java.util.Scanner;
import java.lang.System;
class if_else{
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if(num1 > num2){
            System.out.print("Number 1 is greater");
        }
        else if(num1 == num2){
            System.out.print("Number 1 and Number 2 are equal");
        }
        else{
            System.out.print("Number 2 is greater");
        }
    }
}