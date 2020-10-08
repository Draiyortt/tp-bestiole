package fr.pgah.bestioles;

import java.awt.Color;

public class TigreBlanc extends Bestiole {

    private boolean aTue;

    public TigreBlanc() {

    }

    @Override
    public Action getAction(BestioleInfo info) {
        if (info.getEnFace() == Voisin.AUTRE) {
            aTue = true;
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
        return Color.WHITE;

    }

    @Override
    public String toString() {
        if (aTue) {
            return "TGR";
        } else {
            return "tgr";
        }
    }
}
