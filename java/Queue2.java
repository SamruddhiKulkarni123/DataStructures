// Queue

class node
{
    public int data;
    public node next;

    public node(int no)
    {
        this.data = no;
        this.next = null;
    }
}

class Queue
{
    private node first;
    private int iCount;

    public Queue()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void Enqueue(int no)            // Insert Last
    {

    }

    public int Dequeue()                // delete First
    {
        return 0;
    }

    public void Display()
    {

    }

    public int Count()
    {
        return iCount;
    }



}

class Queue2
{
    public static void main(String A[])
    {
        Queue qobj = new Queue();

        
    }
}