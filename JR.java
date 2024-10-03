import java.util.Scanner;
public class JR {
    
    public static void main(String[]args){

        Scanner kbd = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;

System.out.println("Enter the first number");
num1=kbd.nextInt();
System.out.println("Enter the second number");
num2=kbd.nextInt();

kbd.close();
//
num3=num1+num2;
System.out.println("Addition result: " + num3);

num4=num1-num2;
System.out.println("Subtraction result: " + num4);


    }
}
