/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akmal
 */
public class BujurSangkar extends BangunDatar{
    BujurSangkar(int s){
        super(s);
    }
    
//    Hitung Luas Bujur Sangkar
    int HitungLuas(){
        int s = super.getSisi();
        return s * s;
    }
    
//    Hitung Keliling Bujur Sangkar
    int HitungKeliling(){
        int s = super.getSisi();
        return 4 * s;
    }
    
    public String toString(){
        String hasil = "Luas Persegi Panjang : " + HitungLuas() + "\n" +
        "Keliling Persegi Panjang : " + HitungKeliling();
        
        return hasil;
    }
}
