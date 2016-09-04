package ar.fiuba.tdd.template.linkedlist.nodes;

public class NullNode<T> extends AbstractNode<T> {
    @Override
    public AbstractNode<T> insertNode(AbstractNode<T> node) {
        return node;
    }

    @Override
    public T getValue() throws AssertionError {
        throw new AssertionError();
    }

    @Override
    public AbstractNode<T> getNextNode() throws AssertionError {
        throw new AssertionError();
    }

    @Override
    public int getDepth() {
        return 0;
    }
}
