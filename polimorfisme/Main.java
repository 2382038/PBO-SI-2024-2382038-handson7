package polimorfisme;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar;
        bangunDatar = new Persegi(4);
        System.out.println("Luas persegi : " + bangunDatar.luas());
        System.out.println("Keliling persegi : " + bangunDatar.keliling());

        bangunDatar = new Lingkaran(7);  // radius lingkaran
        System.out.println("Luas lingkaran : " + bangunDatar.luas());
        System.out.println("Keliling lingkaran : " + bangunDatar.keliling());

        bangunDatar = new SegitigaSamaSisi(5);  // sisi segitiga
        System.out.println("Luas segitiga sama sisi : " + bangunDatar.luas());
        System.out.println("Keliling segitiga sama sisi : " + bangunDatar.keliling());
}
}
