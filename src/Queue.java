import java.util.LinkedList;

public class Queue<T> implements QueueInterface<T> {
    private final LinkedList<T> list = new LinkedList<>();

    @Override
    public void enqueue(T item) {
        list.addLast(item);
    }

    @Override
    public T dequeue() {
        return list.poll();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public T peek() {
        return list.peek();
    }
}
