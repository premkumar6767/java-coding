//class ForLoop{
//    public static void main(String args[]){
//        System.out.println("THE NUMBERS FROM 1 TO 10:");
//        for(int i = 1; i<=10 ; i++){
//            System.out.println(i);
//        }
//    }
//}
/*import java.util.Scanner;
import java.lang.System;
class ForLoop{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER:");
        int a = scan.nextInt();
        System.out.println("ENTER THE SECOND NUMBER:");
        int b = scan.nextInt();
        System.out.println("THE NUMBER FROM A TO B:");
        for(int i = a; i<=b ; i++){
            System.out.println(i);
        }
    }

}*/
/*class ForLoop{
    
    public static void main(String args[]){
        int oddcount = 0;
        for(int i = 1; i<=10 ; i++){
            if(i%2==0){
                System.out.println("Even number: "+i);
            }
            else{
                
                oddcount = oddcount+1;
                System.out.println("Odd number: "+i);
            }
        }
        System.out.println("ODD NUMBERS COUNT: "+oddcount);
    }

}*/
class ForLoop{
    
    public static void main(String args[]){
        System.out.println("NUMBERS DIVISIBLE BY 3 AND 5:");
        for(int i = 1; i<=100 ; i++){
            if(i%3==0&&i%5==0){
                System.out.println(i);
            }
        }
    }

}

