package ar.fiuba.tdd.template.linkedlist;

import ar.fiuba.tdd.template.linkedlist.nodes.AbstractNode;
import ar.fiuba.tdd.template.linkedlist.nodes.Node;
import ar.fiuba.tdd.template.linkedlist.nodes.NullNode;

public class LinkedList<T> {
    private AbstractNode<T> firstNode;

    public LinkedList() {
        firstNode = new NullNode<>();
    }

    public void removeFirst() {
        firstNode = firstNode.getNextNode();
    }

    public T getFirst() {
        return firstNode.getValue();
    }

    public void addLast(T item) {
        firstNode = firstNode.insertNode(new Node<>(item));
    }

    public int size() {
        return firstNode.getDepth();
    }
}
