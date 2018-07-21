/**
 * @author chenghao.li@hand-china.com
 * @since 2018年07月21日 16:44:36
 */
public class Main {

    public static void main(String[] args) {

        Array array = new Array(20);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);

        array.add(1, 1000);
        System.out.println(array);

        array.addFirst(-11);
        System.out.println(array);

        System.out.println(array.get(9));

        array.set(9, 77);
        System.out.println(array);
    }

    public void basicArray() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int[] scopes = new int[]{100, 99, 80};
        for (int i = 0; i < scopes.length; i++) {
            System.out.println(scopes[i]);
        }

        scopes[0] = 90;
        for (int scope: scopes) {
            System.out.println(scope);
        }
    }
}