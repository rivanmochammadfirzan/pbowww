
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akmal
 */
public class HitungBangunDatar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Bujur Sangkar");
        System.out.println("2. Persegi Panjang");
        System.out.println("-----Isikan Pilihan Anda-----");
        
        int pilihan = sc.nextInt();
        if(pilihan == 1){
            System.out.print("Maukkan Nilai Sisi : ");
            BujurSangkar bs = new BujurSangkar(sc.nextInt());
            System.out.println(bs);
        }else if(pilihan == 2) {
            System.out.print("Maukkan Nilai Panjang : ");
            int p = sc.nextInt();
            System.out.print("Maukkan Nilai Lebar : ");
            int l = sc.nextInt();
            PersegiPanjang bs = new PersegiPanjang(p,l);
            System.out.println(bs);
        }
    }
}
