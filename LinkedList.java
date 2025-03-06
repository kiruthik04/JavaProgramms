class LinkedList{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = next;
        }
    }

    private Node head;

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void insertAtPosition(int data, int pos){
        Node newNode = new Node(data);
        if(pos == 0){
            insertAtBeginning(data);
        }
        Node temp = head;
        int count = 0;

        while (temp != null && count < pos - 1){
            temp = temp.next;
            count++;
        }

        if(temp == null){
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display(){
        Node temp = head;
        System.out.print("[");
        while(temp != null){
            System.out.print(temp.data);
            if(temp.next != null){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);

        list.insertAtBeginning(0);

        list.insertAtPosition(100, 2);

        list.display();
    }
}