public class Zoo {
    public static void main(String[] args) {
        Animal ani = new Animal(2, 'F', 22);
        ani.eat();
        ani.sleep();
        ani.eat();

        Bird bird = new Bird(4, 'M', 6);
        bird.fly();

        Chicken chick = new Chicken(6, 'F', 3);
        chick.eat();
        chick.fly();

        Sparrow sparrow = new Sparrow(7, 'M', 5);
        sparrow.eat();
        sparrow.fly();
    }
}