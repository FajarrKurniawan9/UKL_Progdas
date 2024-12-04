package ukl2024;

public class soal1no3 {
    public static void main(String[] args) {
        for (int i = 50; i >= 1; i--) {
        if (i == 1) {
            System.out.println(i + "." + " Saya Senang");
        } else if (i % 3 == 0) {
                System.out.println(i + "." + " Saya Angkatan 33");
            } else if (i % 2 == 0) {
                System.out.println(i + "." + " Saya Anak Moklet");
            } else {
                System.out.println(i + "." + " Saya Anak Wikusama");
            }
        }
        
    }
}
