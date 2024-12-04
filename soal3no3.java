package ukl2024;


public class soal3no3 {
    public static void main(String[] args) {
        count();
    }
    
    public static void count() {
    
        int[] numbers = { 3, 7, 1, 3, 7, 7, 5};
        int max = numbers[0];
    
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
 
    
        int[] frequent = new int[max];
    
        for (int i = 0; i < numbers.length; i++) {
            frequent[numbers[i] - 1]++;
        }
       
        int often = 0;
        int index = 0;
        for (int i = 0; i < frequent.length; i++) {
            if (frequent[i] > often) {
                often = frequent[i];
                index = i;
            }
        }

        System.out.println("Elemen yang paling sering muncul adalah " + (index + 1) + " sebanyak " + frequent[index]);
    }
}
