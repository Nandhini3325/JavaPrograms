import java.util.Scanner;
public class four {
    public static int sum(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //first last sum & first two and last two sum
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        int last=num%10;  //lastTwo/10;
        int lastTwo=num%100; 
        int first=num;    //firstTwo/10;
        int firstTwo=num;
        while(first>=10) {
            first/=10;
        }
        while(firstTwo>99) {
            firstTwo/=10;
        }
        int fLS=first+last;
        int fTLT=firstTwo+lastTwo;
        System.out.println(fLS+" "+fTLT);

        //find the sum of digit until it is become single digit
        int ans=sum(num);
        while(ans>=10) {
            ans=sum(ans);
        }
        System.out.println(ans);

        //largest and smallest digit
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

        //
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
        System.out.print(count);

        sc.close();
    }

}
