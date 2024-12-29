package timus;
import java.util.Scanner;
import java.io.PrintWriter;

public class task_2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int numberOfTasks = in.nextInt();
        int difference = 12 - numberOfTasks;

        int time = difference*45;
        out.println("необходимое время для решение " + difference + " задач = " + time);
        if(time<=240){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        out.flush();
    }
}
