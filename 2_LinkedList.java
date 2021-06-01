public class LinkedList {
    private class Node               
    {
        int data;
        Node next;                     

        Node(int data)                     
        {
            this.data = data;
        }
        Node()                            
        {

        }
    }
    private Node head;                 

    public void Display()
    {
        Node temp = head;                         

        while(temp != null)                                
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public int size()
    {
        Node temp = head;               
        int count = 0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public boolean isEmpty()
    {
        // return size() == 0;           
        return head == null;             
    }
    public int getFirst() throws Exception
    {
        if(isEmpty())          
        {
            throw new Exception("Linked list is empty");
        }
        return head.data;
    }
    public int getLast() throws Exception
    {
        if(isEmpty())          
        {
            throw new Exception("Linked list is empty");
        }       
        Node temp = head;

        while(temp.next != null)
        {
            temp = temp.next;
        }
        return temp.data;                      
    }
    public int getAt(int idx) throws Exception
    {
        if(isEmpty())          
        {
            throw new Exception("Linked list is empty");
        }
        if(idx < 0 || idx > size()-1)
        {
            throw new Exception("Invalid index");
        }
        if(idx == 0)
        {
            return getFirst();
        }
        else if(idx == size()-1)
        {
            return getLast();
        }
        Node temp = head;
        for(int i = 1 ; i <= idx ; i++)
        {
            temp = temp.next;
        }        
        return temp.data;
    }
    private Node getNodeAt(int idx) throws Exception
    {
        if(isEmpty())          
        {
            throw new Exception("Linked list is empty");
        }
        if(idx < 0 || idx > size()-1)
        {
            throw new Exception("Invalid index");
        }   
        Node temp = head;
        for(int i = 1 ; i <= idx ; i++)
        {
            temp = temp.next;
        }   
        return temp;                   
    }
    public void addLast(int item) throws Exception
    {
        Node nn = new Node();
        nn.data = item;             
        nn.next = null;             
        if(isEmpty())               
        {
            head = nn;
        }
        else
        {
            //linking the node
            Node last = getNodeAt(size()-1);           
            last.next = nn;                            
        }
    }
    public void addFirst(int item) throws Exception
    {
        //create a new node
        Node nn = new Node();
        nn.data = item;
        nn.next = null;
        nn.next = head;
        head = nn;              
    }
    public void addAt(int idx , int item) throws Exception
    {
        if(idx < 0 || idx > size())
        {
            throw new Exception("Invalid Syntax");
        }
        if(idx == 0)
        {
            addFirst(item);
        }
        else if(idx == size())
        {   
            addLast(item);
        } 
        else
        {
            Node nn = new Node();
            nn.data = item;           
            nn.next = null;                    
            //linking
            Node n1 = getNodeAt(idx-1);
            Node n2 = getNodeAt(idx);            
            n1.next = nn;
            nn.next = n2;
        } 
    }
    public int removeLast() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Linked List empty");
        }
        int rv = getLast();                                
        if(size()==1)                      
        {
            head = null;
        }
        else
        {
            Node sm2 = getNodeAt(size()-2);                     
            sm2.next = null;                                    
        }

        return rv;
    }
    public int removeFirst() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Linked List empty");
        }
        int rv = getFirst();

        if(size()==1)
        {
            head = null;
        }
        else
        {
            head = head.next;                      
        }

        return rv;
    }
    public int removeAt(int idx) throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Linked List empty");
        }
        if(idx < 0 || idx >= size())
        {
            throw new Exception("Invalid index");
        }
        if(idx == 0)
        {
            return removeFirst();
        }
        if(idx == size() - 1)
        {
            return removeLast();
        }
        else
        {
            Node im1 = getNodeAt(idx - 1);            
            Node i = im1.next;              
            Node ip1 = i.next;             
            im1.next = ip1;           
            return i.data;
        }
        
    }
}

public class main {
    public static void main(String[] args) throws Exception 
    {
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addFirst(5);       
        ll.addAt(3, 66);
    }
}
