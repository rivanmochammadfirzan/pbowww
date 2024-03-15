/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akmal
 */
public class PersegiPanjang extends BangunDatar{
    PersegiPanjang(int p, int l){
        super(p, l);
    }
    
    int HitungLuas(){
        int p = super.getP();
        int l = super.getL();
        return p * l;
    }
    
    int HitungKeliling(){
        int p = super.getP();
        int l = super.getL();
        return 2 * (p + l);
    }
    public String toString(){
        String hasil = "Luas Bunjur Sangkar : " + HitungLuas() + "\n" +
        "Keliling Bunjur Sangkar : " + HitungKeliling();
        
        return hasil;
    }
}
