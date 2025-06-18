import java.util.Scanner;

public class hw {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println((a<b)?a:b);

        int c=sc.nextInt();
        System.out.println((c>0)?"+ve":"-ve");

        int d=sc.nextInt();
        int sum=(d%10)+(d/10);
        System.out.println((d>99)?"enter 2 digit only":sum);

        int e=sc.nextInt();
        int f=sc.nextInt();
        int g=sc.nextInt();
        System.out.println((e>f)?(e>g?e:g):(f>g?f:g));

        int h=sc.nextInt();
        int last=h%10;
        System.out.println((last>=5?"Above 5":"Below 5"));
        
        int count=0;
        while(h!=0){
            count++;
            h/=10;
        }
        System.out.println("Count :"+count);
        sc.close();
    }
}
