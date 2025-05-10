public class ForEach{
    public static void main(String args[]){
        int arr[] = {12,35,67,89};
        //for(int i = 0; i<4; i++){
        //    System.out.println(arr[i]);
       // } normal for loop
        for(int var:arr){ // Enhanced for loop (FOR EACH LOOP)
            System.out.println(var);
        }
        //we can also do this for string
        String[] num = {"one", "two"};
        for(String var:num){ // Enhanced for loop (FOR EACH LOOP)
            System.out.println(var);
        }
    }

}