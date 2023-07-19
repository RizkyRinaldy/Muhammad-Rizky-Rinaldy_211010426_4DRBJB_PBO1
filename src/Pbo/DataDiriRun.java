package Pbo;

import java.util.Scanner;

public class DataDiriRun {
    public static void main(String[] args) {
        try{
        //io sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
        DataDiriDetail[] biodata = new DataDiriDetail[2];
        
        //perulangan
        for(int i =0; i<biodata.length;i++){  
        System.out.print(" Masukkan NIK "+(i+1)+" = ");
        String nik = scanner.nextLine();
        System.out.print(" Masukkan NAMA "+(i+1)+" = ");
        String nama = scanner.nextLine();
        System.out.print(" Masukkan ALAMAT "+(i+1)+" = ");
        String alamat = scanner.nextLine();
        
        //objek
        biodata[i] = new DataDiriDetail(nik,nama,alamat);
        }
        
        //perulangan
        for(DataDiriDetail data : biodata) {
            System.out.println("====================");
            System.out.println("Data Diri = ");
            System.out.println(data.displayInfo());
        }
    }   catch(NumberFormatException e ) {
            System.out.println("Kesalahan Format Nomor "+e.getMessage());
    }   catch(StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format NIK "+e.getMessage());
    }
        catch (Exception e){
        System.out.println("Kesalahan Umum"+e.getMessage());
    }
  }    
}
