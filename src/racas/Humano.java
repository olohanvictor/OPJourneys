package racas;

public class Humano extends SerVivo {

    private static final int BONUS_HP = 4; //Final é CONST, só q em Java
    private static final int BONUS_DEF = 2;
    /*
    Com static, BONUS_HP e BONUS_DEF pertencem à classe Humano, e não a cada objeto individualmente.

    Isso significa que existe apenas uma cópia desses valores na memória, compartilhada por todos os
    humanos, todos os objetos Humano usam LITERALMENTE os mesmos valores de BONUS_HP e BONUS_DEF.

    Sem static, cada objeto Humano instanciado reservaria um espaço na memória para guardar a mesma
    informação Nada otimizado né.
    */

    public Humano(int hp, int def) {
        super(hp + BONUS_HP, def + BONUS_DEF);
    }

    @Override
    public void ataqueBase() {
        System.out.println("Soco!");
    }
}