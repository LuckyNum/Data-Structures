package stack;

/**
 * @author lch
 * @since 2018年07月23日 10:06:36
 */
public class ArrayStack<E> implements Stack<E> {

    private DynamicArray<E> array;

    public ArrayStack(int capacity) {
        this.array = new DynamicArray<>(capacity);
    }

    public ArrayStack() {
        this.array = new DynamicArray<>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("stack.Stack: [");
        for (int i = 0; i < array.getSize(); i++) {
            builder.append(array.get(i));
            if (i != (array.getSize() - 1)) {
                builder.append(",");
            }
        }
        builder.append("] top");
        return builder.toString();
    }
}
