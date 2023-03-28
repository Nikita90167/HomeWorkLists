import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList shoppingList = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добрый день! Добро пожаловать в наш магазин!");
        while (true) {
            System.out.println("Выберите операцию:\n1. Добавить в корзину\n2. Показать корзину\n3. Удалить что-либо из корзины");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    String productAdd = scanner.nextLine();
                    shoppingList.add(productAdd);
                    System.out.println("Итого покупок в списке" + shoppingList.size());
                    break;
                case 2:
                    System.out.println("Список покупок:");
                    for (int i = 0; i < shoppingList.size(); i++) {
                        System.out.println(((i + 1) + " ") + shoppingList.get(i));
                    }
                    break;
                case 3:

                    break;
            }
        }
    }
}