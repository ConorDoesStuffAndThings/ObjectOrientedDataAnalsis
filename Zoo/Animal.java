public class Animal {
    private int age;
    private char gender;
    private int weight;


    public Animal(int age, char gender, int weight) {
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("I am an animal & I am eating...");
    }

    public void sleep(){
        System.out.println("I am an animal & I am sleeping...");
    }
}