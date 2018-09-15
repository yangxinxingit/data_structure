package main.set_map;

public interface Set<E> {

    int getSize();

    boolean isEmpty();

    void add(E e);

    boolean contains(E e);

    void remove(E e);

}
