package Bases;

import java.util.Scanner;

public class Libro {
    public static void main(String[] args) {
        System.out.println("Titulo del libro");
        Scanner console = new Scanner(System.in);
        var titre = console.nextLine();
        System.out.println("Autor");
        var auteur = console.nextLine();
        System.out.println(titre + " es escrito por " + auteur);
    }
}
