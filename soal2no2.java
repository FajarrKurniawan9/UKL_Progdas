package ukl2024;

import java.util.Scanner;

public class soal2no2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jariJari;
        System.out.println("Rumus LuasPermukaanBola = 4 * 3.14 * Jari-Jari^2");
        System.out.print("Masukkan bilangan jari-jarinya : ");
        jariJari = input.nextDouble();
        luasPermukaanBola(jariJari);
        System.out.println("Masukkan bilangan jari-jari untuk menghitung luasLingkaran : ");
        double jari = input.nextDouble();
        luasLingkaran(jari);
     
        input.close();
    }
    
    public static double luasPermukaanBola(double jariJari) {
        double diameter = jariJari + jariJari;
        double luasPermukaanBola = 4 * 3.14 * diameter;
        System.out.println("Hasilnya : " + luasPermukaanBola);
        return luasPermukaanBola;
    }
    public static double luasLingkaran(double jari){  
        double luasLingkaran = 3.14 * jari + jari;
        System.out.println("Hasil luasLingkaran : " + luasLingkaran);
        return luasLingkaran;
    }
}
