public class BinaryTest {
    public static void main(String[] args) {
        BinaryST<Integer, String> tree = new BinaryST<>();
        tree.put(5, "five");
        tree.put(3, "three");
        tree.put(7, "seven");
        tree.put(1, "one");
        tree.put(4, "four");

        for (var elem : tree) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }

        System.out.println("Size of tree: " + tree.size());
    }
}