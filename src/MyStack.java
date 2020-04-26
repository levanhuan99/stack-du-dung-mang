public class MyStack {
    private int[] arr;
    private int size;
    private int index=0;
    public MyStack(int size){
        this.size=size;
        arr=new int[size];
    }
    public int getSize(){
        return this.index;
    }
    public boolean isEmpty(){
        if (this.index==0){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if (this.index==this.size){
            return true;
        }
        return false;
    }
    public void push(int data){
        if (isFull()) {
            throw new IndexOutOfBoundsException("overflow");
        }
        else {
            arr[index]=data;
            System.out.println("added "+data);
            index++;
        }

    }
    public int pop(){
        if (isEmpty()){
            throw new IndexOutOfBoundsException("underflow");
        }
        return arr[--index];

    }


//    private int[] arr;
//    private int size;
//    private int currentIndex=0;
//
//    public MyStack(int size){
//        this.size=size;
//        arr=new int[size];
//    }
//
//    public boolean isEmpty(){
//        if (currentIndex ==0){
//            return  true;
//        }
//        return false;
//    }
//    public boolean isFull(){
//        if (currentIndex ==size){
//            return true;
//        }
//        return false;
//    }
//    public int getSize(){
//        return this.currentIndex;
//    }
//
//    public void push(int element){
//        if (isFull()){
//            System.out.println("over flow");
//        }
//        else {
//            arr[currentIndex]=element;
//            System.out.println(" added "+element);
//            currentIndex++;
//        }
//
//
//    }
//    public int pop(){
//        if (isEmpty()){
//            System.out.println("under flow");
//        }
//
//        return arr[--currentIndex];
//    }
}
