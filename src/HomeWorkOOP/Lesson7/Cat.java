package HomeWorkOOP.Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public boolean isFullness() {
        return fullness;
    }

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
        if (appetite > plate.getFood()) {
            fullness = false;
            System.out.println("Cat " + name + " " + fullness);
            return;
        }
        fullness = true;
        System.out.println("Cat " + name + " " + fullness);
    }
}
