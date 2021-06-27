public class IntStack {

    private int[] array = new int[10];
    private int top = -1;

    public void push(int i) {
        if (top == array.length - 1) {
            top--;
            int[] newArr = new int[10];
            System.arraycopy(array, 1, newArr, 0, array.length - 1);
            array = newArr;

        }
        top++;
        array[top] = i;


    }

    public int pop() {
        int value = array[top];
        top--;
        return value;
    }

    public int peek() {
        return array[top];
    }
}
