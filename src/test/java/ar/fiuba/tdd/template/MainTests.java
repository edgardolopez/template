package ar.fiuba.tdd.template;

import ar.fiuba.tdd.template.queue.Queue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

public class MainTests {
    @Test
    public void queueNew() {
        Queue<Integer> container = new Queue<>();
        container.add(1);
        container.add(2);
        container.add(3);

        assertEquals(container.top(), new Integer(1));
        container.remove();
        assertEquals(container.top(), new Integer(2));
        container.remove();
        assertEquals(container.top(), new Integer(3));
    }

    @Test
    public void queueSize() {
        Queue<Integer> container = new Queue<>();
        container.add(1);
        container.add(2);
        assertEquals(container.size(),2);

        container.add(3);
        assertEquals(container.size(),3);

        container.remove();
        assertEquals(container.size(),2);
    }

    @Test(expected = AssertionError.class)
    public void queueEmptyRemoveFirstException() {
        Queue<Integer> container = new Queue<>();
        container.remove();
    }

    @Test
    public void queueEmpty() {
        Queue<Integer> container = new Queue<>();
        assertTrue(container.isEmpty());
    }
}
