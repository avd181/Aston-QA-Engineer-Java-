
import java.util.Scanner;
 
public class Main {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку №1: ");
        String str1 = in.nextLine();
        System.out.print("Введите строку №2: ");
        String str2 = in.nextLine();
       if (str1.equals(str2)) {
    System.out.println("Строки идентичны");
} else {
    System.out.println("Строки не идентичны");
}
        in.close();
    }
}
