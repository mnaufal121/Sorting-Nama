
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asus
 */
public class Tugas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] sort;
        int temp = 0;       //variabel bantu ke 1
        int selected = 0;   //variabel bantu ke 2
        //proses input jumlah data
        System.out.println("Jumlah angka yang ingin diacak: ");
        int data = sc.nextInt();
        sort = new int[data];
        for (int i = 0; i < data; i++) {
            sort[i] = r.nextInt(50);
        }
        System.out.println("Sebelum Disorting :");
        for (int i = 0; i < data; i++) {
            System.out.print(sort[i] + " ");
        }
        //proses sorting
        for (int i = 0; i < sort.length - 1; i++) {
            selected = sort[i];
            for (int j = i + 1; j < sort.length; j++) {
                if (selected > sort[j]) {
                    temp = sort[j];
                    sort[j] = selected;
                    selected = temp;
                }
            }
            sort[i] = selected;
        }
//        for (int i = 0; i < sort.length; i++) {
//            for (int j = 0; j < sort.length - i - 1; j++) {
//                if (sort[j] > sort[j + 1]) {
//                    temp = sort[j];
//                    sort[j] = sort[j + 1];
//                    sort[j + 1] = temp;
//                }
//            }
//        }
        System.out.println("Setelah Disorting :");
        for (int i = 0; i < data; i++) {
            System.out.print(sort[i] + " ");
        }
    }
}
