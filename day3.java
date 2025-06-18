import java.util.Scanner;
public class day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //2largest and smallest digit
        System.out.println("Second");
        int num = sc.nextInt();
        int large=0, small=0;
        int temp=num;
        while(temp!=0) {
            int digit=temp%10;
            if(digit>large) {
                large=digit;
            }
            if(digit<small || small==0) {
                small=digit;
            }
            temp/=10;
        }
        System.out.println(large+" "+small);
       
        //3
        System.out.println("Third");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int count=0;
        for(int i=a;i<=b;i++){
            if(c%i==0){
                System.out.print(i+" ");
                count++;
            }   
        }
        System.out.println(count);

        //4
        System.out.println("Fourth");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(i%2==0){
                    System.out.print("* ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

        //5
        System.out.println("Fifth");
        int co=1;  
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (i==j){
                    System.out.print(1+" ");
                } else{
                    co++;
                    if (co>9) co=1;
                    System.out.print(co+" ");
                }
            }
            System.out.println();
        }

        //6
        System.out.println("Sixth");
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (i==0 || i==n-1) {
                    if (j==0 || j==n-1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("# ");
                    }
                } else if (i==n/2) {
                    System.out.print("- ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

