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
        node newn = null;
        newn = new node(no);

        node temp = null;

        if(first == null)
        {
            first = newn;
        }
        else
        {
            temp = first;

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
        }

        iCount++;

    }

    public int Dequeue()                // delete First
    {
        int iValue = 0;
        node temp = null;

        if(first == null)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        else
        {
            iValue = first.data;
            temp = first;

            first = first.next;

            temp = null;
            System.gc();

            iCount--;

            return iValue;

        }
    }

    public void Display()
    {
        node temp = null;
        temp = first;

        while(temp != null)
        {
            System.out.println("| "+temp.data+" |");
            temp = temp.next;
        }

    }

    public int Count()
    {
        return iCount;
    }



}

class Queue6
{
    public static void main(String A[])
    {
        int iRet = 0;
        Queue qobj = new Queue();

        qobj.Enqueue(11);
        qobj.Enqueue(21);
        qobj.Enqueue(51);
        qobj.Enqueue(101);
        qobj.Enqueue(111);
        qobj.Display();
        iRet = qobj.Count();
        System.out.println("No. of elements of queue are : "+iRet);

        iRet = qobj.Dequeue();
        qobj.Display();
        iRet = qobj.Count();
        System.out.println("No. of elements of queue are : "+iRet);
        
    }
}