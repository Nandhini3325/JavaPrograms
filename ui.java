import java.util.*;
public class ui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            for (int l = 0; l <= i; l++) {
                System.out.print("#");
            }
            System.out.println();
        }
        sc.close();
    }
}
