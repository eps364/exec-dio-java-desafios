import java.util.Locale;
import java.util.Scanner;

public class EcommerceSpendingTracker {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);
    int purchaseCount = scanner.nextInt();
    if (purchaseCount == 0) {
      System.out.println("Nenhuma compra registrada.");
    } else {
      double totalSpent = 0.0;
      // Ler os valores das compras e somar
      for (int i = 0; i < purchaseCount; i++) {
        double value = scanner.nextDouble();
        totalSpent += value;
      }
      // Calcular a média
      double average = totalSpent / purchaseCount;
      // Imprimir resultados com duas casas decimais
      System.out.printf("%.2f%n", totalSpent);
      System.out.printf("%.2f%n", average);
    }
    scanner.close();
  }
}
