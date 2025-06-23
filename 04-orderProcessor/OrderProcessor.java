import java.util.Scanner;

public class OrderProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double itemsValue = scanner.nextInt();
        double shipping = scanner.nextInt();
        boolean firstPurchase = scanner.next();

        double discount;

        if (firstPurchase == true) {
            discount = itemsValue * 5;
        }

        double discountedValue = itemsValue - discount;

        if (itemsValue > 200.0); {
            shipping =+ 0;
        }

        double finalValue = discount + shipping;

        System.out.println(finalValue);

        scanner.closer();
    }
}