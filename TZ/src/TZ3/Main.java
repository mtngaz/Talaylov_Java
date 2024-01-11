package TZ3;

import java.util.ArrayList;
import java.util.Scanner;

/*
Составить алгоритм: на входе есть числовой массив, необходимо
вывести элементы массива кратные 3
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        boolean status = true;
        System.out.println("Введите целые числа. Для завершения введите 0.");
        while (status) {
            int num = scanner.nextInt();
            nums.add(num);

            if (num == 0) {
                status = false;
            }
        }
        System.out.println("Числа, кратные 3:");
        for (int num : nums) {
            if (num != 0 && num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}

