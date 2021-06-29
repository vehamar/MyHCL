public class Branching {

    public static void main(String[] args) {
double x = 2;
double y = 5;
double z = 0;
        if (x == 2 && y == 5 && z == 0){
            System.out.println(x == 2);
            System.out.println( x != 5);
            System.out.println(x != 5 && y >= 5);
            System.out.println( z != 0 || x == 2);
            System.out.println(!(y < 10));
        }
        else System.out.println(false);

    }
}
