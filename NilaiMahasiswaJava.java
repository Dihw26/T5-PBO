
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class NilaiMahasiswaJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("NPM : ");
        String npm = input.nextLine();
        System.out.print("Nama Mahasiswa : ");
        String namaMahasiswa = input.nextLine();
        System.out.print("Nilai Kehadiran : ");
        double nilaiKehadiran = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS : ");
        double nilaiUts = input.nextDouble();
        System.out.print("Nilai UAS : ");
        double nilaiUas = input.nextDouble();

        double nilaiAbsen = (10 / 100) * nilaiKehadiran;
        double nilaiAkhir = (0.1 * nilaiAbsen) + (0.2 * nilaiTugas) + (0.3 * nilaiUts) + (0.4 * nilaiUas);

        String grade;
        String keterangan;
        if (nilaiAkhir <= 45) {
            grade = "E";
            keterangan = "KURANG SEKALI";
        } else if (nilaiAkhir <= 55) {
            grade = "D";
            keterangan = "KURANG";
        } else if (nilaiAkhir <= 65) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir <= 75) {
            grade = "B";
            keterangan = "BAIK";
        } else {
            grade = "A";
            keterangan = "ISTIMEWA";
        }

        // Menampilkan tampilan output
        System.out.println("NPMMahasiswa : " + npm);
        System.out.println("Nama Mahasiswa : " + namaMahasiswa);
        System.out.println("Nilai Rata-rata : " + nilaiAkhir);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);
    }
}

