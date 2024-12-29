import java.util.Scanner;
import static java.lang.System.*;

public class example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        out.print("Введите необходимое количество чисел:");
        int userInput = in.nextInt();
        int[] arrayOfNumbers = new int[userInput];
        arrayOfNumbers[0] = 1;
        arrayOfNumbers[1] = 1;
        for (int i = 2; i < userInput; ++i) {
            if (i==2){
                out.print(arrayOfNumbers[0]+ ", " + arrayOfNumbers[1]+ ", ");
            }
                arrayOfNumbers[i] = arrayOfNumbers[i - 1] + arrayOfNumbers[i - 2];
            if (arrayOfNumbers[i] < 0){
                out.println("Превышено максимальное значение числа...");
                break;
            }
            out.print(arrayOfNumbers[i]);
            if(userInput - 1 != i){
                out.print(", ");
            }
        }
        out.println();
        int j = 2;
        while (j<userInput){
            if (j==2) {
                out.print(arrayOfNumbers[0] + ", " + arrayOfNumbers[1] + ", ");
            }
            if (arrayOfNumbers[j]<0){
                out.println("Превышено максимальное значение числа...");
                break;
            }
            out.print(arrayOfNumbers[j] = arrayOfNumbers[j - 1] + arrayOfNumbers[j - 2]);
            if(userInput - 1 != j){
                out.print(", ");
            }
            j++;
        }
        out.println();
        j = 2;
        do{
            if (j==2) {
                out.print(arrayOfNumbers[0] + ", " + arrayOfNumbers[1] + ", ");
            }
            if (arrayOfNumbers[j]<0){
                out.println("Превышено максимальное значение числа...");
                break;
            }
            out.print(arrayOfNumbers[j] = arrayOfNumbers[j - 1] + arrayOfNumbers[j - 2]);
            if(userInput - 1 != j){
                out.print(", ");
            }

            j++;
        }
        while (j<userInput);

        in.close();
    }
}