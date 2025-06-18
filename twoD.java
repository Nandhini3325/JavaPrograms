import java.util.*;
public class twoD {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        // //row wise adding and print for each row
        // for(int i=0;i<n;i++){
        //     int sumR=0;
        //     for(int j=0;j<n;j++){
        //         sumR+=a[i][j];
        //     }
        //     System.out.print(sumR+" ");
        // }
        // System.out.println();
        // //column wise adding and print for each column
        //  for(int i=0;i<n;i++){
        //     int sumC=0;
        //     for(int j=0;j<n;j++){
        //         sumC+=a[j][i];
        //     }
        //     System.out.print(sumC+" ");
        // }
        // System.out.println();
        
        // int sumD=0;
        // int sumRi=0;
        // //diagonal wise adding
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==j){
        //             sumD+=a[i][j];
        //         }
        //         if(i+j==n-1){
        //             sumRi+=a[i][j];
        //         }
        //     }
        // }
        // System.out.println(sumD);
        // System.out.println(sumRi);

        //greatest number in array
        int larg=0;
        for(int i=0;i<n;i++){
            int lar=a[i][0];
            for(int j=1;j<n;j++){
                if(a[i][j]>lar ){
                    lar=a[i][j];
                }
            }
            System.out.println(lar);
            if(lar>larg)
            larg=lar;
        }
        System.out.println(larg);

        //leader sum
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }





        sc.close();
    }
    
}
