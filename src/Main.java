import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<long[]> list = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new long[65536]);
            System.out.println("i: " + i);
        }
        System.out.println("done");
    }
}
