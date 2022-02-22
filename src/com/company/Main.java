package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss b1 = new Boss();
        b1.setBossHealth(500);
        b1.setBossDamage(50);
        b1.setBossDefenceType("Magic");
        System.out.println("Boss- " + b1.getBossHealth() +  " Health  " + b1.getBossDamage() + " Damage " + b1.getBossDefenceType());
        for (int i = 0; i < createHeroes().length ; i++) {
            System.out.print(createHeroes()[i].getHeroesHealth() + " " + createHeroes()[i].getHeroesDamage() + " " + createHeroes()[i].getHeroesAttackType() + " ");
        }
    }
    public static Hero[] createHeroes (){
        Hero h1 = new Hero(230, 30, "magical");
        Hero h2 = new Hero(250, 25);
        Hero h3 = new Hero(210, 20, "kinetic");
        Hero[] arrayHeroes = new Hero[]{h1, h2, h3};
        return arrayHeroes;
    }

}
    

