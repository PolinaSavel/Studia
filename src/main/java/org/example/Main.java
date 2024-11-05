package org.example;

public class Main {
    public static void main(String[] args) {
        Studia studiya1 = new Studia("Luchshaya studiya");
        Studia studiya2 = new Studia("Studiya 516");

        Tehnika[] tehnikaStudiiLuchshey = new Tehnika[3];
        tehnikaStudiiLuchshey[0] = new Tehnika("kolonka", 1500);
        tehnikaStudiiLuchshey[1] = new Tehnika("podstavka", 3650);
        tehnikaStudiiLuchshey[2] = new Tehnika("mob.TF", 25000);

        Tehnika[] tehnikaStudii516 = new Tehnika[3];
        tehnikaStudii516[0] = new Tehnika("lampa", 1200);
        tehnikaStudii516[1] = new Tehnika("mikrofon", 6700);
        tehnikaStudii516[2] = new Tehnika("videokamera", 156000);

        System.out.println("Stoimost oborudovaniya v " + studiya1.getNameStudii() + ": ");
        vivvodStoimostiOborudovaniya(tehnikaStudiiLuchshey);

        System.out.println("Stoimost oborudovaniya v " + studiya2.getNameStudii() + ": ");
        vivvodStoimostiOborudovaniya(tehnikaStudii516);
    }

    public static void vivvodStoimostiOborudovaniya(Tehnika[] tehnika) {
        int sum = 0;
        for (Tehnika i : tehnika) {
            sum += i.getStoimost();
        }
        System.out.println("obshaya stoimost: " + sum + " rubley");
    }
}