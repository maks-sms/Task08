public class IntStack {

    private int[] array = new int[10];
    private int top = -1;

    public void push(int i) {
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
