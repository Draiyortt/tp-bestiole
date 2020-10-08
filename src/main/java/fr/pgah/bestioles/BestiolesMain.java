// Bestioles - pgah
// BestiolesMain est la méthode principale de la simulation.
// Vous pouvez modifier le nombre de bestioles ou encore la longueur/largeur
// de la Frame (valeurs passées au constructeur de BestioleFrame)

package fr.pgah.bestioles;

public class BestiolesMain {
    public static void main(String[] args) {
        BestioleFrame frame = new BestioleFrame(60, 40);

        // décommentez chacune de ces lignes au fur et à mesure
        // que les classes sont complétées
        frame.add(3, Ours.class);
        frame.add(5, Tigre.class);
        frame.add(5, TigreBlanc.class);
        frame.add(3, Yeti.class);
        frame.add(30, ChatNinja.class);

        frame.add(2, Crocodile.class);
        frame.add(30, Plancton.class);

        frame.start();
    }
}