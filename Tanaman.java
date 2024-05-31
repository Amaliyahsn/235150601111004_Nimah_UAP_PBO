public abstract class Tanaman {
    private int masaHidup;
    private int lamaHidup;
    private int berbuah;
    private int buah;
    private double perkembangan;
    private double prosesBerbuah;

    public Tanaman(int masaHidup, int lamaHidup, int berbuah, int buah, double perkembangan, double prosesBerbuah) {
       this.masaHidup = masaHidup;
       this.lamaHidup = lamaHidup;
       this.berbuah = berbuah;
       this.buah = buah;
       this.perkembangan = perkembangan;
       this.prosesBerbuah = prosesBerbuah;

    }
    public abstract void berkembang();

    public String status(){
        return "Masa Hidup : " + masaHidup + " tahun\n";
    }

    @Override
    public String toString(){
    return "Masa Hidup Tanaman :" + getMasaHidup() + "Umur Tanaman : " + getLamaHidup() + "Buah yang dihasilkan" + getBerbuah() + " Status :" + status();
}

    public int getMasaHidup() {
        return masaHidup;
    }
    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }
    public int getLamaHidup() {
        return lamaHidup;
    }
    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }
    public int getBerbuah() {
        return berbuah;
    }
    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }
    public int getBuah() {
        return buah;
    }
    public void setBuah(int buah) {
        this.buah = buah;
    }
    public double getPerkembangan() {
        return perkembangan;
    }
    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }
    public double getProsesBerbuah() {
        return prosesBerbuah;
    }
    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }

}