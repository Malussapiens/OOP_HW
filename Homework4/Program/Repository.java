package Homework4.Program;

import java.util.Arrays;

public class Repository<T extends Comparable<T>> {
    private Object[] element;
    private int size;
    private int DEFAULT_CAPACITY = 10;

    public Repository(T[] data) {
        element = data;
        size = data.length;
    }

    public Repository() {
        element = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    private boolean isNearFull() {
        return element.length - size < 2;
    }

    private void expand() {
        element = Arrays.copyOf(element, element.length + DEFAULT_CAPACITY);
    }

    public int count() {
        return size;
    }

    public void add(T element) {
        if (isNearFull()) {
            expand();
        }
        this.element[size] = element;
        size++;
    }

    public void insert(int index, T element) {
        if (isNearFull()) {
            expand();
        }
        System.arraycopy(this.element, index, this.element, index + 1, size);
        this.element[index] = element;
        size++;
    }

    public String printArray() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(String.format("[%d]", i));
            sb.append(element[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void remove(int index) {
        Object[] tmp = new Object[element.length];
        System.arraycopy(element, index, tmp, 0, size);
        System.arraycopy(tmp, 1, element, index, size + 1);
        size--;
    }

    public void removeAll(T element) {
        for (int i = 0; i < size; i++) {
            if (this.element[i].equals(element)) {
                System.out.println(this.element[i]);
                remove(i);
                i--;
            }
        }
    }

    public T getElement(int index) {
        return (T) element[index];
    }

    public int getIndex(T element) {
        for (int i = 0; i < size; i++) {
            if (this.element[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(T element) {
        return getIndex(element) != -1;
    }

}
