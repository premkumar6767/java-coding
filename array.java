import java.util.Scanner;
import java.lang.System;
class array{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = 5;
        int total = 0;
        int[] arr = new int[n];
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for(int i = 0; i<=n-1; i++){
            arr[i] = scan.nextInt();
        }
        for(int i = 0; i<=n-1; i++){
            total = total + arr[i];
        }
        System.out.println("TOTAL NUMBER: "+total);
        
    }
}