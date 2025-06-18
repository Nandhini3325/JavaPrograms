import java.util.*;
public class array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int oI=0;
        int eI=0;
        int oddno=0;
        int evenno=0;
        int oe=0;
        int eo=0;

        for(int i=0;i<n;i++){
            // Calculate sums based on index and value parity
            if(i%2!=0){
                oI+=a[i];
            }
            else{
                eI+=a[i];
            }
            // Calculate sums based on value parity
            if(a[i]%2!=0){
                oddno+=a[i];
            }
            else{
                evenno+=a[i];
            }
            //calculae sum on odd index and even number and vice versa
            if(i%2!=0){
                if(a[i]%2==0){
                    oe+=a[i];
                }
            }
            else{
                if(a[i]%2!=0){
                    eo+=a[i];
                }
            }
        }
        System.out.println("Odd index sum: "+oI);
        System.out.println("Even index sum: "+eI);

        System.out.println("odd Number Sum:"+oddno);
        System.out.println("Even Number Sum:"+evenno);

        System.out.println("Odd Even Sum:"+oe);
        System.out.println("Even Odd Sum:"+eo);

        sc.close();

    }
    
}
