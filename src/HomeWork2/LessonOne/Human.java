package HomeWork2.LessonOne;

public class Human implements Runnable, Jumpable {
    private String name;
    private int maxRunLength;
    private int maxJumpLength;

    public Human(String name, int maxRunLength, int maxJumpLength) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpLength = maxRunLength;
    }
    public void jump() {
        System.out.println("Человек " + name + " успешно прыгнул");
    }

    @Override
    public void run(int length) {
        if (length < maxRunLength) {
            System.out.println("Человек " + name + " успешно пробежал");
        } else {
            System.out.println("Человек " + name + " Не смог пробежать");
        }
    }

    @Override
    public void jump(int length) {
        if (length < maxJumpLength){
            System.out.println("Человек " + name + " Успешно прыгнул");
        } else {
            System.out.println("Человек " + name + " Не смог прыгнуть");
        }
    }
}
