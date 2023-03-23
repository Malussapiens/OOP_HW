package Homework4.Program;

public class ArrayControl<T extends Comparable<T>> {
    private T[] al;
    private int counter;

    public ArrayControl(T[] data) {
        al = data;
        counter = data.length;
    }

    @SuppressWarnings("unchecked")
    public ArrayControl() {
        al = (T[]) new Object[10];

        counter = 0;
    }

    private boolean isNearFull() {
        return al.length - counter < 2;
    }

    @SuppressWarnings("unchecked")
    private void expand() {
        T[] tmp = (T[]) new Object[al.length + 10];
        System.arraycopy(al, 0, tmp, 0, counter);
        al = tmp.clone();
    }

    public int count() {
        return counter;
    }

    public void add(T element) {
        if (isNearFull()) {
            expand();
        }
        al[counter] = element;
        counter++;
    }

    public void insert(int index, T element) {
        if (isNearFull()) {
            expand();
        }
        Object[] tmp = new Object[al.length];
        System.arraycopy(al, index, tmp, 0, counter);
        al[index] = element;
        System.arraycopy(tmp, 0, al, index + 1, counter);
        counter++;
    }

    public String printArray() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < counter; i++) {
            sb.append(al[i]);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void remove(int index) {
        Object[] tmp = new Object[al.length];
        System.arraycopy(al, index, tmp, 0, counter);
        System.arraycopy(tmp, 1, al, index, counter + 1);
        counter--;
    }
}
