import java.util.Random;
import java.util.Scanner;
import java.lang.System;
class whileAndDoWhile{
    public static void main(String args[]){
        
    //Random rand = new Random();
    //int newnum = 0;
    //while(newnum!=5){
        //newnum = rand.nextInt(11);
        //System.out.println(newnum);
   // } We use while loop rather than for loop when we dont know when to stop the iteration
    //}
    Scanner scan = new Scanner(System.in);
    int count = 0;
    do{
        System.out.println("ENTER NUMBER GREATER THAN 10: ");
        count = scan.nextInt();
        count=count+1;

    }while(count<10);
    
}
}