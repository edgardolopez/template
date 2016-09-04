package ar.fiuba.tdd.template.linkedlist.nodes;

public abstract class AbstractNode<T> {
    protected T data;
    protected AbstractNode<T> nextNode;

    public abstract AbstractNode<T> insertNode(AbstractNode<T> node);

    public abstract AbstractNode<T> getNextNode();

    public abstract T getValue();

    public abstract int getDepth();


}
