
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Beratbadanmain {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca input berat badan (kg) dan tinggi badan (m)
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = input.nextDouble();

        // Menghitung IMT
        double imt = beratBadan / (tinggiBadan * tinggiBadan);

        // Menentukan kriteria kegemukan
        String kriteria;
        if (imt < 18.5) {
            kriteria = "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt < 25) {
            kriteria = "Berat Badan Ideal";
        } else if (imt >= 25 && imt < 30) {
            kriteria = "Berat Badan Lebih";
        } else if (imt >= 30 && imt < 40) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }

        // Menampilkan hasil
        System.out.println("IMT: " + imt);
        System.out.println("Kriteria Kegemukan: " + kriteria);
    }
}
    
