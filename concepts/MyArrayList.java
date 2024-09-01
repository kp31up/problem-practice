package concepts;

public class MyArrayList<T> {
    private T[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    // Constructor to initialize the list with a default capacity
    public MyArrayList() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
    }

    // Method to add an element to the list
    public void add(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    // Method to fetch an element at a given index
    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }

    // Method to delete an element at a given index
    public T remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        T removedElement = elements[index];

        // Shift elements to the left to fill the gap
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[size - 1] = null; // Clear the last element
        size--;

        return removedElement;
    }

    // Method to get the current size of the list
    public int size() {
        return size;
    }

    // Method to check if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Internal method to resize the array when it's full
    private void resize() {
        T[] newArray = (T[]) new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }

    // Main method for testing the MyArrayList class
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>();

        // Adding elements
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);

        // Fetching elements
        System.out.println("Element at index 2: " + myList.get(2)); // Output: 30

        // Removing an element
        System.out.println("Removed element at index 1: " + myList.remove(1)); // Output: 20

        // Fetching elements after removal
        System.out.println("Element at index 1: " + myList.get(1)); // Output: 30

        // Size of the list
        System.out.println("Size of list: " + myList.size()); // Output: 4

        // Checking if the list is empty
        System.out.println("Is list empty? " + myList.isEmpty()); // Output: false
    }
}

