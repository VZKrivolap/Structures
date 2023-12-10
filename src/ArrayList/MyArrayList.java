package ArrayList;

import java.util.Arrays;

public class MyArrayList<T>{
    private Object[] array;
    private int size = 0;
    private int capacity=10;
    private int index = 0;

    public MyArrayList() {
        array = new Object[capacity];
    }

    public void addElement(T element) {
        if (size == capacity-1) {
            Object[] newArray = new Object[capacity * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array[index] = element;
            index++;
        } else {
            array[index] = element;
            index++;
        }
    }

    public void addElement(int index, T element){

    }

    public void getElement(int index){

    }

    public void remove(int index){

    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                ", capacity=" + capacity +
                ", index=" + index +
                '}';
    }
}