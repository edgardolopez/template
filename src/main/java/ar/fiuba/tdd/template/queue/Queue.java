package ar.fiuba.tdd.template.queue;

import ar.fiuba.tdd.template.linkedlist.LinkedList;

public class Queue<T> implements IQueue<T> {
    private LinkedList<T> list;

    public Queue() {
        list = new LinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        return (this.list.size() == 0);
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public void add(T item) {
        this.list.addLast(item);
    }

    @Override
    public T top() {
        return this.list.getFirst();
    }

    @Override
    public void remove() {
        this.list.removeFirst();
    }
}
