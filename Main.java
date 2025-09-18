import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        int x = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int count = 1;
        if (a >= x) {
            count += 1;
            if (b >= x) {
                count += 1;
                if (c >= x) {
                    count += 1;
                    if (d >= x) {
                        count += 1;
                        out.println(count);
                    }
                    else {
                        out.println(count);
                    }
                } else {
                    out.println(count);
                }
            } else {
                out.println(count);
            }
        } else {
            out.println(count);
        }
    }
}
