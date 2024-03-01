import java.util.Scanner;
// Find the largest of 3 num
public class Largest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 3 numbers to check which is largest among eachother:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        // if(a>b && a>c){
        //     System.out.println(a +" is Maximum");
        // }else if(b>c){
        //     System.out.println(b +" is Maximum");
        // }else{
        //     System.out.println(c+ " is Maximum");
        // }

        // int max;
        // max=a;
        // if(b>max){
        //     max=b;
        // }
        // if(c>max){
        //     max=c;
        // }
        // System.out.println(c);

        int  min=Math.min(c, Math.min(a, b)); // using inbuilt function for finding minimum and maximum value
        System.out.println(min);
        sc.close();
    }
}