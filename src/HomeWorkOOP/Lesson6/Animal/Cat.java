package HomeWorkOOP.Lesson6.Animal;

public class Cat extends Animals {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int lengthHurdle) {
        if (lengthHurdle <= 200) {
            System.out.println(name + " Пробежал " + lengthHurdle);
        } else {
            System.out.println(name + " Не умеет так далеко бегать");
        }
    }
    @Override
    public void swim(int lengthHurdle) {
            System.out.println(name + " Коты не плавают!");
    }
}