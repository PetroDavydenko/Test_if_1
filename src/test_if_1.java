import java.util.Scanner;

public class test_if_1 {
    public static void main(String[] args) {
        System.out.print("Введите число 1 ");
        Scanner inputFigure = new Scanner(System.in);
        int a = inputFigure.nextInt();
        if (a==1) {
            System.out.println("Вы ввели число 1 ");
        }
        else {
            System.out.println("Вы ввели число не равное 1 ");
        }
    }
}
