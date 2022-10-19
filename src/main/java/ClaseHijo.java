import java.util.Arrays;

public class ClaseHijo {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.exit(1);
        } else {
            try {
                int a = Integer.parseInt(args[0]);
                if (a < 0) {
                    System.exit(3);
                } else {
                    System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.exit(2);
            }
        }
    }
}