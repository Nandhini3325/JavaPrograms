import java.util.*;
public class Jagged {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int arr[][]=new int[row][];
        for(int i=0;i<row;i++){
            int col=sc.nextInt();
            arr[i]=new int[col];
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
