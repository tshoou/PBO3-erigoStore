package erigostore;

import java.util.Scanner;

public class ErigoStore {
    
    static int harga;
    static String jenis;
    static int jumlah;
    static final int bajuA = 100000;
    static final int bajuB = 125000;
    static final int bajuC = 175000;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        display();  
        jenis = scan.next();
        System.out.print("Jumlah baju yang akan dibeli : ");
        jumlah = scan.nextInt();
        output(jenis);
    }
    static void display () {
        System.out.println("Baju yang tersedia :");
        System.out.println("Baju A dengan harga : " + bajuA);
        System.out.println("Baju B dengan harga : " + bajuB);
        System.out.println("Baju C dengan harga : " + bajuC);
        System.out.print("Baju yang akan anda beli bertipe : ");
    }
    static void hargaA () {
        if (jumlah>100) {
            harga = 95000;
        }
    }
    static void hargaB () { 
        if (jumlah>100) {
            harga = 120000;
        }
    }
    static void hargaC () {
        if (jumlah>100) {
            harga = 160000;
        }
    }
    // output program
    static void output(String jenis) {
        if (jenis.equalsIgnoreCase("a")) {
            hargaA();
        } else if (jenis.equalsIgnoreCase("b")) {
            hargaB();
        } else if (jenis.equalsIgnoreCase("c")){
            hargaC();
        } else {
            System.out.println("Input yang anda masukkan salah");
        }
        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.println("Harga per buah : " + harga);
        System.out.println("Total harga : " + harga*jumlah);
    }
}
