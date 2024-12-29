import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;
public class example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        out.println("Введите развер массива");
        int size = in.nextInt();
        out.println("Размер массива равен "+ size);
        Integer[] nums = new Integer[size];
        for(int i = 0;i<nums.length;i++){
            nums[i] = rand.nextInt(200);
            out.println("Элемент массива "+ i +" = " + nums[i]);
        }
        Arrays.sort(nums, Collections.reverseOrder());
        out.println("Произведена сортировка массива");
        for(int i = 0;i<nums.length;i++){
            out.println("Элемент массива "+i+" после сортировки = "+nums[i]);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0;i<nums.length;i++){
            if(nums[i]<=min){
                min = nums[i];
            }
        }
        out.println("Минимальные значения находятся на следующих элементах массива: ");
        for (int i = 0;i<nums.length;i++){
            if(nums[i]==min){
                out.print(i+" ");
            }
        }
        out.println();


        in.close();
    }
}