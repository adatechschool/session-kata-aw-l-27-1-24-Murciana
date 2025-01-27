package org.example;


import java.util.Objects;

public class Board {
    public int[][] cell;
    public boolean isEmpty = false;

    //On créé le plateau et rempli chaque case de 4 graines
    public void createBoard() {
        cell = new int[2][6];
        for (int line = 0; line < 2; line++)
        {
            for (int column = 0; column < 6; column++)
                cell[line][column] = 4;
        }
    }

    // On affiche le plateau
    public void displayBoard(){
        System.out.println("Current board : ");

        System.out.println("  A B C D E F");
        for (int line = 0; line < 2; line++)
        {
            System.out.print("[");
            for (int column = 0; column < 6; column++)
                System.out.print(" " + cell[line][column]);
            System.out.println(" ] P" + (line + 1));
        }
        System.out.println("  G H I J K L");

//        System.out.println();

    }

    // On vérifie si le plateau est vide
    public boolean isEmpty() {
        for (int line = 0; line < 2; line++) {
            for (int column = 0; column < 6; column++) {
                if (cell[line][column] > 0) {
                    return false; // Si une case contient encore des graines, le plateau n'est pas vide
                }
            }
        }
        return true;
    }

    //On retourne le nombre de graines sur une case selectionnée
    public int getCell(int line, int column)
    {
        return cell[line][column];
    }


    //on affecte une valeur à la case sélectionnée
    public void setCell(int line, int column, int value)
    {
        cell[line][column] = value;
    }

    //On ajoute une graine dans la case
    public void addSeed(int line, int column)
    {
        cell[line][column]++;
    }

    //On retourne le nombre de graines total sur le plateau
    public int seedsNumber() {
        int seedsNumber = 0;
        for (int line = 0; line < 2; line++)
        {
            for (int column = 0; column < 6; column++)
                seedsNumber += cell[line][column];
        }
        return seedsNumber;
    }

    //On retourne le nombre de graines d'un seul joueur
    public int seedsNumber(int line) {
        int seedsNumber = 0;
        for (int column = 0; column < 6; column++)
            seedsNumber += cell[line][column];
        return seedsNumber;
    }

    /* Fonction pour semer les graines
     *  j'ai décidé de commencer par la première case dans un premier temps (et ensuite la cellule sera au choux du joueur)
     */
    public void sowSeeds(int column, String side){
        if (Objects.equals(side, "P1")){
            int seeds = cell[0][column];
            setCell(0, column, 0); //On vide la cellule actuelle

            // On répartie à partir de la cellule actuelle jusqu'à ne plus avoir de graines à répartir ou jusqu'à la cellule 0 du J1
            for (int line = column - 1; line >= 0; line--)
            {
                if (seeds != 0)
                {
                    addSeed(0, line);
                    seeds--;
                }
            /*  TODO - répartir les graines restantes dans le side opposé
            *   TODO - créer la fonction pour harvest les graines de l'adversaire
            *   TODO - adapter les fonction pour que cela fonctionne pour les 2 joeurs
            */

            }
        }
    }
}
