public class DoublyLinkedListTester {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list=new DoublyLinkedList<>();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        while (!list.isEmpty())
        {
            System.out.print(list.removeFirst()+" ");

        }
    }

}
