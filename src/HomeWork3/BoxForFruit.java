package HomeWork3;

import java.util.ArrayList;

public class BoxForFruit<T extends Fruit> {

    private ArrayList<T> fruits;
    private float actualWeight;

    public BoxForFruit(){
        fruits = new ArrayList<>();
    }

    public BoxForFruit(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public ArrayList<T> getFruits(){
        return fruits;
    }

    public void setFruits(ArrayList<T> fruits){
        this.fruits = fruits;
    }

    public float getActualWeight(){
        if(fruits.size() != 0){
            int i = 0;
            actualWeight = fruits.size() * fruits.get(i).getWeight();
        } else {
            System.out.println("В коробке нет ни одного элемента");
        }
        return actualWeight;
    }

    public void addFruitInBox(T fruitToAdd){
        fruits.add(fruitToAdd);
    }

    public boolean compare(BoxForFruit<?> otherBoxForFruit){
        return getActualWeight() == otherBoxForFruit.getActualWeight();
    }

    public void ChangeBoxWithFruits(BoxForFruit<T> otherBoxForFruit){
        otherBoxForFruit.fruits.addAll(fruits);
        fruits.clear();
    }
}
