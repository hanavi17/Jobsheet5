/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author USER
 */
public class TryCatchFinally {
    public static void main(String[] args) {
        try{
           int angka = 100;
           int hasil = angka/0;
           System.out.println(hasil);
        }catch(ArithmeticException ex){
            System.out.println("Tidak Boleh Menggunakan Pembagian dengan 0");
        }finally{
            System.out.println("Selesai");
        }
    }
}
