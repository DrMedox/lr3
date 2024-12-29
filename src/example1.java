import java.util.Scanner;
import static java.lang.System.*;

public class example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();
        switch (userInput){
            case 1:
                out.println("Понедельник");
                break;
            case 2:
                out.println("Вторник");
                break;
            case 3:
                out.println("Среда");
                break;
            case 4:
                out.println("Четверг");
                break;
            case 5:
                out.println("Пятница");
                break;
            case 6:
                out.println("Суббота");
                break;
            case 7:
                out.println("Воскресенье");
                break;
            default:
                throw new IllegalStateException("Введено некорректное значение");
        }
        in.close();
    }
}