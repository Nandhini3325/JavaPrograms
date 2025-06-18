import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char arr[]=str.toCharArray();
        int len=str.length();
        for(int i=0;i<str.length()/2;i++){
            char temp=arr[i];
            arr[i]=arr[len-1-i];
            arr[len-1-i]=temp;
        }
        System.err.println(new String(arr));
        sc.close();
    }
}
