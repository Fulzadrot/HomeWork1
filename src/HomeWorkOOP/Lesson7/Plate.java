package HomeWorkOOP.Lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int amount){
        if(amount > food){
            System.out.println("Not enough eat");
            return;
        }

        food -= amount;
        System.out.println(food);
    }

    public int getFood() {
        return food;
    }
    public void addFood ( int addFood){
        food += addFood;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
