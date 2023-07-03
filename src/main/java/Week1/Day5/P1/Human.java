package Week1.Day5.P1;

import Week1.Day5.P1.Animal;
import Week1.Day5.P1.Sport;

public class Human implements Animal, Sport {

    @Override
    public int returnLegs() {
        return 2;
    }

    @Override
    public String returnGame() {
        return "Cricket";
    }
}
