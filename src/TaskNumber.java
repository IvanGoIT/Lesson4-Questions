import java.util.Scanner;

/**
 * Created by IvanD on 7/14/2017.
 */
public class TaskNumber {

    public static void task1(String str) {
        System.out.println("Я задача 1 :)");
    }

    public static void task2() {
        System.out.println("Я задача 2 :)))");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные для второй задачи");
        String str = sc.nextLine();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер задачи");
        int taskNumber = sc.nextInt();

        if (taskNumber < 1 || taskNumber > 2) {
            System.out.println("Вы ввели неверный номер задачи!");
        } else {
//        switch (taskNumber) {
//            case 1:
//                task1();
//                break;
//            case 2:
//                task2();
//                break;
//        }
            if (taskNumber == 1) {
                System.out.println("Введите данные для первой задачи");
                String str = sc.nextLine();
                task1(str);
            }
            if (taskNumber == 2) task2();
        }
    }
}
