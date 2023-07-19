package Pbo;

//inheritance
public class DataDiriDetail extends DataDiri{
     //overriding
    public DataDiriDetail(String nik, String nama, String alamat) {
        super(nik, nama, alamat);
    }
    
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
    
    public int getTanggalLahir(){
          return Integer.parseInt(getNik().substring(4, 6));   
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
    
    public int getTahunLahir(){
          return Integer.parseInt(getNik().substring(8, 12));   
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
   //polymortisme(override)
    @Override
    public String displayInfo(){
            return super.displayInfo()+
            "\nKabupaten = "+getTempatLahir()+
            "\nTanggal Lahir = "+getTanggalLahir()+ " "+getBulanLahir()+ " "+getTahunLahir()+
            "\nUrutan Keluarga = "+getKeluarga();
            
        }
    }

     

