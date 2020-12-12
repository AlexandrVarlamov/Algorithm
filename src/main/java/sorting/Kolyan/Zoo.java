package sorting.Kolyan;

public class Zoo {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Lion lion = new Lion();
        Sneak sneak = new Sneak();

        Meat meat = new Meat();
        Weed weed = new Weed();

        Worker employee = new Worker();

        employee.feed(duck, meat);
        employee.feed(duck, weed);
        employee.feed(lion, meat);
        employee.feed(lion, weed);

        employee.getVoice(lion);
        employee.getVoice(duck);
//        employee.getVoice(sneak); //А эта строка не рабоатет, расскомментриуй её
     }
}
