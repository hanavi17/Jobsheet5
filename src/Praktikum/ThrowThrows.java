/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ThrowThrows {
    public static void main(String[] args){
        //Membuat Instance Scanner Untuk Input Data
        Scanner input = new Scanner(System.in);
        int beras;
        System.out.println("Hendra Tolong Bawakan 3 karung beras dari gudang");
        try{
            System.out.print("Jumlah karung beras yang ingin dibawa: ");
            beras = input.nextInt();
            if(beras > 3){
                throw new Exception("Salah ambil mas");
            }else{
                System.out.println("Oke oke");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
