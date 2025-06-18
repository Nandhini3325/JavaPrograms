public class integer {
    public static void main(String[] args){
        int a=10;
        int b=++a + ++a;
        int c=((a&1)==0)?b:a;
        int d=(a&b)^c;
        int e=(a%10 ==0 &&a>10)?1:0;
        int f=--d;
        int g=((b*9)%9)-5;
        int h=64/g*g;
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h);
    }
    
}
