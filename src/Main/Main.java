package Main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("");
        Guerreiro guerreiro = new Guerreiro("Matheus", 10, 80);
        Mago mago = new Mago("Danielly", 12, 150);

        List<Personagem> personagens = new ArrayList<>();
        personagens.add(guerreiro);
        personagens.add(mago);

        for (Personagem p : personagens) {
            System.out.println(p);
            System.out.println(p.atacar()); // método sobrescrito
            System.out.println("---------------------");
        }
    }
}