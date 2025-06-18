import java.util.Scanner;
public class vowels{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //1
        String n=sc.nextLine();
        int count=0;
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' ){
                count++;
            }
        }
        System.out.println(count);

        //2
        String a=sc.nextLine();
        int con=0,vow=0,spl=0,num=0;
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z'){
                con++;
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    vow++;
                }
            }
            else if(ch>='0' && ch<='9'){
                num++;
            }
            else{
                spl++;
            }
        }
        System.out.println("Consonants: " +(con-vow));
        System.out.println("Vowels: " + vow);   
        System.out.println("Special Characters: "+spl);
        System.out.println("Numbers: " +num);

        //3
        String l=sc.nextLine();
        String re="";
        for(int i=0;i<l.length();i++){
             char ch=l.charAt(i);
             if(ch>='a' && ch<='z'){
                 ch-=32;
             }
             else if(ch>='A' && ch<='Z'){
                    ch+=32;
             }
             re+=ch;
            }
            System.out.println(re);
        
        //4
        String f = sc.nextLine();  
        String s = ""; 
        String c = ""; 
        String d = ""; 

        for (int i=0;i<f.length();i++) {
            char ch=f.charAt(i);
            if (ch>='A' && ch<='Z') {
                ch+=32;
                s+=ch;
            } 
            else s+=ch;

            if (ch>='a' && ch<='z') {
                ch-=32;
                c+=ch;
            } else c+=ch;

            if (ch>='a' && ch<='z') {
                ch-=32;
                d+=ch;
            } else if(ch >='A' && ch<='Z') {
                ch+=32;
                d+=ch;
            } else d+=ch;
        }

        System.out.println(s); 
        System.out.println(c);  
        System.out.println(d); 
        sc.close();
    }
}