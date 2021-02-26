/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author WINDOWS 10
 */
public class Bus {
    
    //deklarasi
    public double penumpang;
    public double maxPenumpang;
    public double counter;
    public double average;
    public double penumpangBaru;
    //konstruktor dan parameter untuk penumpang maksimum
    public Bus(double maxpenumpang){
        this.maxPenumpang = maxpenumpang;
        penumpang = 0;
    }
    //variabel temp merupakan jumlah penumpang di dalam bus
    //variabel penumpang merupakan jumlah penumpang yang ditambahkan di main class
    public void addPenumpang(double penumpang){
        this.penumpangBaru = 0;
        this.penumpangBaru = penumpang;
        double temp;
        temp = this.penumpang+penumpang;
        //membatasi penumpang agar tidak > maxPenumpang
        if (temp > maxPenumpang){
            System.out.println("\n- Penumpang melebihi kuota -");
        }else{
            this.penumpang=temp;
        }
    }
    //password
    public void getPenumpang(int password){
        if(password == 24){
            System.out.println("Password benar");
        }else{
            System.out.println("Password salah");
        }
    }
    //method untuk berat penumpang (non-void) 
    public double getAverage(double berat){
        
        if(this.penumpang<=maxPenumpang){
            counter += berat*penumpangBaru;
            average = counter/penumpang;
            System.out.println("Berat Penumpang Bus = "+counter);
            System.out.println("Rata - rata Berat Penumpang Bus = "+average);
        }else{
            System.out.println("Berat Penumpang Bus = "+counter);
            System.out.println("Rata - rata Berat Penumpang Bus = "+average);
        }
        return berat;
    }
    
    //cetak
    public void cetakPenumpang(){
        System.out.println("\nPenumpang Bus Sekarang = "+penumpang);
        System.out.println("Maksimal Penumpang Yang Seharusnya Adalah = "+maxPenumpang);
    }
}