public class CircularlyLinkedListTester {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> list=new CircularlyLinkedList<>();
//        System.out.println(list.isEmpty());
        list.addFirst(11);
        list.addLast(12);
//        for (int i = 0; i <list.size() ; i++) {
//            System.out.println(list.first());
//            list.rotate();
//        }
//        System.out.println(list.size2());

        CircularlyLinkedList<Integer> list2=new CircularlyLinkedList<>();
        list2.addFirst(11);
        list2.addLast(12);
//        list2.addLast(13);
//        System.out.println(list.SameSeq(list2));
    }
}
