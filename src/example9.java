import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;
public class example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        out.println("Введите развер массива");
        int size = in.nextInt();
        out.println("Размер массива равен "+ size);
        int[] nums = new int[size];
        for(int i = 0;i<nums.length;i++){
            nums[i] = rand.nextInt(200);
            out.println("Элемент массива "+ i +" = " + nums[i]);
        }
        Arrays.sort(nums);
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


        int j = 0;
        while (j<nums.length)
        {
            nums[j] = rand.nextInt(200);
            out.println("Элемент массива "+ j +" = " + nums[j]);
            j++;
        }
        j=0;
        Arrays.sort(nums);
        out.println("Произведена сортировка массива");
        while(j<nums.length){
            out.println("Элемент массива "+j+" после сортировки = "+nums[j]);
            j++;
        }

        min = Integer.MAX_VALUE;
        j=0;
        while(j<nums.length){
            if(nums[j]<=min){
                min = nums[j];
            }
            j++;
        }
        out.println("Минимальные значения находятся на следующих элементах массива: ");
        j=0;
        while(j<nums.length){
            if(nums[j]==min){
                out.print(j+" ");
            }
            j++;
        }
        out.println();


        j = 0;
        do{
            nums[j] = rand.nextInt(200);
            out.println("Элемент массива "+ j +" = " + nums[j]);
            j++;
        }
        while (j<nums.length);

        j=0;
        Arrays.sort(nums);
        out.println("Произведена сортировка массива");
        do{
            out.println("Элемент массива "+j+" после сортировки = "+nums[j]);
            j++;
        }
        while(j<nums.length);

        min = Integer.MAX_VALUE;
        j=0;
        do{
            if(nums[j]<=min){
                min = nums[j];
            }
            j++;
        }
        while(j<nums.length);
        out.println("Минимальные значения находятся на следующих элементах массива: ");
        j=0;
        do{
            if(nums[j]==min){
                out.print(j+" ");
            }
            j++;
        }
        while(j<nums.length);

        in.close();
    }
}
