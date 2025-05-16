
import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        int i, j = 0;
        Scanner s = new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            for (j = 0; j <=i; j++) {
                System.out.print(j);
                // break;
            }

            System.out.print("\n");
        }
    }
}
