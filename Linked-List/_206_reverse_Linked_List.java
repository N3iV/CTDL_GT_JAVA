public class _206_reverse_Linked_List {
    public static class ListNode {
        int value;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.value = val;
        }

        ListNode(int val, ListNode next) {
            this.value = val;
            this.next = next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode currNode = head;
        while (currNode != null && currNode.next != null) {
            ListNode nextNode = currNode.next;
            currNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }
        return head;
    }

    public static ListNode reverseWithRecursion(ListNode head) {

        // ! TH co so

        // TH Rong
        if (head == null)
            return null;
        // TH 1 Node
        ListNode nextNode = head.next;
        if (nextNode == null)
            return head;
        // Th 2 Node tro len (Tong quat)
        ListNode newHead = reverseWithRecursion(nextNode);
        // Sau khi reverse thi nextNode se thanh tail (lastNode)
        nextNode.next = head;
        head.next = null;
        return newHead;
    }

    public static void printLinkedList(ListNode head) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            ListNode tmp = head;
            while (tmp != null) {
                System.out.print(tmp.value);
                tmp = tmp.next;
                if (tmp != null)
                    System.out.print("->");
                else
                    System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        a1.next = a2;
        a2.next = a3;
        // printLinkedList(a1);
        // a1 = reverseList(a1);
        // printLinkedList(a1);
        ListNode newList = reverseWithRecursion(a1);
        printLinkedList(newList);

    }
}
