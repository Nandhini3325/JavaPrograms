import java.util.Scanner;

public class function {
    static int digSum(int n){
        int sum=(n%10)+(n/10);
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println((n>99)?"Wrong input":digSum(n));
        sc.close();
    }
    
}
