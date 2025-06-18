public class into {
    public static void main(String[] args) {
        int a = 3;
        System.out.println("a = " + a);
        {
            int b = 5;
            a = a + b;
            System.out.println("a = " + a + " b = " + b); 
        }
        int b = 10;
        System.out.println("a = " + a + " b = " + b); 
    }
}
