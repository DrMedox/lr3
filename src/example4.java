import java.util.Scanner;
import static java.lang.System.*;

public class example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNumber = in.nextInt();
        int lastNumber = in.nextInt();
        int buffer;
        if (lastNumber<firstNumber){
            buffer = lastNumber;
            lastNumber = firstNumber;
            firstNumber = buffer;
        }

        for(int i = firstNumber;i<lastNumber+1;i++){
            out.print(i+" ");
        }

        out.println();

        int j = firstNumber;
        while(j<=lastNumber){
            out.print(j + " ");
            j++;
        }

        out.println();

        j = firstNumber;
        do{
            out.print(j + " ");
            j++;
        }
        while(j<=lastNumber);
        in.close();
    }
}