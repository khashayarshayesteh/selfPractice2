package greatLearning;

public class LList2 {
    Node head, tail;

    class Node {
        int data;
        Node next;

        Node(int data) {                    //parametrize construction
            this.data = data;
        }
    }

    void insertElements(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;

        }


    }

    void displayElements() {
        Node n1 = head ;
        if (tail == null && head == null) {
            System.out.println("circular list is empty, nothing to display");
        }else {
            do{
                System.out.print(n1.data + " ");
                n1 = n1.next;

            }while ((n1!= head));

        }
    }

    void deleteElements(){
        if(tail!=head){
            head= head.next;
            tail.next = head;
        }else {
            head=tail=null;
        }

    }


    public static void main(String[] args) {
        LList2 list1 = new LList2();
        list1.insertElements(2);
        list1.insertElements(7);
        list1.insertElements(8);
        list1.displayElements();
        list1.deleteElements();
        System.out.println();
        list1.displayElements();


    }
}
