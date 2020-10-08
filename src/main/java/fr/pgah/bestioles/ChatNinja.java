package fr.pgah.bestioles;

import java.awt.Color;
import java.util.Random;

public class ChatNinja extends Bestiole {
    private int mouvement = 0;
    private Color couleur;

    public ChatNinja() {

    }

    @Override
    public Action getAction(BestioleInfo info) {
        if (info.getEnFace() == Voisin.AUTRE) {
            return Action.INFECTER;
        } else if (info.getADroite() == Voisin.AUTRE) {
            return Action.GAUCHE;
        } else if (info.getAGauche() == Voisin.AUTRE) {
            return Action.DROITE;
        } else if (info.getEnFace() == Voisin.RIEN) {
            return Action.SAUTER;
        } else {
            switch (new Random().nextInt(2)) {
                case 0:
                    return Action.DROITE;
                default:
                    return Action.GAUCHE;
            }
        }
    }

    @Override
    public Color getCouleur() {
        if (couleur == null) {
            switch (new Random().nextInt(3)) {
                case 0:
                    return couleur = Color.BLACK;
                case 1:
                    return couleur = Color.WHITE;
                default:
                    return couleur = Color.ORANGE;
            }
        } else {
            return couleur;
        }
    }

    @Override
    public String toString() {
        mouvement++;
        if (mouvement >= 1 && mouvement <= 10) {
            return "NIN";
        } else if (mouvement >= 11 && mouvement <= 20) {
            return "CHA";
        } else {
            mouvement = 1;
            return "NIN";
        }

    }
}
