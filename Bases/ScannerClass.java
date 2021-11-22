package Bases;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        System.out.println("Ecrivez votre nom : ");
        Scanner console = new Scanner(System.in);
        var user = console.nextLine();
        System.out.println("user : "  + user );
        System.out.println("Profession : ");
        var titre = console.nextLine();
        System.out.println("Résultats : " + user + " " + titre );
    }
}
