public class LinkedList{
    Node head = null;
    Node tail = null;
    int count = 0;
    public void add(int num, int pos){
        Node newNode = new Node(num);
        
        if(pos > count){
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = tail.next;
            }
        }
        else{
            Node trav = head;
            Node trav2 = head.next;
            for(int i = 0;i< pos;i++){
                trav = trav.next;
                trav2 = trav2.next;
            }
            trav.next = newNode;
            trav.next.next = trav2;
        }

        count++;
        System.out.println("total count is : "+count);
    }

    public void display(){
        Node temp = head ;
        while(temp !=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10,1);
        list.add(20,2);
        list.add(30,3);
        list.add(40,4);
        list.display();
    }
}