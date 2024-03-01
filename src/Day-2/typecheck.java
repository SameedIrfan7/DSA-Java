import java.util.Scanner;

public class typecheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    char ch=sc.next().trim().charAt(0);
    
    if(ch>='a' && ch<='z'){
        System.out.println(ch+" is a lowercase letter.");
    }else{
        System.out.println(ch+" is a uppercase letter");
    }
    sc.close();
    }
}