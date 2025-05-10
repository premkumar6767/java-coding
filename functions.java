package inheritnace;

public class functions{
    
    int sum(int a ,int b){// non-static function ipo non static use panna direct ah innoru non static function and public class variables um access pannalam
        return a+b;
    }
    public static void main(String args[]){//static function ipo static to non static call panna objects use pannanum 
        functions add = new functions();
        int a = 20;
        int b = 30;
        System.out.println(add.sum(a,b));
    }
}