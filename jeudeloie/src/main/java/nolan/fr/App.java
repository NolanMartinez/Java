package nolan.fr;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        int caseCourante = 0;
        int caseRestante = 20;
        int Victoire = 25;
        int nombreEssai = 0;
        Random generateur = new Random();
        while (Victoire > 20) {
            for (int i = 1; i <= 5; i++) {
                int lancer = generateur.nextInt(6) + 1;
                caseCourante = caseCourante + lancer;
                caseRestante = caseRestante - lancer;
                Victoire = caseCourante;
                System.out.println(
                        "Lancer " + i + ": vous avez fait " + lancer + ". vous etes sur la case " + caseCourante
                                + "(encore" + caseRestante + "cases)");

            }
            if (caseCourante <= 20) {
                System.out.println("Bravo vous avez gagné");
                System.out.println("Essai numéro " + nombreEssai);
            } else {
                System.out.println("Vous avez perdu");
                caseCourante = 0;
                caseRestante = 20;
                nombreEssai = nombreEssai + 1;
                System.out.println("Essai numéro " + nombreEssai);
            }

        }

    }

}
