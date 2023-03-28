import java.util.*;
class ex1 extends Exception{}

public class pattern {
    public static void main(String[] args) {
        LinkedList<Integer> qu = new LinkedList<>();
        Stack<Integer> qu1 = new Stack<>();
        qu.offer(5);
        qu.offer(8);
        qu.offer(6);
        qu.offer(9);
        System.out.println(qu);
    }
}
