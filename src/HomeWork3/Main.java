package HomeWork3;

public class Main {
    public static void main(String[] args) {
        SwapClass<String> humanName = new SwapClass<String>(new String[]{"Bob", "Tom"});
        SwapClass<Integer> humanAge = new SwapClass<Integer>(new Integer[]{42, 18});

        humanName.swapToArrayList();
        humanAge.swapToArrayList();

        humanName.swapElementPosition();
        humanAge.swapElementPosition();

        BoxForFruit<Apple> appleBox = new BoxForFruit<>();
        Apple apple1 = new Apple();
        appleBox.addFruitInBox(apple1);

        BoxForFruit<Orange> orangeBox = new BoxForFruit<>();
        Orange orange1 = new Orange();
        orangeBox.addFruitInBox(orange1);

        System.out.println("Вес коробки с яблоками: " + appleBox.getActualWeight() + "\n" + "Вес коробки с апельсинами: " + orangeBox.getActualWeight());
        System.out.println("Коробки равны? = " + appleBox.compare(orangeBox));

        Apple apple2 = new Apple();
        appleBox.addFruitInBox(apple2);
        System.out.println("Вес коробки с яблоками: " + appleBox.getActualWeight() + "\n" + "Вес коробки с апельсинами: " + orangeBox.getActualWeight());

        BoxForFruit<Orange> secondOrangeBox = new BoxForFruit<>();
        orangeBox.ChangeBoxWithFruits(secondOrangeBox);

        System.out.println("Вес второй коробки с апельсинами: " + secondOrangeBox.getActualWeight());
    }
}
