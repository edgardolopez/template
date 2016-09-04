package ar.fiuba.tdd.template.linkedlist.nodes;

public class Node<T> extends AbstractNode<T> {
    public Node(T dataNode) {
        this.data = dataNode;
        this.nextNode = new NullNode<>();
    }

    @Override
    public AbstractNode<T> insertNode(AbstractNode<T> node) {
        this.nextNode = this.nextNode.insertNode(node);
        return this;
    }

    @Override
    public AbstractNode<T> getNextNode() {
        return this.nextNode;
    }

    @Override
    public T getValue() {
        return this.data;
    }

    @Override
    public int getDepth() {
        return this.nextNode.getDepth() + 1;
    }
}
