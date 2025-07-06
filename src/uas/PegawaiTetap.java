package uas;

// Inheritance
public class PegawaiTetap extends Pegawai {
    private int gajiBulanan;

    // Constructor
    public PegawaiTetap(String nama, String id, String jabatan, int gajiBulanan) {
        super(nama, id, jabatan);
        this.gajiBulanan = gajiBulanan;
    }

    // Getter dan Setter
    public int getGajiBulanan() {
        return gajiBulanan;
    }

    public void setGajiBulanan(int gajiBulanan) {
        this.gajiBulanan = gajiBulanan;
    }

    // Polymorphism override tampilkan info
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Gaji Bulanan: Rp " + gajiBulanan);
    }
}
