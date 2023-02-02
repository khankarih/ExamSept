public class LinkedList {    
        
     
    class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
     
      
    public Node head = null;    
    public Node tail = null;    
        
     
    public void addNode(int data) {    
          
        Node newNode = new Node(data);    
            
           
        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
             
            tail.next = newNode;    
           
            tail = newNode;    
        }    
    }    
        
    
    public int countNodes() {    
        int count = 0;    
          
        Node current = head;    
            
        while(current != null) {    
            
            count++;    
            current = current.next;    
        }    
        return count;    
    }    
            
        
    public void display() {    
        
        Node current = head;    
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            //Prints each node by incrementing pointer    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    } 
    public void addAtEnd(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
  
        //Checks if the list is empty  
        if(head == null) {  
            //If list is empty, both head and tail will point to new node  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode 


            tail.next = newNode;  
            
            tail = newNode;  
        }  
    }  
        
    public static void main(String[] args) {    
            
    LinkedList sList = new LinkedList();    
            
        //Add nodes to the list    
        sList.addNode(1);    
        sList.addNode(2);    
        sList.addNode(3);    
        sList.addNode(4);    
           
        sList.addAtEnd(50);
        
        //Displays the nodes present in the list    
        sList.display();    
            
        //Counts the nodes present in the given list    
        System.out.println("Count of nodes present in the list: " + sList.countNodes());    
    }    
}   
