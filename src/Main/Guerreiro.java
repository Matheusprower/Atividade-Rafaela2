package Main;

public class Guerreiro extends Personagem {

    private int forca;

    public Guerreiro(String nome, int nivel, int forca) {
        super(nome, nivel);
        this.forca = forca;
    }

    @Override
    public String atacar() {
        return getNome() + " deu uma espadada! Força: " + forca;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public String toString() {
        return "Guerreiro{" +
                "nome='" + getNome() + '\'' +
                ", nivel=" + getNivel() +
                ", forca=" + forca +
                '}';
    }
}
