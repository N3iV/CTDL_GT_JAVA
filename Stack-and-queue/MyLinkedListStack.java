import java.util.ArrayList;

public class MyLinkedListStack implements IStackQueue {

    private class Node {
        int val;
        Node next;

        Node(int value) {
            this.val = value;
        }
    }

    Node topNode;

    MyLinkedListStack() {
        topNode = null;

    }

    @Override
    public boolean push(int value) {
        // Them 1 ptu vao dau LinkedList
        if (!isFull()) {

            Node newNode = new Node(value);
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (isEmpty())
            return -1;
        int val = topNode.val;
        topNode = topNode.next;
        return val;
    }

    @Override
    public boolean isFull() {

        return false; // Khi nao tran bo nho moi full -> tuy
    }

    @Override
    public boolean isEmpty() {

        return topNode == null;
    }

    @Override
    public void Show() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        Node tmp = topNode;
        ArrayList<Integer> tmpList = new ArrayList<>();
        while (tmp != null) {
            tmpList.add(tmp.val);
            tmp = tmp.next;
        }
        for (int i = tmpList.size() - 1; i >= 0; i--) {
            System.out.print(tmpList.get(i) + " ");
        }
        System.out.println();
    }

}
