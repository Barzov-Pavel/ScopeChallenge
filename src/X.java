import java.util.Scanner;

public class X {
    public static Scanner x = new Scanner(System.in);

    public X() {

    }

    public static void main(String[] args) {
        X x = new X();
        X.x x1 = x.new x();
        x1.x();
        X.x();
    }

    public static void x() {
        for (int i = 0; i < 12; i++) {
            System.out.println("Enter int #" + i);
            int x = X.x.nextInt();
            X.x.nextLine();
            System.out.println(x);
            X.x(x);
        }
    }

    public static void x(int x) {
        System.out.println(x * 10);
    }


    public class x {
        public x() {
        }

        public void x() {
            System.out.println("Inner x class x method");
        }
    }
}
