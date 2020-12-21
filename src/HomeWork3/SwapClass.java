package HomeWork3;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapClass<T> {
    private T[] object;

    public SwapClass(T[] object) {
        this.object = object;
    }

    public T[] getObject(){
        return object;
    }

    public ArrayList<T> swapToArrayList(){
        ArrayList<T> arrayList = new ArrayList<T>(Arrays.asList(object));
        System.out.println(arrayList);
        return arrayList;
    }

    public void swapElementPosition(){
        T i = object[0];
        object[0] = object[1];
        object[1] = i;
        System.out.println(Arrays.toString(object));
    }
}
