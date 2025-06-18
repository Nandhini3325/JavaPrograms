import java.util.*;
public class array2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        char choice = sc.next().charAt(0);
        int a[]=new int[100];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int flag=0;
        switch(choice){
            case 'F':case 'f':
            for(int i=0;i<n;i++){
                if(k==a[i]){
                    System.out.println(i+1);
                    flag=1;
                    break;
                }
            }
            break;
            case 'R': case 'r':
            for(int i=n-1;i>=0;i--){
                if(k==a[i]){
                    System.out.println(i+1);
                    flag=1;
                    break;
                }
            }
             break;
            default:
            System.out.println("Invalid Operator");
        }
        if(flag==0){
            System.out.println("-1");
        }
        sc.close();
    }
}
