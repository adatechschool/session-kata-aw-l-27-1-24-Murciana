package org.example;

public class Player {
    private String name;
    private int score;
    private String side;

    public Player(String name, String side)
    {
        this.name = name;
        this.score = 0;
        this.side = side;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    //On affecte au joueur son score actuel
    public void addScore(int score)
    {
        setScore(this.score + score);
    }

    //On affiche le joueur
    @Override
    public String toString()
    {
        return "Joueur [nom : " + name + " , score = " + score + " , side : "
                + side + " ]";
    }
}
