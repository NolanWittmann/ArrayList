package org.example;

import java.util.ArrayList;

public class Aquarium {
    public static void main(String[] args) {

        Fish nemo = new Fish("Nemo");
        Fish dory = new Fish("Dory");
        Fish marin = new Fish("Marin");

        ArrayList<Fish> leMondeDeNemo = new ArrayList<Fish>();
        leMondeDeNemo.add(nemo);
        leMondeDeNemo.add(dory);
        leMondeDeNemo.add(marin);

        nemo.setAge(38);
        dory.setAge(18);

        for (Fish fish : leMondeDeNemo) {
            System.out.println(fish.swimming());
        }
    }
}
