package pewarisan;

public class Mobil extends Kendaraan {
    private int jumlahPimtu;
    private String jenisBahanBakar;

    public Mobil(String merek, String model, int tahunProduksi, int jumlahPimtu, String jenisBahanBakar) {
        super(merek, model, tahunProduksi);
        this.jumlahPimtu = jumlahPimtu;
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public void tampilkanInfoMobil() {
        super.tampilkanInfo();
        System.out.println("Jumlah PIntu : " + jumlahPimtu);
        System.out.println("Jenis Bahan Bakar : " + jenisBahanBakar);

    }
}