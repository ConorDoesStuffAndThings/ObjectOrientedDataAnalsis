public class Sparrow extends Animal implements Flyable{
    public Sparrow(int age, char gender, int weight) {
        super(age, gender, weight);
    }

    @Override
    public void fly() {
        System.out.println("I am a sparrow and I am flying...");
    }
}
