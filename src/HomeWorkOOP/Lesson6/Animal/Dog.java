package HomeWorkOOP.Lesson6.Animal;

public class Dog  extends Animals{
    public Dog(String name) {
        super(name);
    }
    @Override
    public void run(int lengthHurdle) {
        if (lengthHurdle <= 500) {
            System.out.println(name + " Пробежал " + lengthHurdle);
        } else {
            System.out.println(name + " Не умеет так далеко бегать");
        }
    }
    @Override
    public void swim(int lengthHurdle) {
        if (lengthHurdle <= 10) {
            System.out.println(name + " Проплыл " + lengthHurdle);
        } else {
            System.out.println(name + " Не может проплыть так далеко");
        }
    }
}
