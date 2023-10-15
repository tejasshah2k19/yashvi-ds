public class ArrayDemo {
    public static void main(String[] args) {

        MyArray m = new MyArray(5);
        m.insert(1, 100);
        m.insert(2, 200);
        m.insert(1, 500);
        m.display();
    }
}

class MyArray {

    int array[];
    int size;

    MyArray(int size) {
        this.size = size;
        array = new int[size];
    }

    void insert(int location, int data) {
        int index = location - 1;
        for (int i = size - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
    }

    void display() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(array[i]);
        }
    }
}