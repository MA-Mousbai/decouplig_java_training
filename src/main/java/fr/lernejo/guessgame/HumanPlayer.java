package fr.lernejo.guessgame;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;
public class HumanPlayer implements Player{
    private final Logger logger = LoggerFactory.getLogger("player");
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public long askNextGuess() {
        System.out.print("Saisir une estimation de l'âge: ");
        return scanner.nextLong();
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater) {
            logger.log("le joueur n'as pas trouver le bon âge");
            System.out.println("Coulé! Essaie encore.");
        } else {
            logger.log("le joueur a gagné");
            System.out.println("Bravo! Tu as trouvé l'âge du capitaine.");
        }
    }
}
