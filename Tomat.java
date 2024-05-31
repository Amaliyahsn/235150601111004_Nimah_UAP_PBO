public class Tomat extends Tanaman implements Perawatan {
    public Tomat (int masaHidup, int lamaHidup, int berbuah, int buah, double perkembangan, double prosesBerbuah){
        super(masaHidup, lamaHidup, berbuah, buah, perkembangan, prosesBerbuah);
    }

    @Override
    public void berkembang() {
        
    }

    @Override
    public void treatment() {
       
    }
    @Override
    public String toString(){
    return "Masa Hidup Tanaman :" + getMasaHidup() + "Umur Tanaman : " + getLamaHidup() + "Buah yang dihasilkan" + getBerbuah() + " Status :" + status();
}
}
