package timus;
import java.util.Scanner;
import java.io.PrintWriter;
import static java.lang.System.out;
public class task_1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int code1 = in.nextInt();
        int code2 = in.nextInt();
        if(code1%2==0 || code2%2!=0){
            out.println("yes");
        }
        else{
            out.println("no");
        }
        in.close();
    }
}