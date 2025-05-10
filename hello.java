import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        Scanner prem = new Scanner(System.in);
        String Name = prem.nextLine();
        int Age = prem.nextInt();
        System.out.println("My Name is "+Name);
        System.out.println("My Age is "+Age);
    }
}