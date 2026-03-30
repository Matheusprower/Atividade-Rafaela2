package Main;

public class Mago extends Personagem {

    private int mana;

    public Mago(String nome, int nivel, int mana) {
        super(nome, nivel);
        this.mana = mana;
    }

    @Override
    public String atacar() {
        return getNome() + " lançou uma magia! Mana: " + mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Mago{" +
                "nome='" + getNome() + '\'' +
                ", nivel=" + getNivel() +
                ", mana=" + mana +
                '}';
    }
}