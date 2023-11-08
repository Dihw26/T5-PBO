
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Pembelian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Total pembelian Rp. = ");
        double totalPembelian = input.nextDouble();
       
        double potongan;
        if (totalPembelian < 50000) {
            potongan = 0.05 * totalPembelian;
        } else {
            potongan = 0.2 * totalPembelian;
        }
        
        double jumlahHarusDibayarkan = totalPembelian - potongan;

        System.out.println("Besarnya potongan Rp. " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. " + jumlahHarusDibayarkan);
    }
}
    
}
