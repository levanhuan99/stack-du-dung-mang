public class Test {
    public static void main(String[] args) {
        MyStack stack=new MyStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("size trươc khi pop "+stack.getSize());
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("size sau khi pop "+stack.getSize());

    }


}
