package HomeWork2.LessonOne;

public class Robot implements Runnable,Jumpable{
    private String name;
    private int maxRunLength;
    private int maxJumpLength;

    public Robot(String name, int maxRunLength, int maxJumpLength) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpLength = maxJumpLength;
    }

    @Override
    public void jump(int length) {
        if(length < maxJumpLength){
            System.out.println("Робот " + name + " успешно прыгнул");
        } else {
            System.out.println("Робот " + name + " не смог прыгнуть");
        }
    }

    @Override
    public void run(int length) {
        if(length < maxRunLength){
            System.out.println("Робот " + name + " успешно пробежал");
        }else {
            System.out.println("Робот " + name + " не смог пробежать");
        }
    }
}
