# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `DataDIri`, `DataDiriDetail`, dan `DataDiriRun` adalah contoh dari class.

```bash
public class DataDiri {
    ...
}

public class DataDiriDetail extends DataDiri {
    ...
}

public class DataDiriRun {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `biodata[i] = new DataDiriDetail(nik,nama,alamat);` adalah contoh pembuatan object.

```bash
biodata[i] = new DataDiriDetail(nik,nama,alamat);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nik`, `nama`  dan `alamat` adalah contoh atribut.

```bash
String nik;
String nama;
String alamat;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Datadiri` dan `DataDiriDetail`.

```bash
 public DataDiri(String nik, String nama, String alamat) {
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
    }

public DataDiriDetail(String nik, String nama, String alamat) {
        super(nik, nama, alamat);
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNik`, `setNama` dan `setAlamat` adalah contoh method mutator.

```bash
 public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNik`, `getNama`, `getAlamat`, `getTempatLahir`, `getTanggalLahir`, , `getBulanLahir`, `getTahunLahir`  dan `getKeluarga` adalah contoh method accessor.

```bash
public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nik`, `nama` dan `alamat` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    private String nik;
    private String nama;
    private String alamat;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `DataDiriDetail` mewarisi `DataDiri` dengan sintaks `extends`.

```bash
public class DataDiriDetail extends DataDiri{
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `DataDiri` merupakan overloading method `displayInfo` dan `displayInfo` di `DataDiriDetail` merupakan override dari method `displayInfo` di `DataDiri`.

```bash
public String displayInfo() {
        return "NIK = "+getNik()+ "\nNama = "+getNama()+ "\nAlamat = "+getAlamat();
    }
    
    //polymortisme(overloding)
    public String displayInfo(String telpon){
        return displayInfo()+"\ntelpon = "+telpon;
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `getTempatLahir`, `getBulanLahir` dan `getKeluarga`.

```bash
public String getTempatLahir(){
        String kodeKabupaten = getNik().substring(0, 4);
        //seleksi swicth
        switch(kodeKabupaten) {
            case "6306":
                return "Kandangan";
            case "6305":
                return "Tapin";
            case "6307":
                return "Barabai";
            default:
                return "Kabupaten Lain";
        }
  }

public String getBulanLahir(){
        String urutankeluarga = getNik().substring(6, 8);
        //seleksi swicth
        switch(urutankeluarga) {
            case "01":
                return "Januari";
            case "02":
                return "Februari";
            case "03":
                return "Maret";
            case "04":
                return "April";
            case "05":
                return "Mei";
            case "06":
                return "Juni";
            case "07":
                return "Juli";
            case "08":
                return "Agustus";
            case "09":
                return "September";
            case "10":
                return "Oktober";
            case "11":
                return "November";
            case "12":
                return "Desember";
            default:
                return "Tidak Diketahui";
         }
    }

public String getKeluarga(){
        String urutankeluarga = getNik().substring(12, 14);
        //seleksi swicth
        switch(urutankeluarga) {
            case "01":
                return "Ayah";
            case "02":
                return "Ibu";
            case "03":
                return "Anak Pertama";
            case "04":
                return "Anak Kedua";
            case "05":
                return "Anak Ketiga";
            default:
                return "Dan Seterusnya";
         }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i =0; i<biodata.length;i++) { 
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
 Scanner scanner = new Scanner(System.in);
        System.out.print(" Masukkan NIK "+(i+1)+" = ");
        String nik = scanner.nextLine();
        System.out.print(" Masukkan NAMA "+(i+1)+" = ");
        String nama = scanner.nextLine();
        System.out.print(" Masukkan ALAMAT "+(i+1)+" = ");
        String alamat = scanner.nextLine();

        for(DataDiriDetail data : biodata) {
            System.out.println("====================");
            System.out.println("Data Diri = ");
            System.out.println(data.displayInfo());
        }
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
 DataDiriDetail[] biodata = new DataDiriDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    catch(NumberFormatException e ) {
            System.out.println("Kesalahan Format Nomor "+e.getMessage());
    }   catch(StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format NIK "+e.getMessage());
    }
        catch (Exception e){
        System.out.println("Kesalahan Umum"+e.getMessage());
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

Nama: Muhammad Rizky Rinaldy 
NPM: 2110010426
