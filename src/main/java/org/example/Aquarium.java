package org.example;

import java.util.ArrayList;

public class Aquarium {

    private static final String NEMO = "Nemo";

    public static void main(String[] args) {

        Fish nemo = new Fish(NEMO);
        String dory1 = "Dory";
        Fish toto = new Fish(dory1);
        Fish marin = new Fish("Marin");

        ArrayList<Fish> leMondeDeNemo = new ArrayList<Fish>();
        leMondeDeNemo.add(nemo);
        leMondeDeNemo.add(toto);
        leMondeDeNemo.add(marin);

        nemo.setAge(0);
        toto.setAge(18);
        leMondeDeNemo.remove(2);
        for (Fish fish : leMondeDeNemo) {
            System.out.println(fish.swimming());
        }
        leMondeDeNemo.clear();

    }
}
