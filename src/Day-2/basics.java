import java.util.Scanner;


public class basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Temp in C");
        float tempC=sc.nextInt();
        float tempF=(tempC * 9/5) + 32;
        System.out.println("Temp in Farenheit" + tempF);      
    }
}
