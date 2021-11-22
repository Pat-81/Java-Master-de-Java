package Bases;

public class Concatenation {
    public static void main(String args[]) {
        // Déclaration de variables
        var prenom = "Pat";
        var nom = "Rick";
        var identite = prenom + " " + nom;
        // Affivhage dans la console
        System.out.println("Identité : " + identite );

        var nombre1 = 3;
        var nombre2 = 4;
        var somme = nombre1+ nombre2;
        var différence = nombre1- nombre2;

        System.out.println("La somme = " + somme);
        System.out.println("La différence = " + différence);
        System.out.println(nombre1 + nombre2 + " " + identite);
        System.out.println(identite + " " + nombre1 + nombre2);
        System.out.println(identite + " " + (nombre1 + nombre2));
    }
}
