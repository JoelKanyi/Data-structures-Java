public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    public LinkedList(){
        first=null;
        last = null;
        size = 0;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public void  insertAtStart(String e){
        Node temp=new Node();
        temp.setData(e);
        temp.setNext(first);
        first=temp;
    }

    public void traverse(){
        Node ptr= first;
        while (ptr!=null){
            System.out.print(ptr.getData()+",");
            ptr=ptr.getNext();
        }
        System.out.println();
    }

    public Node deleteFirst(){
        Node temp=first;
        if (!isEmpty()){
            first=first.getNext();
        }
        else {
            System.out.println("Empty list");
        }
        return temp;
    }
    public Node deleteAnywhere(String e){
        Node currentNode=first;
        Node previousNode=first;
        while (currentNode.getData() !=e) {
            if (currentNode.getNext() == null){
                System.out.println("ELement not found"); //return null;
        }
        else {
            previousNode=currentNode;
            currentNode=currentNode.getNext();
        }
        }
        if (currentNode==first){
            first=first.getNext();
        }
        else {
            previousNode.setNext(currentNode.getNext());
        }
        return currentNode.getNext();
    }

    public void addLast(String e){
        Node temp = new Node();
        temp.setData(e);
        temp.setNext(null);
        if(isEmpty()){
            first = temp;
        }
        last.setNext(temp);
        last = temp;
        size++;
    }
    public static void main(String[] args){
        LinkedList linkedList=new LinkedList();
        System.out.println("How many elements do you want to insert :");
        int n = sc.nextInt();
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++) {
            String s = sc.next();
            linkedList.insertAtStart(i);
        }
        

        linkedList.deleteFirst();
        linkedList.deleteAnywhere("Kanyi");
        System.out.println(linkedList.isEmpty());

        linkedList.traverse();



        System.out.println(linkedList.deleteAnywhere("tree"));
    }
}

