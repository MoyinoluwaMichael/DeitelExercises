package chapterTen;

import java.util.Arrays;

public class ArrayList implements List {

    private int[] list;
    private int size;
    private int capacity;

    public ArrayList(){
        capacity = 3;
        list = new int[capacity];
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(int number) {
        list[size++] = number;
        if (size == capacity) setNewCapacity();
    }

    private void setNewCapacity() {
        capacity = size < 3? 3: ((size / 3) * 3) * 2;
        list = Arrays.copyOf(list, capacity);
        capacity = size < 3 ? 3 : ((size / 3) * 3) * 2;
    }

    @Override
    public void remove(int number) {
        int [] newList = new int[capacity];
        int count = 0;
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                if (list[i] != number) newList[count++] = list[i];
            }
            list = newList;
            size--;
        }
        else throw new IllegalArgumentException("ArrayList is empty");
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int number, int index) {
        size++;
        int [] newList = new int[capacity];
        newList[index] = number;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (i != index) newList[i] = list[count++];
        }
        list = newList;
        if (size == capacity) setNewCapacity();
    }

    @Override
    public int get(int index) {
        return list[index];
    }

    @Override
    public int getIndexOf(int number) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == number) return i;
        }
        return -1;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }
}
