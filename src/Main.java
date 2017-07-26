
import java.util.Scanner;

public class Main {

    public static Shape[] shapes = new Shape[5];
    public static int counter = 0;
    public static Scanner scanner;

    public static void main(String[] args) {


        scanner = new Scanner(System.in);

        boolean isOn = true;
        while (isOn) {

            System.out.println("1. Nowy prostokąt");
            System.out.println("2. Nowy kwadrat");
            System.out.println("3. Nowe koło");
            System.out.println("4. Nowy trapez");
            System.out.println("5. Oblicz pola wszystkich figur");
            System.out.println("6. Oblicz obwody wszystkich figur");
            System.out.println("0. Wyjdz");
            System.out.print("Wybierz: ");
            int chooser = scanner.nextInt();
            switch (chooser) {
                case 1: {
                    System.out.print("Podaj długość boku a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Podaj długość boku b: ");
                    double b = scanner.nextDouble();
                    shapes[counter] = new Rectangle(a, b);
                    counter++;
                    break;
                }
                case 2: {
                    System.out.print("Podaj długośc boku: ");
                    double side = scanner.nextDouble();
                    shapes[counter] = new Square(side);
                    counter++;
                    break;
                }
                case 3: {
                    System.out.print("Podaj promień: ");
                    double r = scanner.nextDouble();
                    shapes[counter] = new Circle(r);
                    counter++;
                    break;

                }
                case 4: {
                    System.out.print("Podaj długość a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Podaj długość b: ");
                    double b = scanner.nextDouble();
                    System.out.print("Podaj długość c: ");
                    double c = scanner.nextDouble();
                    System.out.print("Podaj długość d: ");
                    double d = scanner.nextDouble();
                    System.out.print("Podaj wysokość h: ");
                    double h = scanner.nextDouble();
                    shapes[counter] = new Trapezoid(a, b, c, d, h);
                    counter++;
                    break;
                }
                case 5: {
                    try {
                        for (Shape e : shapes) {
                            System.out.println(e.calcArea());
                        }
                    } catch (NullPointerException e) {
                        System.out.println("To koniec wpisanych figur");
                    }
                    break;
                }
                case 6: {
                    try {
                        for (Shape e : shapes) {
                            System.out.println(e.calcCircumference());
                        }
                    } catch (NullPointerException e) {
                        System.out.println("To koniec wpisanych figur");
                    }
                    break;
                }
                case 0: {
                    isOn = false;
                    break;
                }
                default: {
                    System.out.println("Nie ma takiej opcji");
                    break;
                }
            }
        }

    }

}
