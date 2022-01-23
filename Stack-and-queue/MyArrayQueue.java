public class MyArrayQueue implements IStackQueue {
    private int[] array;
    private int SIZE;
    private int headIdx;
    private int tailIdx;

    MyArrayQueue(int size) {
        SIZE = size;
        array = new int[SIZE];
        headIdx = tailIdx = -1;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            if (isEmpty()) {
                headIdx++;
            }
            tailIdx++;
            array[tailIdx] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int val = -1;
        if (!isEmpty()) {
            val = array[headIdx];

            headIdx++;
            if (headIdx > tailIdx) {
                headIdx = tailIdx = -1;
            }
        }
        return val;
    }

    @Override
    public boolean isFull() {
        return tailIdx == SIZE - 1;
    }

    @Override
    public boolean isEmpty() {
        if (headIdx == -1 && tailIdx == -1) {
            return true;
        }
        return false;
    }

    @Override
    public void Show() {
        if (isEmpty()) {
            System.out.println("QUEUE IS EMPTY");
        } else {
            for (int i = headIdx; i <= tailIdx; i++) {
                System.out.print(array[i] + " ");

            }
            System.out.println();

        }

    }

    public int count() {
        if (isEmpty())
            return 0;
        return tailIdx - headIdx + 1;
    }

}
