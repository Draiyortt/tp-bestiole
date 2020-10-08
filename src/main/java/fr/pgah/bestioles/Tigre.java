package fr.pgah.bestioles;

import java.awt.Color;
import java.util.Random;

public class Tigre extends Bestiole {
    private int mouvement = 0;
    private Color couleur;

    public Tigre() {

    }

    @Override
    public Action getAction(BestioleInfo info) {
        if (info.getEnFace() == Voisin.AUTRE) {
            return Action.INFECTER;
        } else if (info.getEnFace() == Voisin.MUR || info.getADroite() == Voisin.MUR) {
            return Action.GAUCHE;
        } else if (info.getEnFace() == Voisin.MEME) {
            return Action.DROITE;
        } else {
            return Action.SAUTER;
        }
    }

    @Override
    public Color getCouleur() {
        mouvement++;
        if (mouvement == 1) {
            switch (new Random().nextInt(3)) {
                case 0:
                    return couleur = Color.RED;
                case 1:
                    return couleur = Color.GREEN;
                default:
                    return couleur = Color.BLUE;
            }
        } else if (mouvement == 4) {
            mouvement = 0;
            return couleur;
        }
        return couleur;

    }

    @Override
    public String toString() {
        return "TGR";
    }
}
