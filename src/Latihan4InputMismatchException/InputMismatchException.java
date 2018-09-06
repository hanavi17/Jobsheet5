/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4InputMismatchException;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class InputMismatchException {
    public static void main(String[] args) {
        int a = 100;
        System.out.print("Masukkan nilai b : ");
        Scanner console = new Scanner(System.in);
        int b = console.nextInt();
        
        System.out.print("Masukkan nilai c : ");
        int c = console.nextInt();
        double res=b/c;
        System.out.println("Hasilnya adalah : "+res);
    }
}
