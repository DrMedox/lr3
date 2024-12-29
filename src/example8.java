import java.util.*;

import static java.lang.System.out;

public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] ArrayOfSymbols = new char[10];
        char a = 'A';
        for (int i = 0; i < 10; i++){
                switch (a){
                    case 'A':
                        a++;
                        i--;
                        break;
                    case 'E':
                        a++;
                        i--;
                        break;
                    case 'I':
                        a++;
                        i--;
                        break;
                    case 'O':
                        a++;
                        i--;
                        break;
                    case 'U':
                        a++;
                        i--;
                        break;
                    case 'Y':
                        a++;
                        i--;
                        break;
                    default:
                        ArrayOfSymbols[i] = a;
                        a++;
                        out.print(ArrayOfSymbols[i] + "\t");
                }
            }
        out.println();
        a = 'A';
        int j = 0;
        while (j<10){
            switch (a){
                case 'A':
                    a++;
                    j--;
                    break;
                case 'E':
                    a++;
                    j--;
                    break;
                case 'I':
                    a++;
                    j--;
                    break;
                case 'O':
                    a++;
                    j--;
                    break;
                case 'U':
                    a++;
                    j--;
                    break;
                case 'Y':
                    a++;
                    j--;
                    break;
                default:
                    ArrayOfSymbols[j] = a;
                    a++;
                    out.print(ArrayOfSymbols[j] + "\t");
            }
            j++;
        }
        out.println();
        a = 'A';
        j = 0;
        do{
            switch (a){
                case 'A':
                    a++;
                    j--;
                    break;
                case 'E':
                    a++;
                    j--;
                    break;
                case 'I':
                    a++;
                    j--;
                    break;
                case 'O':
                    a++;
                    j--;
                    break;
                case 'U':
                    a++;
                    j--;
                    break;
                case 'Y':
                    a++;
                    j--;
                    break;
                default:
                    ArrayOfSymbols[j] = a;
                    a++;
                    out.print(ArrayOfSymbols[j] + "\t");
            }
            j++;
        }
        while (j<10);
        in.close();
        }
    }
