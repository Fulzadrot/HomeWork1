package HomeWorkOOP.Lesson6.Animal;

public class Animals {
    protected String name;
    protected int age;
    static int countOfAnimals;

    public Animals() {
        countOfAnimals++;
    }

    public Animals(String name) {
        this.name = name;
        countOfAnimals++;
    }
    public void run(int lengthHurdle){
        System.out.println(name + " Пробежал" + lengthHurdle);
    }
    public void swim(int lengthHurdle){
        System.out.println(name + " Проплыл" + lengthHurdle);
    }
    public void count(){
        System.out.println("Текущее число Животных " + countOfAnimals);
    }
}
