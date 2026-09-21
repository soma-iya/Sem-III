public class NewClass4 {

    public static int SumofDigits(int n) {
        if(n == 0){
        return 0;
        }
        return(n%10)+SumofDigits(n/10);
    }
    
    public static void main (String[]args){
        int k=SumofDigits(6723);
        System.out.println(k);
    }
} 
