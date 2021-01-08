// Coded by Syahrul R.
package projectSyahrulR;

// mengimpor Scanner ke program
import java.util.Scanner;

public class InputBiodata {
    public static void main(String[] args){
        // deklarasi variable
        String nama, pendidikan, alamat;
        int usia, gaji;

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // output untuk user
        System.out.println("===============================");
        System.out.println("PENDATAAN KARYAWAN");
        System.out.println("Nama : ");
        nama = keyboard.nextLine();
        System.out.println("Pendidikan: ");
        pendidikan = keyboard.nextLine();
        System.out.println("Alamat: ");
        alamat = keyboard.nextLine();
        System.out.println("Usia: ");
        usia = keyboard.nextInt();
        System.out.println("Gaji: ");
        gaji = keyboard.nextInt();


        // output yang di inputkan user
        System.out.println("---------------------------");
        System.out.println("Nama : " + nama);
        System.out.println("Pendidikan : " + pendidikan);
        System.out.println("Usia : " + usia + "th");
        System.out.println("Alamat : " + alamat);
        System.out.println("Gaji : " + gaji);
        System.out.println("---------------------------");
    }
}
