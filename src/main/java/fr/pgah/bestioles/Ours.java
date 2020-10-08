package fr.pgah.bestioles;

import java.awt.Color;

public class Ours extends Bestiole {

    private boolean polaire;
    private String mouvement = "\\";

    public Ours(boolean polaire) {
        this.polaire = polaire;
    }

    @Override
    public Action getAction(BestioleInfo info) {
        if (info.getEnFace() == Voisin.AUTRE) {
            return Action.INFECTER;
        } else if (info.getEnFace() == Voisin.RIEN) {

            return Action.SAUTER;
        } else {
            return Action.GAUCHE;
        }
    }

    @Override
    public Color getCouleur() {
        if (polaire) {
            return Color.WHITE;
        } else {
            return Color.BLACK;
        }
    }

    @Override
    public String toString() {
        if (mouvement.equals("\\")) {
            mouvement = "/";
            return "/";
        } else {
            mouvement = "\\";
            return "\\";
        }
    }
}
