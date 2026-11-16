// Stack

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

class Stack
{
    private node first;
    private int iCount;

    public Stack()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void push(int no) // Insert First
    {
        node newn = null;
        newn = new node(no);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            newn.next = first;
            first = newn;

        }

        iCount++;

    }

    public int pop()        // Delete First
    {
        return 0;

    }

    public int peep()       // Delete First
    {
        return 0;

    }

    public void Display()
    {

    }

    public int Count()
    {
        return 0;

    }


}

class Stack2
{
    public static void main(String A[])
    {
        Stack sobj = new Stack();

        sobj.push(101);
        sobj.push(51);
        sobj.push(21);
        sobj.push(11);



    }
}