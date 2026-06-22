package racas;

public class Tritao extends SerVivo {

    private static final int BONUS_HP = 12;
    private static final int BONUS_DEF = 7;
    //Tem um comentário na classe Humano explicando o STATIC. Vale a pena ler

    public Tritao(int hp, int def) {
        super(hp + BONUS_HP, def + BONUS_DEF);
    }

    @Override
    public void ataqueBase() {
        System.out.println("Soco com água!");
    }
}