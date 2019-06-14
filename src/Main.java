import java.util.Scanner;

public class Main {
    private static Worker workToDo;

    public static void main(String[] args) {
	    printManual();
        Scanner sc = new Scanner(System.in);
	    switch (sc.nextInt()){
            case 1:
                workToDo = new TriangleField();
                break;
            case 3:
                workToDo = new RectangleField();

            default:
                throw new IllegalArgumentException("Operacja jest niedozwolona");
        }

        workToDo.doWork();
    }

    public static void printManual(){
        System.out.println("Wybierz opcje aby wykonać podprogram:");
        System.out.println("1. Liczenie pola trójkąta");

        System.out.println("Twój wybór: ");
        System.out.println("1 - Trójkąt, 2 - Prostokąt");


    }
}
