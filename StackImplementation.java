class StackImplementation{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public StackImplementation() {
        top = null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int peek(){
        if(top == null){
            throw new IllegalStateException("Stack underflow: Cannot pop from an empty stack;");
        }
        return top.data;
    }

    public int pop(){
        if(top == null){
            throw new IllegalStateException("Stack underflow: Cannot pop from an empty stack;");
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    public void display(){
        Node temp = top;
        // System.out.print("Stack:");
        System.out.print("[");
        while(temp != null){
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.print("]");
    }


    public static void main(String[] args){
        StackImplementation st = new StackImplementation();

        st.push(100);
        st.push(10);
        st.push(1);
        
        st.pop();

        st.display();
    }
        
}