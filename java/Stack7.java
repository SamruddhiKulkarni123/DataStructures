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

        newn.next = first;
        first = newn;

        iCount++;

    }

    public int pop()        // Delete First
    {
        int iValue = 0;
        node temp = null;

        if(first == null)
        {
            System.out.println("Stack is empty");
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

    public int peep()       // Delete First
    {
        if(first == null)
        {
            System.out.println("Stack is empty");
            return -1;
            
        }
        else
        {
            int iValue = 0;

            iValue = first.data;

            return iValue;
        }

    }

    public void Display()
    {
        node temp = null;
        temp = first;

        while(temp != null)
        {
            System.out.println("| " +temp.data+ " |");
            temp = temp.next;
        }

    }

    public int Count()
    {
        return iCount;

    }


}

class Stack7
{
    public static void main(String A[])
    {
        int iRet = 0;

        Stack sobj = new Stack();

        sobj.push(101);
        sobj.push(51);
        sobj.push(21);
        sobj.push(11);

        sobj.Display();

        iRet = sobj.Count();
        System.out.println("No. of elements of stack : "+iRet);

        iRet = sobj.pop();
        System.out.println("Poped element is : "+iRet);

        sobj.Display();

        iRet = sobj.Count();
        System.out.println("No. of elements of stack : "+iRet);

        iRet = sobj.peep();
        System.out.println("Peeped element is : "+iRet);

        sobj.Display();

        iRet = sobj.Count();
        System.out.println("No. of elements of stack : "+iRet);

    }
}