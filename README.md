# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data pegawai menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama, id, jabatan, dan gaji bulanan pegawai, dan memberikan output berupa informasi detail dari pegawai tersebut seperti nama, id, jabatan, dan gaji bulanan serta status pegawai tersebut.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Pegawai`, `PegawaiTetap`, dan `PegawaiBeraksi` adalah contoh dari class.

```bash
public class Pegawai {
    ...
}

public class PegawaiTetap extends Pegawai {
    ...
}

public class PegawaiBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftar[index] = new PegawaiTetap(nama, id, jabatan, gaji);` adalah contoh pembuatan object.

```bash
daftar[index] = new PegawaiTetap(nama, id, jabatan, gaji);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `id`, `jabatan`, dan `gajiBulanan` adalah contoh atribut.

```bash
String nama;
String id;
String jabatan;
int gajiBulanan;

```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Pegawai` dan `PegawaiTetap`.

```bash
public Pegawai(String nama, String id, String jabatan) {
        this.nama = nama;
        this.id = id;
        this.jabatan = jabatan;
}

public PegawaiTetap(String nama, String id, String jabatan, int gajiBulanan) {
        super(nama, id, jabatan);
        this.gajiBulanan = gajiBulanan;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setId`, `setJabatan`, dan `setGajiBulanan` adalah contoh method mutator.

```bash
public void setId(String id) {
    this.id = id;
}

public void setJabatan(String jabatan) {
    this.jabatan = jabatan;
}

 public void setGajiBulanan(int gajiBulanan) {
        this.gajiBulanan = gajiBulanan;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getId`, `getJabatan`, dan `getGajiBulanan` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getId() {
    return id;
}

public String getJabatan() {
    return jabatan;
}

public int getGajiBulanan() {
    return gajiBulanan;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `id`, `jabatan`, dan `gajiBulanan` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private final String nama;
private String id;
private String jabatan;
private int gajiBulanan;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Pegawai` mewarisi `PegawaiTetap` dengan sintaks `extends`.

```bash
public class Pegawai extends PegawaiTetap {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo()` di `Pegawai` merupakan overloading method `tampilkanInfo` di `PegawaiTetap` merupakan override dari method `tampilkanInfo` di `Pegawai`.

```bash
public void tampilkanInfo() {
    System.out.println("Nama: " + nama);
    System.out.println("ID: " + id);
    System.out.println("Jabatan: " + jabatan);
}

@Override
public void tampilkanInfo() {
    super.tampilkanInfo();  
    System.out.println("Gaji Bulanan: Rp " + gajiBulanan);
}

```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if` dalam method `getGajiBulanan`.

```bash
if (pegawai.getGajiBulanan() >= 10000000) {
                System.out.println(">> Status: Pegawai senior");
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
while (index < daftar.length) {
    try {
        ...
        daftar[index] = new PegawaiTetap(nama, id, jabatan, gaji);
        ...
        index++;
    } catch (NumberFormatException e) {
        System.out.println(">> Input angka tidak valid, silakan ulangi.\n");
    }
}

for (PegawaiTetap peg : daftar) {
    peg.tampilkanInfo();
    if (peg.getGajiBulanan() >= 10000000) {
        System.out.println(">> Status: Pegawai senior");
    }
    System.out.println();
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);

System.out.print("Masukkan Nama: ");
String nama = input.nextLine();

System.out.print("Masukkan ID: ");
String id = input.nextLine();

System.out.print("Masukkan Jabatan: ");
String jabatan = input.nextLine();

System.out.print("Masukkan Gaji Bulanan: ");
int gaji = Integer.parseInt(input.nextLine());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
while (index < daftar.length) {
    try {
        // Input data pegawai
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan ID: ");
        String id = input.nextLine();

        System.out.print("Masukkan Jabatan: ");
        String jabatan = input.nextLine();

        System.out.print("Masukkan Gaji Bulanan: ");
        int gaji = Integer.parseInt(input.nextLine());  // POTENSI ERROR!

        daftar[index] = new PegawaiTetap(nama, id, jabatan, gaji);
        System.out.println(">> Data berhasil ditambahkan!\n");
        index++;

    } catch (NumberFormatException e) {
        System.out.println(">> Input angka tidak valid, silakan ulangi.\n");
    }
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Nisa Fajriyaturrahmah
NPM: 2310010551
