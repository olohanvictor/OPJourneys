package racas;

public class SerVivo {

    private int hp;
    private int def;

    public SerVivo(int hp, int def) {
        this.hp = hp;
        this.def = def;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void ataqueBase() {
        System.out.println("Ataque Base!");
    }
}
