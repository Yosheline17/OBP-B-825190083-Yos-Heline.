public class Pembayaran {
    private float Nama;
    private float Saldo;
    private float Bayar;


    public Pembayaran( float Saldo, float Bayar){

        this.Saldo = Saldo;
        this.Bayar = Bayar;
    }

    public float getNama() {
        return Nama;
    }

    public void setNama(float nama) {
        Nama = nama;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float saldo) {
        Saldo = saldo;
    }

    public float getBayar() {
        return Bayar;
    }

    public void setBayar(float bayar) {
        Bayar = bayar;
    }

    public float getPerimeter(){
        if(Saldo < Bayar)
            System.out.println("Error : Saldo anda tidak cukup. " +
                    "Silahkan isi ulang saldo anda.");
        else
            Saldo = Saldo - Bayar;
        return Saldo;
    }



    public String toString() {
        return "Pembayaran[Nama= " + Nama + ",Saldo= " + Saldo + ",Bayar= " + Bayar + " ]";
    }
}

