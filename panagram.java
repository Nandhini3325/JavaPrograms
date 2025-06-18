import java.util.*;

public class panagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int arr[]=new int[256];
        Boolean flag=false;
        String lower=str.toLowerCase();

        // for(int i=0;i<str.length();i++){
        //         arr[lower.charAt(i)-'a']=1;
        //     }
        //  for(int i=0;i<26;i++){
        //     if(arr[i]==0){
        //         System.out.print("Not a pangram");
        //         flag=true;
        //         break;  
        //     }
        //  }
        
        for(int i=0;i<str.length();i++) arr[lower.charAt(i)]++;
        for(int i=97;i<123;i++){
            if(arr[i]==0){
                System.out.print("Not a pangram");
                flag=true;
                break;
            }
        }

         if(!flag){
         System.out.print("pangram");}
         sc.close();
    }
    
}
