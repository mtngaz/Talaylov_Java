package TZ2;

import java.util.Scanner;

//Составить алгоритм: если введенное имя совпадает
//с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
