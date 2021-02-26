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
public class UjiBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objek baru dan maksimal penumpang
        Bus Bus = new Bus(5);
        
        //password
        Bus.getPenumpang(17);
        Bus.getPenumpang(24);
        Bus.cetakPenumpang();
        //penambahan penumpang
        Bus.addPenumpang(2); // tambah 2 penumpang dengan berat masing - masing 32
        Bus.cetakPenumpang();
        Bus.getAverage(32);
        //penambahan penumpang
        Bus.addPenumpang(1); //tambah 1 penumpang dengan berat 44
        Bus.cetakPenumpang();
        Bus.getAverage(44);
        //penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang dengan berat masing - masing 11
        Bus.cetakPenumpang();
        Bus.getAverage(31);
        //penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang dengan berat masing - masing 10
        Bus.cetakPenumpang();
        Bus.getAverage(10);
    }
}
