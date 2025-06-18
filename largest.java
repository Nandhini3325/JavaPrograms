import java.util.*;

public class largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }        
        int largest=a[0];
        int sec=Integer.MIN_VALUE;
        int smallest=a[0]; 
        int secondS=Integer.MAX_VALUE;
        for (int i=1;i<a.length;i++) {
            if (a[i]>largest) 
                largest=a[i];
            if (a[i]<smallest) 
                smallest=a[i]; 
        }

        for(int i=0;i<n;i++){
            if(a[i]>sec && a[i] != largest)
            sec=a[i];
            if(a[i]<secondS && a[i]!=smallest)
            secondS=a[i];
        }
        System.out.println("Largest number " + largest);
        System.out.println("Second Largest:"+sec);
        System.out.println("Smallest number " + smallest);
        System.out.println("Second Smallest number:"+secondS);
        sc.close();
    }
    
}
