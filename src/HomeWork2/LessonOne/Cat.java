package HomeWork2.LessonOne;

public class Cat implements Runnable,Jumpable {
    private String name;
    private int maxRunLength;
    private int maxJumpLength;

    public Cat(String name, int maxRunLength, int maxJumpLength) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpLength = maxJumpLength;
    }

    @Override
    public void jump(int length) {
        if(length < maxJumpLength){
            System.out.println("Кот " + name + " успешно прыгнул");
        } else {
            System.out.println("Кот " + name + " не смог прыгнуть");
        }
    }

    @Override
    public void run(int length) {
        if(length < maxRunLength){
            System.out.println("Кот " + name + " успешно пробежал");
        } else {
            System.out.println("Кот " + name + " не смог пробежать");
        }
    }
}
