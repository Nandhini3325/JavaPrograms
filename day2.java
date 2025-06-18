import java.util.Scanner;

public class day2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //1 Discount
        int purchase=sc.nextInt(); 
        if (purchase>2000) {
            purchase-=500;
            System.out.println("Discounted Amount: "+ purchase);
        } 
        else 
            System.out.println("No discount");

        //2 Last even and before 7
        int n=sc.nextInt();
        int last=n%10;
        int secondLast=(n/10)%10;
        if (last%2==0 && secondLast==7) 
            System.out.println("Yes");
        else 
            System.out.println("No");

        //3 Last two digits sum
        int lastTwo=n%100;
        int sum=(lastTwo/10)+(lastTwo%10);
        System.out.println("Sum: "+sum);

        //4 vote eligibility
        int age=sc.nextInt();
        if (age>=18) 
            System.out.println("Eligible");
        else 
            System.out.println("Not eligible");

        //5 Coin toss
        char ch=sc.next().charAt(0);
        if (ch=='h') 
            System.out.println("head");
        else if (ch=='t') 
            System.out.println("tail");
        else if (ch=='H') 
            System.out.println("HEAD");
        else if (ch=='T') 
            System.out.println("TAIL");
        else 
            System.out.println("Invalid");

        //6 Ticket price based on age
        String type=sc.next();
        int price=500;
        switch(type) {
            case "child":
                System.out.println("Final Price: " +(price / 2));
                break;
            case "adult":
                System.out.println("Final Price: " +price);
                break;
            case "senior":
                System.out.println("Final Price: " +(price - 300));
                break;
            default:
                System.out.println("Invalid");
        }

        //7 Vowel or Consonant
        char c=sc.next().charAt(0);
        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'|| c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            System.out.println("Vowel");
        else if ((c>='a' && c<='z') || (c>='A' && c<='Z'))  
            System.out.println("Consonant");
        else    
            System.out.println("Not a letter");

        sc.close();
    }
}
