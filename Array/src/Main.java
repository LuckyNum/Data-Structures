/**
 * @author chenghao.li@hand-china.com
 * @since 2018年07月21日 16:44:36
 */
public class Main {

    public static void main(String[] args) {

        DynamicArray<Integer> array = new DynamicArray<>();
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);

        array.add(1, 1000);
        System.out.println(array);

        array.addFirst(-11);
        System.out.println(array);

        array.remove(2);
        System.out.println(array);

        array.removeElement(-11);
        System.out.println(array);

        array.removeLast();
        System.out.println(array);
    }

    /**
     * 对象数组
     */
    public void objectArray() {
        ObjectArray<Student> objectArray = new ObjectArray<>();
        objectArray.addLast(new Student("Alice", 90));
        objectArray.addLast(new Student("Bob", 80));
        objectArray.addLast(new Student("Jack", 70));
        System.out.println(objectArray);
    }

    /**
     * int数组
     */
    public void intArray() {
        IntArray intArray = new IntArray(20);
        for (int i = 0; i < 10; i++) {
            intArray.addLast(i);
        }
        System.out.println(intArray);

        intArray.add(1, 1000);
        System.out.println(intArray);

        intArray.addFirst(-11);
        System.out.println(intArray);

        System.out.println(intArray.get(9));

        intArray.set(9, 77);
        System.out.println(intArray);

        intArray.remove(2);
        System.out.println(intArray);

        intArray.removeElement(-11);
        System.out.println(intArray);

        intArray.removeLast();
        System.out.println(intArray);
    }

    /**
     * 基本数组
     */
    public void basicArray() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int[] scopes = new int[]{100, 99, 80};
        for (int scope1 : scopes) {
            System.out.println(scope1);
        }

        scopes[0] = 90;
        for (int scope: scopes) {
            System.out.println(scope);
        }
    }
}