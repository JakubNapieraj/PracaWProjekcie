import java.util.Scanner;

    public class Diamond implements Worker {
        public void doWork() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj s");
            int s = sc.nextInt();
            System.out.println("Podaj h");
            int h = sc.nextInt();

            System.out.println("Pole romba o boku s="+s + " i wysokości h=" + h + " wynosi: " + (s*h));
        }
    }
