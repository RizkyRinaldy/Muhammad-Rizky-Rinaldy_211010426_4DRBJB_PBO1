package Pbo;

//class
public class DataDiri {
    //atribut dan encapculation
    private String nik;
    private String nama;
    private String alamat;
    //construktor
    public DataDiri(String nik, String nama, String alamat) {
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
    }

    //setter
    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

 
    //getter
    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
    
    
    public String displayInfo() {
        return "NIK = "+getNik()+ "\nNama = "+getNama()+ "\nAlamat = "+getAlamat();
    }
    
    //polymortisme(overloding)
    public String displayInfo(String telpon){
        return displayInfo()+"\ntelpon = "+telpon;
    }
}
