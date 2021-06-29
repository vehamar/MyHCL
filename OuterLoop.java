public class OuterLoop {

    public static void main(String[] args) {


        int age = 14;
        OUTER: while (age <= 21) {
            if (age == 16) {
                System.out.println("Get your drivers license");
                age++;
                continue OUTER;
                }
            else {
                System.out.println("Another year...");
                age++;
            }
        }

    }
}
