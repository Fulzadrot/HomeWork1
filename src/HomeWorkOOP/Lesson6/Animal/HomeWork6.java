package HomeWorkOOP.Lesson6.Animal;

public class HomeWork6 {
    public static void main(String[] args) {
        Animals cat = new Cat("Murzik");
        Animals dog = new Dog("Djo");
        cat.run(300);
        dog.run(500);
        cat.swim(10);
        dog.swim(5);
        System.out.println(Animals.countOfAnimals);
    }
}
