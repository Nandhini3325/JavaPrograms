import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last=n%100;
        while(n>99){
            n/=10;
        }
        System.out.println(last+n);
        sc.close();
    }
}
