import java.util.Scanner;
import static java.lang.System.*;

public class example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        out.print("Введите размер массива: ");
        int sizeOfArray = in.nextInt();
        char[] ArrayOfSymbols = new char[sizeOfArray];
        char a = 'a';

        for (int i = 0; i < sizeOfArray; i++){
            ArrayOfSymbols[i] = a;
            a +=2;
            out.print(ArrayOfSymbols[i] + "\t");
        }
        out.println();
        for (int i = sizeOfArray - 1; i >= 0; i--){
            out.print(ArrayOfSymbols[i] + "\t");
        }
        out.println();
        int j=0;
        a = 'a';
        while(j<sizeOfArray){
            ArrayOfSymbols[j]= a;
            a +=2;
            out.print(ArrayOfSymbols[j]+ "\t");
            j++;
        }
        out.println();
        int k = sizeOfArray-1;
        while(k>=0){
            out.print(ArrayOfSymbols[k] + "\t");
            k--;
        }
        out.println();
        j=0;
        a = 'a';
        do{
            ArrayOfSymbols[j]= a;
            a +=2;
            out.print(ArrayOfSymbols[j]+ "\t");
            j++;
        }
        while(j<sizeOfArray);
        k=sizeOfArray-1;
        out.println();
        do{
            out.print(ArrayOfSymbols[k] + "\t");
            k--;
        }
        while(k>=0);

        in.close();
    }
}