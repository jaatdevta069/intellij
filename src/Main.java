public class Main {
    public static void main(String[] args) {
     DynamicArray array = new DynamicArray();
        System.out.println(array.capacity);
        array.add("A");
        array.add("B");
        array.add("S");
        array.add("Q");
        array.add("D");
        array.insert(3,"r");
        System.out.println(array);
        System.out.println("size = "+array.size);
        System.out.println("capacity = "+array.capacity);
        System.out.println("empty : "+array.isEmpty());
    }
}