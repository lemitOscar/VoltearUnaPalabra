package inversorr;

import java.util.Scanner;

public class Palabras {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String palabra = "", palabraInver = "";
        int longitudPal = 0;

        System.out.println("ingrese una palabra o frase: ");
        palabra = read.nextLine();

        longitudPal = palabra.length();
        while (longitudPal != 0) {
            palabraInver += palabra.substring(longitudPal - 1, longitudPal);
            longitudPal--;
        }

        System.out.println("palabra invertida " + palabraInver);

    }

}
