import java.util.Scanner;

class Doubleavg {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();
    double num3 = sc.nextDouble();
    double num4 = sc.nextDouble();
    double num5 = sc.nextDouble();
    double num6 = num1 + num2 + num3 + num4 + num5;
    double num7 = num6 / 5;
    System.out.println(num7);
    sc.close();
  }
}
