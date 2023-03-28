class Middle {
    Node head;
    Node tail;
class Node{
    int data;
    Node next;
    Node(int d){
        data =d;
        next=null;
    }
}
public void push1(int data1){
    Node new_node = new Node(data1);
    if(tail==null){
        tail=new_node;
        head=new_node;
    }
    else{
    tail.next=new_node;
    tail=new_node;
}}
public void printList(){
    Node tnode= head;
    while(tnode.next!=null)
    {
        System.out.print(tnode.data+"->");
        tnode=tnode.next;
    }
    //System.out.print(tnode.data+"->");
    System.out.println("NULL");
}
public static void main(String[] args){
    Middle llist =new Middle();
    for(int i=5;i>0;i--){
        llist.push1(i);
    }
    llist.printList();

}
}