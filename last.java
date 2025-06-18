import java.util.*;
public class last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String result="";
        for (int i=0;i<s.length();i+=2) {
            char ch=s.charAt(i);
            int count=s.charAt(i+1)-'0';
            for (int j=0;j<count;j++) {
                result+=ch;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
