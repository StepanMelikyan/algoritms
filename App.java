public class App {
    public static void main(String[] args) throws Exception {
        

}
    static class ListNode {
        int value;
        ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}

    /**
    * Посчитать размер списка.
    */    
    public static int getSize(ListNode head) {
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
    /**
    * Найти значение по индексу
    */
    public static int getValueByIndex(ListNode head, int index) {
        ListNode current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        if (current == null) {
            throw new UnsupportedOperationException("Index " + index + " is out of bounds.");
        }
        return current.value;
        }

    
}
