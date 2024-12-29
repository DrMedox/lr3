import java.util.Scanner;
import static java.lang.System.*;

public class example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0, number=0;
        out.print("Введите количество чисел, которые Вы хотите увидеть: ");
        int userInput = in.nextInt();
        for (int i=0;i<userInput;number++){
            while (number%5==2 || number%3==1){
                out.print(number);
                sum+=number;
                i++;
                if (i!=userInput){
                    out.print(" + ");
                }
                break;
            }
        }
        out.println(" = " + sum);

        sum=0;
        number=0;
        int j = 0;
        while(j<userInput){
            number++;
            while (number%5==2 || number%3==1){
                out.print(number);
                sum+=number;
                j++;
                if (j!=userInput){
                    out.print(" + ");
                }
                break;
            }
        }
        out.println(" = " + sum);

        sum=0;
        number=0;
        int k = 0;
        do{
            number++;
            while (number%5==2 || number%3==1){
                out.print(number);
                sum+=number;
                k++;
                if (k !=userInput){
                    out.print(" + ");
                }
                break;
            }
        }
        while(k <userInput);
        out.println(" = " + sum);

        in.close();
    }
}