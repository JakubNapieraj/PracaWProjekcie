import java.util.Scanner;

public class SquareField implements Worker {
    @Override
    public void doWork() {
        System.out.println("Podaj długośc boku kwadratu ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Pole kwadratu o boku a=" + a + " wynosi " + a * a+" jednostek kwadratowych.");
    }
}