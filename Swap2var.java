public class Swap2var {
    public static void main(String[] args) {


        String a = "String1";
        String b = "String2";
        String temp = "temp";

        temp = b;
        b = a;
        a = temp;

        System.out.println(a);
        System.out.println(b);


    }
}
