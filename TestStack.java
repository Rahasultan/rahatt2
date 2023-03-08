public class TestStack {
    public static void main(String[] args) {
        DoublyStack<Integer>s= new DoublyStack<>();
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.push(10);
        s.push(20);
        s.push(30);

        while (!s.isEmpty())
            System.out.println(s.pop());
    }
}
