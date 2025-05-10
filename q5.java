import java.util.Scanner;
import java.lang.System;
class q5{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String color = scan.nextLine();
        if(color.equalsIgnoreCase("red")){
            System.out.print("STOP.");
        }
        else if(color.equalsIgnoreCase("yellow")){
            System.out.print("GET READY!");
        }
        else if(color.equalsIgnoreCase("green")){
            System.out.print("GO.");
        }

    }
}