package model;

/**
 * Classe représentant le snake
 * Utilise une liste chainée 
 */

public class Snake {

    // Dernier composant de la liste chainée
    private SnakeComponent last;

    // Premier composant de la liste chainée
    private SnakeComponent first;

    // Constructeur pour Snake
    public Snake(int taille) {

        for(int i=0; i < taille;i++) {

            // Si première élément de la chaine établir en tant que attribut first
            if(i==0) {
                this.setFirst(new SnakeComponent(null,null));
                this.setLast(this.getFirst());
            }else{
                SnakeComponent previous = getLast();
                SnakeComponent next = new SnakeComponent(previous,null);
                this.setLast(next);
            }
        }
        
    }

    // Setter pour l'attibut last
    public void setLast(SnakeComponent last) {
            this.last=last;
    }

    // Getter pour l'attribut last
    public SnakeComponent getLast() {
        return this.last;
    }

    // Setter pour l'attribut first
    public void setFirst(SnakeComponent first) {
            this.first = first;
    }

    // Getter pour l'attribut first
    public SnakeComponent getFirst() {
        return this.first;
    }

}