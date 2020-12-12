package sorting.Kolyan;

public abstract class Herbivorous extends Animal {

    @Override
    protected void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Wrong food for me!");
        }
    }
}
