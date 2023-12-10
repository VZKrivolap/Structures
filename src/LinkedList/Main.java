package LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.addLast("poka");
        System.out.println(linkedList.size());
        System.out.println(linkedList.getElementByIndex(0));
    }
}
