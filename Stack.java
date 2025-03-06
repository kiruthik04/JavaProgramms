class Stack{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public Stack(){
        top = null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop(){
        if(top == null){
            throw new IllegalStateException("Stack underflow: Cannot pop from an empty stack;");
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;

    }

    public int peek(){
        if(top == null){
            throw new IllegalStateException("Stack underflow: Cannot peek from an empty stack;");
        }
        return top.data;
    }

    public void display(){
        Node temp = top;
        System.out.print("[");
        while(temp != null){
            System.out.print(temp.data);
            if(temp.next != null){
                System.out.print(",");
            }
            temp = temp.next;
        }
        System.out.println("]");
    }

    public boolean isEmpty(){
        if(top == null){
            return true; 
        }
        return false;
    }

    public static void main(String[] args){
        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.peek();

        System.out.println(st.isEmpty());

        st.display();

    }
}