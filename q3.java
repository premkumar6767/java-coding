import java.util.Scanner;
import java.lang.System;
class q3{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String RCB = scan.nextLine();
        if(RCB.equals("win")){
            System.out.print("Ee sala cup namdhey");
        }
        if(RCB.equals("loose")){
            System.out.print("Cup illa");
        }
    }
}