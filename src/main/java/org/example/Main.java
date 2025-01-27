package org.example;

public class Main {
    public static void main(String[] args) {

        //On initialise les joueurs
        Player player1 = new Player("player 1","P1");
        Player player2 = new Player("player 2", "P2");
        System.out.println(player1);
        System.out.println(player2);

        //On initialise le plateau
        Board board = new Board();
        board.createBoard();
        board.displayBoard();

        if (board.isEmpty()) {
            System.out.println("Le plateau est vide");
        } else {
            System.out.println("Le plateau contient encore des graines. Vous pouvez continuer");
        }

        //On vérifie le nombre de graines sur le plateau
        int totalNumberofSeeds = board.seedsNumber();
        System.out.println("\nNombre total de graines sur le plateau : " + totalNumberofSeeds + "\n");

        board.sowSeeds(3,"P1");
        board.displayBoard();

        /*
        TODO - créer la boucle du jeu :
                    - les tours
                    - la gestion du score des joueurs
                    - la case à jouer souhaitée
                    - fonction de victoire/fin de jeu
        */

    }
}