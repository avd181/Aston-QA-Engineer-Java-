
   import java.util.Scanner;
   public class Main {
    public static void compare(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        if (b != 0) {
            System.out.println("Деление: " + (a / b));
        } else {
            System.out.println("Деление: На ноль делить нельзя");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        String str1 = in.nextLine();
        int a = Integer.parseInt(str1.trim());
        System.out.print("Введите b: ");
        String str2 = in.nextLine();
        int b = Integer.parseInt(str2.trim());
        compare(a, b);
    }
}