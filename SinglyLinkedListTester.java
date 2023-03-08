import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SinglyLinkedListTester {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list=new SinglyLinkedList<>();
//        System.out.println(list.isEmpty());
//        System.out.println(list.size());
        list.addFirst(10);
        list.addFirst(9);
        list.addLast(11);

        SinglyLinkedList<Integer> list2=new SinglyLinkedList<>();
        list2.addFirst(13);
        list2.addFirst(12);
////        System.out.println(list.equals(list2));
//        while (!list.isEmpty())
//        {
//            System.out.print(list.removeFirst()+" ");
//        }

//        System.out.println("\n");
//
////       list.findFromSecond();
//        list.addFirst(10);
//        list.addFirst(9);
//        list.addLast(11);
//        list.rotate();
//        while (!list.isEmpty())
//        {
//            System.out.print(list.removeFirst()+" ");
//        }
        list.concat(list2);
        System.out.println(list.size());
        while (!list.isEmpty())
        {
            System.out.print(list.removeFirst()+" ");
        }

    }
}




//   public SinglyLinkedList concat(SinglyLinkedList list)
//   {
//       SinglyLinkedList all=new SinglyLinkedList();
//       while (head.next!=null)
//       {
//           all.head=head;
//           all.addLast(head.element);
//           head=head.next;
//           all.head=head.next;
//       }
//          all.addLast(head.element);
////       System.out.println(all.head.element);
//
//      while (list.head.next!=null)
//   {
//       all.addLast(list.head.element);
//       list.head= list.head.next;
//       all.head=head.next;
//   }
//       all.addLast(list.head.element);
//       return all;
//   }
