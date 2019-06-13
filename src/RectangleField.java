import java.util.Scanner;

public class RectangleField implements Worker {

    public void countField(){

        System.out.println("Podaj długość pierwszego boku: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Podaj długość drugiego boku: ");
        int b = scanner.nextInt();

        System.out.println("Pole prostokątu o bokach: " + a + "i" + b + "jest równe: " + a*b);

    }

    @Override
    public void doWork() {

    }
}
