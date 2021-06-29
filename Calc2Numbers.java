import java.util.*;


public class Calc2Numbers {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();


        System.out.println("number1 and number 2 summed:" + (number1 + number2));
        System.out.println("number1 and number 2 subcs:" + (number1 - number2));
        System.out.println("number1 and number 2 devided:" + (number1 / number2));
        System.out.println("number1 and number 2 multiplied:" + (number1 * number2));



    }

}
