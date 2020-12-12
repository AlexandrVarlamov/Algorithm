package sorting.Kolyan;

public class Worker {
    private void feed(Animal animal, Food food) {
    }

    private void getVoice(Speaking speaking) {
        if (speaking instanceof Lion) {
            System.out.println("Gav!");
        } else if (speaking instanceof Duck) {
            System.out.println("Crya-Crya!");
        }
    }
}
