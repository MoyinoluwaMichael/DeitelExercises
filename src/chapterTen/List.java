package chapterTen;

public interface List {

    boolean isEmpty();

    void add(int number);

    void remove(int number);

    int size();

    void add(int number, int index);

    int get(int index);

    int getIndexOf(int number);

    int getCapacity();
}
