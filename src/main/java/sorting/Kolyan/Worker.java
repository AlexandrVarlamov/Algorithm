package sorting.Kolyan;

public class Worker {
    public void feed(Animal animal, Food food) {
        if (animal instanceof Herbivorous) {
            animal.eat(food);
        } else {
            animal.eat(food);
        }
    }

    public void getVoice(Speaking speaking) {
        if (speaking instanceof Lion) {
            System.out.println("Gav!");
        } else if (speaking instanceof Duck) {
            System.out.println("Crya-Crya!");
        }
    }
}
