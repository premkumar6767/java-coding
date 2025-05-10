/*class NForLoop {
    public static void main(String args[]){
        for(int teacher = 1; teacher <= 2; teacher++){ //FOR ONE TEACHER STUDENT SAYS TWO TIMES 
            for(int student = 1; student <= 2; student++){
                System.out.println("STUDENT SAYS HI SIR"); 
            }
        }
    }
}*/
/*class NForLoop {
    public static void main(String args[]){
        for(int i = 1; i <= 3; i++){  
        System.out.println();
            for(int j = 1; j <= 3 ; j++){
                System.out.print("*"); 
            }
            
        }
    }
}*/
class NForLoop {
    public static void main(String args[]){
        for(int i = 1; i <= 3; i++){  // it works for three times and prints 3 different rows for star pattern
        System.out.println();
            for(int j = 1 ; j <= i ; j++){ // it prints the * based on the value of i
             //if it is 1 means i mean first row it prints one *
                System.out.print("*"); 
            }
            
        }
    }
}