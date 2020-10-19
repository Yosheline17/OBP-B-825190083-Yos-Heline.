public class Perlengkapan {
    private float JumlahBrg;
    private float Harga;
    public int Saldo;
    private String NamaBrg;
    private float Bayar;



    //constructor menerima parameter
    public Perlengkapan( float Harga, float JumlahBrg, String NamaBrg) {
        this.Harga = Harga;
        this.JumlahBrg = JumlahBrg;
        this.NamaBrg = NamaBrg;

    }

    public String getNamaBrg() {
        return NamaBrg;
    }

    public void setNamaBrg(String namaBrg) {
        NamaBrg = namaBrg;
    }

    public float getJumlahBrg() {
        return JumlahBrg;
    }

    public void setJumlahBrg(float jumlahBrg) {
        JumlahBrg = jumlahBrg;
    }

    public float getHarga() {
        return Harga;
    }

    public void setHarga(float harga) {
        Harga = harga;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int saldo) {
        Saldo = saldo;
    }


    public float getBayar() {
        return Bayar;
    }

    public void setBayar(float bayar) {
        Bayar = bayar;
    }


    public float getArea() {return Harga * JumlahBrg;}
    public float getPerimeter(){
        return 2 * ( Saldo - getArea());
    }


    public String toString() {
        return "Perlengkapan[JumlahBrg="
                + JumlahBrg + ",Harga = " + Harga + ",NamaBrg = " + NamaBrg + "]";
    }

}
