/**
 * @author chenghao.li@hand-china.com
 * @since 2018年07月21日 16:57:30
 */
public class IntArray {

    private int[] data;
    private int size;

    /**
     *  构造函数，传入数组的容量capacity构造Array
     * @param capacity
     */
    public IntArray(int capacity) {
        this.data = new int[capacity];
        this.size = 0;
    }

    /**
     * 无参构造，默认大小为10
     */
    public IntArray() {
        this(10);
    }

    /**
     * 获取数组中元素个数
     * @return
     */
    public int getSize() {
        return this.size;
    }

    /**
     * 获取数组的容量
     * @return
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * 返回数组是否为空
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 向所有元素后添加一个新元素
     * @param e
     */
    public void addLast(int e) {
        add(size, e);
    }

    /**
     * 向所有元素前添加一个新元素
     * @param e
     */
    public void addFirst(int e) {
        add(0, e);
    }

    /**
     * 向指定位置插入
     * @param index
     * @param e
     */
    public void add(int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("Add failed. IntArray is full.");
        }

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. index should in [0, size].");
        }

        //index后的所有元素后移一位
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = e;
        size++;
    }

    /**
     * 获取index处元素
     * @param index
     * @return
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }
        return data[index];
    }

    /**
     * 更新index处元素
     * @param index
     * @param e
     */
    public void set(int index, int e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }
        data[index] = e;
    }

    /**
     * 查找数组中是否有元素e
     * @param e
     * @return
     */
    public boolean contains(int e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return true;
            }
        }
        return false;
    }

    /**
     * 查找数组中元素e的索引，如果不存在，返回-1
     * 查找的是最左边的第一个
     * @param e
     * @return
     */
    public int find(int e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 删除指定index元素
     * @param index
     * @return 被删除元素
     */
    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
        }
        int ret = data[index];
        // 从被删除索引处，元素左移一位
        for (int i = index + 1; i < size; i++) {
            data[i-1] = data[i];
        }
        size--;
        return ret;
    }

    /**
     * 删除第一个元素
     * @return 被删除元素
     */
    public int removeFirst() {
        return remove(0);
    }

    /**
     * 删除最后一个元素
     * @return 被删除元素
     */
    public int removeLast() {
        return remove(size - 1);
    }

    /**
     * 删除指定元素
     * @param e
     */
    public void removeElement(int e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("IntArray: size = %d, capacity = %d\n", size, data.length));
        builder.append("[");
        for (int i = 0; i < size; i++) {
            builder.append(data[i]);
            if (i != size-1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
