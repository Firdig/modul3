package org.example;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi 1: ");
        double sisi1 = input.nextDouble(); // untuk memasukkan nilai dari sisi 1
        System.out.print("Masukkan panjang sisi 2: ");
        double sisi2 = input.nextDouble(); // untuk memasukkan nilai dari sisi 2
        double keliling = kelilingjajargenjang(sisi1,sisi2); //memanggil method
        System.out.println("");
        System.out.println("Keliling jajar genjang adalah: " + keliling); //output
     
    public static double kelilingjajargenjang(double sisi1 ,double sisi2){ //method untuk mengitung keliliing jajar gennjang
        return 2 * (sisi1+ sisi2);
    }
}
