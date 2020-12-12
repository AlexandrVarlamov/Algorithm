package sorting.Kolyan;

public abstract class Predator extends Animal {

    @Override
    protected void eat(Food food) {
        if (food instanceof Weed) {
            System.out.println("Wrong food for me!");
        }
    }
}
