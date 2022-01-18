public class MyLinkedList {
    public static class Node {
        int value;
        Node next;// Gia tri mac dinh la NULL -> De tro toi node tiep theo

        Node(int val) {
            this.value = val;
        }
    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node tmp = head;
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

    public static Node addToHead(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    public static Node addToLast(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode == null) {
            return newNode;
        } else {
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return headNode;
    }

    public static Node addToIndex(Node headNode, int value, int index) {

        if (index == 0) {
            return addToHead(headNode, value);
        } else {
            // B1. Tim vi tri can them
            Node newNode = new Node(value);
            Node curNode = headNode;
            int count = 0;
            while (curNode != null) {
                count++;
                if (count == index) {
                    // Thuc hien add
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }
        }

        return headNode;
    }

    public static Node removeAtHead(Node headNode) {
        if (headNode != null) {
            return headNode.next;
        }
        return headNode;
    }

    public static Node removeAtTail(Node headNode) {
        if (headNode == null) {
            return null;
        }
        // B1 Xd last va previous Node
        Node lastNode = headNode;
        Node prevNode = null;

        while (lastNode.next != null) {
            prevNode = lastNode;
            lastNode = lastNode.next;
        }
        if (prevNode == null) { // neu day thi se ko nhay vao vong while => List chi co 1 node
            return null;
        } else {
            prevNode.next = lastNode.next;
        }
        return headNode;
    }

    public static Node removeAtIndex(Node headNode, int idx) {
        if (headNode == null || idx < 0)
            return null;
        if (idx == 0)
            return removeAtHead(headNode);
        Node currNode = headNode;
        Node prevNode = null;
        int count = 0;
        boolean bIsFound = false;
        while (currNode != null) {
            if (count == idx) {
                // Remove currNode
                bIsFound = true;
                break;
            }
            prevNode = currNode;
            currNode = currNode.next;
            count++;
        }

        // Remove currNode
        if (bIsFound) {
            if (prevNode == null) { // CurrNode is LastNode
                return null;
            } else {
                if (currNode != null) {
                    prevNode.next = currNode.next;
                }
            }
        }
        return headNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(4);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        printLinkedList(n1);
        // // printLinkedList(n2);
        // n1 = addToHead(n1, 0);
        // printLinkedList(n1);
        // n1 = addToLast(n1, 4);
        // n1 = addToHead(n1, 0);
        // printLinkedList(n1);
        // n1 = addToIndex(n1, 13, 2);
        // printLinkedList(n1);
        // n1 = addToIndex(n1, 13, 0);
        // printLinkedList(n1);
        // n1 = addToIndex(n1, 0, 0);
        // printLinkedList(n1);
        // n1 = removeAtTail(n1);
        // printLinkedList(n1);
        // n1 = removeAtTail(n1);
        // printLinkedList(n1);
        // n1 = removeAtTail(n1);
        // printLinkedList(n1);
        n1 = removeAtIndex(n1, 0);
        printLinkedList(n1);
        n1 = removeAtIndex(n1, 1);
        printLinkedList(n1);
        n1 = removeAtIndex(n1, 1);
        printLinkedList(n1);

    }
}
