/*public class functions{
    void greetings(){
        System.out.println("vanakam");
    }
    public static void main(String args[]){
        functions hello = new functions();
        hello.greetings();
    }
}*/
public class functions{
    
    void sum(int a ,int b){// non-static function ipo non static use panna direct ah innoru non static function and public class variables um access pannalam
        System.out.println(a+b);
    }
    public static void main(String args[]){//static function ipo static to non static call panna objects use pannanum 
        functions add = new functions();
        int a = 20;
        int b = 30;
        add.sum(a,b);
    }
}
