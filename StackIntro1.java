public class L_34_StackIntro1 
{
    protected int[] data;        
    protected int tos;
    public L_34_StackIntro1()         
    {
        data = new int[5];      
        tos = -1;
    }
    public L_34_StackIntro1(int cap)     
    {
        data = new int[cap];
        tos = -1;
    }
    public void push(int item) throws Exception
    {
        if(isFull())
        {
            throw new Exception("Stack is full");
        }
        tos++;
        data[tos] = item;
    }
    public int pop() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Stack is empty");
        }
        int temp = data[tos];           
        data[tos]= 0;                   
        tos--;                          
        return temp;                    
    }
    public int peek() throws Exception
    {
        int temp = data[tos];
        return temp;
    }
    public int size()
    {
        return tos+1;                   
    }
    public boolean isEmpty()
    {
        return size() == 0;             
    }
    public boolean isFull()
    {
        return size() == data.length;
    }
    public void display()
    {
        for(int i = tos ; i>=0 ; i--)
        {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
