package leetcode.solution2;

/**
 * @author lch
 * @since 2018年07月23日 10:02:47
 */
public interface Stack<E> {

    /**
     * 获取栈大小
     * @return 栈大小
     */
    int getSize();

    /**
     * 判断是否为空
     * @return 空否
     */
    boolean isEmpty();

    /**
     * 入栈
     * @param e
     */
    void push(E e);

    /**
     * 出栈
     * @return 栈顶元素
     */
    E pop();

    /**
     * 查看栈顶元素
     * @return 栈顶元素
     */
    E peek();
}
