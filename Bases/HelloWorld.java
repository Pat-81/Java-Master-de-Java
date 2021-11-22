package Bases;

// Ma classe en Java
public class HelloWorld {
    public static void main(String args[]) {
        // Déclaraton de variable de type entier
        int maVariableEntier = 10;
        // On envoie le résultat dans la console
        System.out.println(maVariableEntier);
        // Réaffectation d'une valeur à la variable
        maVariableEntier = 20;
        System.out.println(maVariableEntier);

        // Déclarer une variable string avec la classe String
        String uneChaine = "Ceci est une string";
        System.out.println(uneChaine);
        uneChaine = "Ceci est la string modifiée";
        System.out.println(uneChaine);

        // var = héritage du type à partir de la valeur
        var maVariableEntier2 = 10;
        System.out.println("maVariableEntier2 = " + maVariableEntier2);

        var uneChaine2 = "Ceci est ma deuxième string";
        System.out.println(uneChaine2);

        // var maVariable = 1;
        // var _maVariable = 2;
        // var $maVariable = 3;
    }
}
