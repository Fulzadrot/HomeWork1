package HomeWorkOOP.Lesson7;

public class HomeWork {
    public static void main(String[] args) {
        Cat kitty = new Cat("Murzik",10);
        Plate plate = new Plate(100);
        System.out.println(plate);
        kitty.eat(plate);
        System.out.println(plate);
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik", 10);
        cats[1] = new Cat("Murzichek",20);
        cats[2] = new Cat("Persik", 30);
        cats[3] = new Cat("Keksik", 5);
        cats[4] = new Cat("Smurfik", 40);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
        plate.addFood(100);
        System.out.println(plate);
    }
}
