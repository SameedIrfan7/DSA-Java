import java.util.Scanner;
/**
 * prg
 */
public class day2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();

        // int roll_no=47;
        // float marks=7.4f;
        // double largedecinum=2345678.89;
        // long largeInt=1234567898765432L;
        // boolean check=true;
        int b=230_000_00;
        System.out.println(a);
        System.out.println(b);

        float marks=sc.nextFloat();
        System.out.println(marks);

        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int sum=num1+num2;
        System.out.println("Sum of two number is "+sum);
    }
}