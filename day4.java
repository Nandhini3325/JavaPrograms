import java.util.*;

public class day4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();

        int[] a=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        //1)Search an element in array
        System.out.print("Enter the element to search: ");
        int k=sc.nextInt();
        System.out.print("Enter choice (F/f for first, R/r for reverse): ");
        char choice=sc.next().charAt(0);

        int flag=0;
        switch(choice){
            case 'F': case 'f':
                for(int i=0;i<n;i++){
                    if(k==a[i]){
                        System.out.println("Element found at position: "+(i+1));
                        flag=1;
                        break;
                    }
                }
                break;

            case 'R': case 'r':
                for(int i=n-1;i>=0;i--){
                    if(k==a[i]){
                        System.out.println("Element found at position: "+(i+1));
                        flag=1;
                        break;
                    }
                }
                break;
            default:
                System.out.println("Invalid");
        }
        if(flag==0){
            System.out.println("-1");
        }

        //2)reverse of a array
        System.out.println("Reversed array:");
        for(int i=n-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        //3)Max and min in array
        int largest=a[0],smallest=a[0];
        int secondLargest=Integer.MIN_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(a[i]>largest)
                largest=a[i];
            if(a[i]<smallest)
                smallest=a[i];
        }
        //4)Second max and second min array 
        for(int i=0;i<n;i++){
            if(a[i]>secondLargest && a[i]!=largest)
                secondLargest=a[i];
            if(a[i]<secondSmallest && a[i]!=smallest)
                secondSmallest=a[i];
        }
        System.out.println("Largest number: "+largest);
        System.out.println("Second Largest: "+secondLargest);
        System.out.println("Smallest number: "+smallest);
        System.out.println("Second Smallest: "+secondSmallest);

        
        //5)odd &even values count in array
        int oddSum=0,evenSum=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0)
                evenSum+=a[i];
            else
                oddSum+=a[i];
        }
        System.out.println("Odd Number Sum: "+oddSum);
        System.out.println("Even Number Sum: "+evenSum);

        sc.close();
    }
}
