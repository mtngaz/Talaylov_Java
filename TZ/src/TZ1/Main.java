package TZ1;
//Составить алгоритм: если введенное число больше 7, то вывести “Привет”
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 7) {
            System.out.println("Привет");
        }
    }
}
