package ukl2024;
// import java.util.ArrayList;

public class soal3no3 {
    public static void main(String[] args) {
        count();
    }
    
    public static void count() {
        
        // ArrayList list = new ArrayList();
        // ArrayList frequent = new ArrayList();
        // count();
        // list = {2,5,5,6,3,1,5};
        // count(numbers);
        int[] numbers = { 3, 7, 1, 3, 7, 7, 5};
        // int min = numbers[0];
        int max = numbers[0];
    
        for (int i = 0; i < numbers.length; i++) {
            // if (numbers[i] < min) {
            // min = numbers[i];
            // }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        // System.out.println(min);
        // System.out.println(max);
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.print(numbers[i] + " , ");
        // }
        // System.out.println();
    
        int[] frequent = new int[max];
        // for (int i = 0; i < frequent.length; i++) {
        //     System.out.print(frequent[i] + " , ");
        // }
        // System.out.println();
    
        for (int i = 0; i < numbers.length; i++) {
            frequent[numbers[i] - 1]++;
        }
        // System.out.println();
        // System.out.println(frequent.length);
        // System.out.println();
        // for (int i = 0; i < frequent.length; i++) {
        //     System.out.print(frequent[i] + " , ");
        // }
        // System.out.println();
    
        int often = 0;
        int index = 0;
        for (int i = 0; i < frequent.length; i++) {
            if (frequent[i] > often) {
                often = frequent[i];
                index = i;
            }
        }
        // System.out.println();
        System.out.println("Elemen yang paling sering muncul adalah " + (index + 1) + " sebanyak " + frequent[index]);
    }
}
