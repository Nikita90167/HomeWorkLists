import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<String> shoppingList = new ArrayList();

    static boolean addProduct() {
        System.out.println("Какую покупку хотите добавить?");
        String nameProduct = scanner.nextLine();
        shoppingList.add(nameProduct);
        System.out.println();
        System.out.println("Итого покупок в списке " + shoppingList.size());
        return true;
    }

    static boolean showShoppingList() {
        System.out.println();
        System.out.println("Список покупок: ");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(((i + 1) + " ") + shoppingList.get(i));
        }
        return true;
    }

    static boolean deleteProduct() {
        showShoppingList();
        System.out.println();
        System.out.println("Какой товар хотите удалить из корзины?Введите номер или название");
        String productDelete = scanner.nextLine();
        if (productDelete.matches("[0-9]+")) {
            int productDeleteNumber = Integer.parseInt(productDelete);
            shoppingList.remove(productDeleteNumber - 1);
        } else {
            shoppingList.remove(productDelete);
        }
        System.out.println("Список покупок: ");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(((i + 1) + " ") + shoppingList.get(i));
        }
        return true;
    }

    public static void main(String[] args) {

        ArrayList shoppingList = new ArrayList();
        System.out.println("Добрый день! Добро пожаловать в наш магазин!");
        while (true) {
            System.out.println();
            System.out.println("Выберите операцию:\n1. Добавить в корзину\n2. Показать корзину\n3. Удалить что-либо из корзины");
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 1) {
                addProduct();
            }
            if (input == 2) {
                showShoppingList();
            }
            if (input == 3) {
                deleteProduct();
            }
            if (input > 4) {
                System.out.println("Такой операции нет");
            }
        }
    }
}