import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input angka bilangan bulat : ");
        int input = scanner.nextInt();
        if (input == 1) {
            System.out.println("1 bukan bilangan prima karena hanya memiliki satu faktor yaitu 1");
        } else if (input == 2) {
            System.out.println("2 adalah bilangan prima");
        } else {
            int faktor = 0;
            ArrayList<Integer> faktorList = new ArrayList<Integer>();
            for (int i = 1; i <= input; i++) {
                if (input % i == 0) {
                    faktor++;
                    if (i != input && i != 1) {
                        faktorList.add(i);
                    }
                }
            }
            if (faktor == 2) {
                System.out.println(input + " adalah bilangan prima");
            } else {
                System.out.println(input + " bukan bilangan prima karena memiliki " + (faktor-2) + " faktor");
                System.out.println("Faktor dari " + input + " adalah " + Arrays.toString(faktorList.toArray()));
            }
        }
    }
}
