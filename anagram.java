import java.util.*;
public class anagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int arr[]=new int[256];
        int flag=0;
        for(int i=0;i<str1.length();i++){
            arr[str1.charAt(i)]++;
        }
        for(int i=0;i<str2.length();i++){
            arr[str2.charAt(i)]--;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                System.out.print("False");
                flag=1;
                break;
            }
        }
        if(flag==0)
        System.out.print("True");
        sc.close();
    }
    
}
