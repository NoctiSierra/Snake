package model;

/**
 * Cette classe est une liste chainée qui contribuera a la classe snake
 * 
 */

public class SnakeComponent {

    // Constructeur pour SnakeComponent
    public SnakeComponent(SnakeComponent prev, SnakeComponent next){
        this.next=next;
        this.prev=prev;
    }

    // Composant suivant de la liste chainée
    private SnakeComponent next;

    // Composant précédent de la liste chainnée
    private SnakeComponent prev;

    // Setter pour l'attribut next
    public void setNext(SnakeComponent next) {
        this.next=next;
    }

    // Getter pour l'attribut next
    public SnakeComponent getNext() {
        return this.next;
    }

    // Setter pour l'attribut prev
    public void setPrev(SnakeComponent prev) {
        this.prev=prev;
    }

    // Getter pour l'attribut prev
    public SnakeComponent getPrev() {
        return this.prev;
    }

}