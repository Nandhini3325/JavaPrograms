import java.util.*; 
public class first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);            
        System.out.print("Enter the Student Name : ");
        String name=sc.nextLine();
        System.out.print("M1 : ");
        int m1=sc.nextInt();
        System.out.print("M2 : ");
        int m2=sc.nextInt();
        System.out.print("M3 : ");
        int m3=sc.nextInt();
        System.out.print("M4 : ");
        int m4=sc.nextInt();
        System.out.print("M5 : ");
        int m5=sc.nextInt();
        System.out.println("Hi! "+name);
        System.out.println("Your Total : "+(m1+m2+m3+m4+m5));
        System.out.printf("Avg : %.1f",(m1+m2+m3+m4+m5)/5.0);
        sc.close();        
    }
}

