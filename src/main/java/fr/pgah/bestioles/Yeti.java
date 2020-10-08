package fr.pgah.bestioles;

import java.awt.Color;

public class Yeti extends Bestiole {
    private int mouvement = 0;

    public Yeti() {

    }

    @Override
    public Color getCouleur() {
        return Color.GRAY;

    }

    @Override
    public Action getAction(BestioleInfo info) {
        if (info.getEnFace() == Voisin.AUTRE) {
            return Action.INFECTER;
        } else if (info.getEnFace() == Voisin.RIEN) {

            return Action.SAUTER;
        } else {
            return Action.DROITE;
        }
    }

    @Override
    public String toString() {
        mouvement++;
        if (mouvement >= 1 && mouvement <= 6) {
            return "gna";
        } else if (mouvement >= 7 && mouvement <= 12) {
            return "gne";
        } else if (mouvement >= 13 && mouvement <= 18) {
            return "bah";
        } else if (mouvement >= 19 && mouvement <= 24) {
            return "bek";
        } else {
            mouvement = 1;
            return "gna";
        }

    }

}
