package uas;

public class Pegawai {
    // Atribut
    private final String nama;
    private String id;
    private String jabatan;

    // Constructor
    public Pegawai(String nama, String id, String jabatan) {
        this.nama = nama;
        this.id = id;
        this.jabatan = jabatan;
    }

    // Getter (Accessor)
    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public String getJabatan() {
        return jabatan;
    }

    // Setter (Mutator)
    public void setId(String id) {
        this.id = id;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    // Method tampilkan info pegawai
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("ID: " + id);
        System.out.println("Jabatan: " + jabatan);
    }
}
