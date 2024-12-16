package Q2.MyArrayList_Lab;

public class IntArrayList {
    private final int DEFAULT_SIZE = 16;
    private int mySize;
    private int[] myArray;
    private int myCapacity;

    public IntArrayList() {
        myArray = new int[DEFAULT_SIZE];
        mySize = 0;
        myCapacity = DEFAULT_SIZE;
    }

    private void doubleCapacity() {
        myCapacity = myCapacity * 2;
        int[] temp = new int[myCapacity];
        for (int i = 0; i < mySize; i++) {
            temp[i] = myArray[i];
        }
        myArray = temp;
    }

    private void halfCapacity() {
        if (mySize > myCapacity / 2) {
            System.out.println("Unable to half capacity.");
        } else {
            myCapacity = myCapacity / 2;
            int[] temp = new int[myCapacity];
            for (int i = 0; i < mySize; i++) {
                temp[i] = myArray[i];
            }
            myArray = temp;
        }
    }

    public void add(int num) {
        if (mySize + 1 == myCapacity) {
            doubleCapacity();
        }
        myArray[mySize] = num;
        mySize++;
    }

    public void remove(int index) {
        for (int i = index + 1; i < mySize; i++) {
            myArray[i - 1] = myArray[i];
        }
        mySize--;
        if (mySize <= (myCapacity * 0.25)) {
            halfCapacity();
        }
    }

    public int get(int index) {
        return myArray[index];
    }

    public void set(int index, int num) {
        myArray[index] = num;
    }

    public int size() {
        return mySize;
    }

    public int[] toArray() {
        return myArray;
    }

    public int indexOf(int num) {
        for (int i = 0; i < mySize; i++) {
            if (myArray[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
