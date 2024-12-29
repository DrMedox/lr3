import java.util.Scanner;
import static java.lang.System.*;

public class example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        out.print("Введите размер массива: ");
        int sizeOfArray = in.nextInt();
        int number=0;
        int[] ArrayOfNumbers = new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;number++){
            while (number%5==2){
                out.print(number);
                i++;
                if (i!=sizeOfArray){
                    out.print(", ");
                }
                break;
            }
        }
        out.println();
        number = 0;
        int j = 0;
        while(j<sizeOfArray){
            number++;
            while (number%5==2){
                out.print(number);
                j++;
                if (j!=sizeOfArray){
                    out.print(", ");
                }
                break;
            }
        }
        out.println();
        number = 0;
        int k = 0;
        do {
            number++;
            while (number % 5 == 2) {
                out.print(number);
                k++;
                if (k != sizeOfArray) {
                    out.print(", ");
                }
                break;
            }
        }
        while (k < sizeOfArray) ;

        in.close();
    }
}