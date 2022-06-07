public class GenericStack <T extends Object>{
    private int stackSize;
    private T[] stackArray;
    private int top;

    public GenericStack(int size) {
        this.stackSize = size;
        this.stackArray = (T[]) new Object[stackSize];
        this.top = -1;
    }

    public void push(T element){
        if(this.isStackFull()){
            System.out.println("Stack OVERFLOW!!!!");
        }
        System.out.println("PUSHED in Stack: "+element);
        this.stackArray[++top] = element;
    }

    public T pop(){
        if(this.isStackEmpty()){
            System.out.println("Stack UNDERFLOW!!!!");
        }
        T element = this.stackArray[top--];
        System.out.println("Item POPPED: "+element);
        return element;
    }


    public boolean isStackEmpty() {
        return (top == -1);
    }

    public boolean isStackFull() {
        return (top == stackSize - 1);
    }
}
