import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by admin on 4/4/17.
 */
public class Scan {
    public static void main(String[] args) throws IOException {

        Scanner real = null;
        try {
            real = new Scanner(System.in);

            int oper1 = 0;
            int oper2 = 0;

            while (real.hasNext()) {
                String temp = real.next();
                //System.out.println(temp);
                if (oper1 == 0) {
                    try {
                        oper1 = Integer.parseInt(temp);
                    } catch (NumberFormatException e) {
                        System.out.println("ERROR NO NUMBER");
                    }
                } else if (oper2 == 0) {
                    try {
                        oper2 = Integer.parseInt(temp);
                    } catch (NumberFormatException e) {
                        System.out.println("ERROR STILL NO NUMBER");
                    }
                } else {
                    if (Objects.equals(temp, "+")) {
                        oper1 = oper1 + oper2;
                        oper2 = 0;
                    } else if (temp.equals("-")) {
                        oper1 = oper1 - oper2;
                        oper2 = 0;
                    } else {
                        System.out.println("TRY AGAIN");
                    }
                }

                if (oper1 != 0) {
                    System.out.print(oper1);
                }
                if (oper2 != 0) {
                    System.out.print(", " + oper2);
                }
            }

        } finally {
            if (real != null) {
                real.close();
            }
        }
    }
}
