/**
 *
 * @author akmal
 */
public class BangunDatar {
    
    private int p, l, s;
    
//    Kontsruktor untuk Bujur Sangkar
    BangunDatar(int s){
        this.s = s;
    }
    
//    Konstruktor untuk Persegi Panjang
    BangunDatar(int p, int l){
        this.p = p;
        this.l = l;
    }
    
//    Setter untuk panjang dan lebar
    void setPL(int p, int l){
        this.p = p;
        this.l = l;
    }
    
//    Setter untuk Sisi
    void setSisi(int s){
        this.s = s;
    }
    
//    Getter untuk Panjang
    int getP(){
        return p;
    }
    
//    Getter untuk Lebar
    int getL(){
        return l;
    }
    
//    Getter untuk Sisi
    int getSisi(){
        return s;
    }
}
