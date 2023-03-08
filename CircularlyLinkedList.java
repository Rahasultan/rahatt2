import java.util.Objects;

public class CircularlyLinkedList<E> {
    private Node<E> tail=null;
    private int size=0;

    public CircularlyLinkedList() {
    }
    public boolean isEmpty()
   {
     return size==0;
   }
    public int size()
   {
     return size;
   }
    public E first()
    {
        if(isEmpty())return null;
        return tail.next.element;
    }
    public E last()
    {
        if(isEmpty())return null;
        return tail.element;
    }
    public void addFirst(E e)
    {
        if(isEmpty())
        {
            tail=new Node<>(e,null);
            tail.next=tail;
        }
        else {
            Node<E> newest = new Node<>(e, tail.next);
            tail.next = newest;
        }
        size++;
    }
    public void addLast(E e)
    {
        addFirst(e);
        tail=tail.next;
    }

    public E removeFirst()
    {
        if(isEmpty()) return null;
        Node<E> x=tail.next;
        if (x==tail)tail=null;
        else
        tail.next=x.next;
        size--;
        return x.element;
    }
    public void rotate()
    {
        if (!isEmpty()) //if(tail!=null)
        tail=tail.next;
    }
    public int size2()
    {
        int size2=0;
        Node<E> x=tail;
        while (tail.next!=x)
        {
            size2++;
            tail=tail.next;
        }
        size2++;
        return size2;

    }

    public boolean equals(Object o) {
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        CircularlyLinkedList l = (CircularlyLinkedList) o;
        if (size != l.size) return false;
        Node x=tail.next;
        Node Head = tail.next; // traverse the primary list
        Node lHead = l.tail.next; // traverse the secondary list
        while (Head.next !=x) {
            if (!Head.getElement().equals(lHead.getElement())) return false;
            Head = Head.getNext();
            lHead = lHead.getNext();
        }
        if(!Head.getElement().equals(lHead.getElement())) return false;
        return true;
    }

//    public boolean SameSeq(CircularlyLinkedList list)
//    {
//        int i;
//        for ( i = 0; tail== list.tail ; i++) {
//                tail=tail.next;
//                list.tail=tail.next;
//            }
//        if(i==size-1) return true;
//        return false;
//    }

    private class Node<E>{
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

}
