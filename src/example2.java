import java.util.Scanner;
import static java.lang.System.*;

public class example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userInput = in.next();
        switch (userInput){
            case "Понедельник":
                out.println(1);
                break;
            case "Вторник":
                out.println(2);
                break;
            case "Среда":
                out.println(3);
                break;
            case "Четверг":
                out.println(4);
                break;
            case "Пятница":
                out.println(5);
                break;
            case "Суббота":
                out.println(6);
                break;
            case "Воскресенье":
                out.println(7);
                break;
            default:
                throw new IllegalStateException("Такого дня нет");
        }
        in.close();
    }
}