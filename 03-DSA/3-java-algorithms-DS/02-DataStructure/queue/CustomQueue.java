package queue;
class CustomQueue {

    protected int[] data;
    private static int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }


    public boolean isFull(){
        return end == data.length - 1;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int v) {
        if(isFull()){
            return false;
        }
        data[end] = v;
        end++;
        retun true;
    }
    public  int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("The queue is empty");
        }
        int removed = data[0];
        for(int i = 1 ; i < end ; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public  int head() throws Exception {
        if(isEmpty()) {
            throw new Exception("The queue is empty");
        }
        return data[0];
    }



}
