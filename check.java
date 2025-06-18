import java.util.*; 
public class check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n%10) %2==0){
            n/=10;
            if((n%10)==4){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }

}