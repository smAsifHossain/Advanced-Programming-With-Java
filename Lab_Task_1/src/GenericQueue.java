public class GenericQueue <T extends Object>{
    private int queueSize;
    T[] queueArray;
    int front = 0;
    int rear = -1;
    int currentSize = 0;
    public GenericQueue(int queueSize){
        this.queueSize = queueSize;
        this.queueArray = (T[]) new Object[this.queueSize];
    }
    public void enqueue(T item) {
        if (isQueueFull()) {
            System.out.println("QUEUE OVERFLOW!!!!!");
        } else {
            rear++;
            if(rear == queueSize-1){
                rear = 0;
            }
            this.queueArray[rear] = item;
            currentSize++;
            System.out.println("Item " + item+ " PUSHED to the Queue....");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("QUEUE UNDERFLOW!!!!!");
        } else {
            front++;
            if(front == queueSize-1){
                System.out.println("Item DEQUEUED: "+queueArray[front-1]);
                front = 0;
            } else {
                System.out.println("Item DEQUEUED: "+queueArray[front-1]);
            }
            currentSize--;
        }
    }

    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == queueSize){
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        }
        return status;
    }
}
