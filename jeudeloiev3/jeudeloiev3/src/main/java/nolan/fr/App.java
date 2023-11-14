package nolan.fr;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        Random generateur = new Random();
        int caseCourante = 0;
        int couplancer = 0;
        while (caseCourante != 20) {
            int lancer = generateur.nextInt(6) + 1;
            caseCourante = caseCourante + lancer;
            System.out.println("Vous avez fait " + lancer + " vous etes a la case " + caseCourante);
            couplancer = couplancer + 1;
            if (caseCourante > 20) {
                int caseHypothetique = caseCourante;
                int depassement = caseHypothetique - 20;
                caseCourante = 20 - depassement;
                System.out.println(
                        "Vous etes revenu en arriere de " + depassement + " cases vous etes a la case " + caseCourante);
            }

        }
        System.out.println("Vous avez gagner et vous avez fais " + couplancer + " lancer");
    }

}
