import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        // Считывание шести целых чисел x, a, b, c, d, e из консоли
        int x = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int count = 1;


        // Сравнение a с расстоянием x
        if (a >= x) {
            // Если a больше или равно x, прибавляем к count единицу
            // Иначе выводим count
            count += 1;
            // Сравнение b с расстоянием x
            if (b >= x) {
                // Если b больше или равно x, прибавляем к count единицу
                // Иначе выводим count
                count += 1;
                // Сравнение c с расстоянием x
                if (c >= x) {
                    // Если c больше или равно x, прибавляем к count единицу
                    // Иначе выводим count
                    count += 1;
                    // Сравнение d с расстоянием x
                    if (d >= x) {
                        // Если d больше или равно x, прибавляем к count единицу, затем выводим count
                        count += 1;
                        out.println(count);
                    }
                    // Если d меньше x, то выводим count
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
