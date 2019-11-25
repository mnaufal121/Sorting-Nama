/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Driver {

    public static void main(String[] args) {
        input in = new input();
        in.inputData();
    }
}

class input {

    public void inputData() {
        String nama[];
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Batas Data Nama : ");
        int data = sc.nextInt();
        sc.nextLine();
        nama = new String[data];
        for (int i = 0; i < data; i++) {
            System.out.print("Masukkan Nama ke-" + (i + 1) + " : ");
            nama[i] = sc.nextLine();
        }
        System.out.println("");
        sorting sort = new sorting();
        System.out.println("Pilih Metode Sorting\n1. Bubble Sorting\t2. Selection Sorting");
        System.out.print("Masukkan Pilihan : ");
        int metode = sc.nextInt();
        switch (metode) {
            case 1:
                System.out.println("");
                sort.bubbleSorting(nama);
                break;
            case 2:
                System.out.println("");
                sort.selectionSorting(nama);
                break;
            default:
                System.out.println("Tidak ada pililhan");
                inputData();
        }
    }

}

class sorting {

    public void bubbleSorting(String nama[]) {
        System.out.println("Setelah disorting : ");
        for (int i = 0; i < nama.length; i++) {
            for (int j = i + 1; j < nama.length; j++) {
                if (nama[i].compareTo(nama[j]) > 0) {
                    String temp = nama[j];
                    nama[j] = nama[i];
                    nama[i] = temp;
                }
            }
        }
        for (int i = 0; i < nama.length; i++) {
            System.out.println((i + 1) + ". " + nama[i] + " ");
        }
    }

    public void selectionSorting(String nama[]) {
        int selected = 0;
        System.out.println("Setelah disorting : ");
        for (int i = 0; i < nama.length - 1; i++) {
            selected = i;
            for (int j = i + 1; j < nama.length; j++) {
                if (nama[j].compareTo(nama[selected]) < 0) {
                    selected = j;
                }
            }
            String temp = nama[selected];
            nama[selected] = nama[i];
            nama[i] = temp;
        }
        for (int i = 0; i < nama.length; i++) {
            System.out.println((i + 1) + ". " + nama[i] + " ");
        }
    }
}
