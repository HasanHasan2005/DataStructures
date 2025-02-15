package src;

public class SinglyLinkedList<T> {
    int length;
    Node<T> head;

    public SinglyLinkedList() {
        length = 0;
        head = null;
    }

    private static class Node<T> {
        T data;
        Node<T> next;
        public Node() {}

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    private void addFirst(T data) {
        if (head == null) {
            head = new Node<T>(data, null);
        } else {
            head = new Node<T>(data, head);
        }
        length++;
    }


    private void addLast(T data) {
        if (head == null) {
            head = new Node<T>(data, null);
        } else {
            Node<T> cursor = head;
            while (cursor.next != null) {
                cursor = cursor.next;
            }
            cursor.next = new Node<T>(data, null);
        }
        length++;
    }





    private T getData(Node<T> node) {
        return node.data;
    }

    public void append(T data) {
        addLast(data);
    }
    public T getFirst() {
        return getData(head);
    }

    public int getLength() {
        return length;
    }




    public static void main(String[] args) {

    }
}