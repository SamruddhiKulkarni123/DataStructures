//Binary Search Tree

class node
{
    public int data;
    public node lChild;
    public node rChild;

    public node(int no)
    {
        this.data = no;
        this.lChild = null;
        this.rChild = null;
    }

}

class BinarySerachTree
{
    private node first;
    private int iCount;
    private int LeafCount;

    public BinarySerachTree()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void Insert(int no)
    {
        node newn = null;
        node temp = null;

        newn = new node(no);
        

        if(first == null)
        {
            first = newn;
            iCount++;
        }
        else
        {
            temp = first;

            while(true)
            {
                if(no > temp.data)
                {
                    if(temp.rChild == null)
                    {
                        temp.rChild = newn;
                        iCount++;
                        break;
                    }

                    temp = temp.rChild;
                }
                else if(no < temp.data)
                {
                    if(temp.lChild == null)
                    {
                        temp.lChild = newn;
                        iCount++;
                        break;
                    }

                    temp = temp.lChild;
                }
                else if(no == temp.data)
                {
                    System.out.println("Unable to insert as element is duplicate");

                    newn = null;
                    System.gc();

                    break;
                }
            }

        }

    }

    // L D R
    public void Inorder()
    {
        Inorder(first);

    }

    private void Inorder(node temp)
    {
        if(temp != null)
        {
            Inorder(temp.lChild);
            System.out.print(temp.data+" ");
            Inorder(temp.rChild);

        }
    }

    // D L R
    public void Preorder()
    {
        Preorder(first);

    }

    private void Preorder(node temp)
    {
        if(temp != null)
        {
            System.out.print(temp.data+" ");
            Preorder(temp.lChild);
            Preorder(temp.rChild);
        }
        
    }
    
    // L R D
    public void Postorder()
    {
        Postorder(first);

    }

    private void Postorder(node temp)
    {
        if(temp != null)
        {
            Postorder(temp.lChild);
            Postorder(temp.rChild);
            System.out.print(temp.data+" ");
        }

    }

    public int Count()
    {
        return iCount;
    }

    public boolean Search(int no)
    {
        boolean bFlag = false;
        node temp = first;

        while(temp != null)
        {
            if(no == temp.data)
            {
                bFlag = true;
                break;
            }
            else if(no > temp.data)
            {
                temp = temp.rChild;
            }
            else if(no < temp.data)
            {
                temp = temp.lChild;
            }
        }

        return bFlag;
    }

    public int CountLeafNodes()
    {
        LeafCount = 0;
        CountLeafNodes(first);
        return LeafCount;
    }

    private void CountLeafNodes(node temp)
    {
        if(temp != null)
        {
            if((temp.lChild == null) && (temp.rChild == null))
            {
                LeafCount++;
            }

            CountLeafNodes(temp.lChild);
            CountLeafNodes(temp.rChild);

        }
    }

    public int CountParentNodes()
    {
        return 0;
    }

}
class BST7
{
    public static void main(String A[])
    {
        int iRet = 0;
        boolean bRet = false;
        BinarySerachTree bobj = new BinarySerachTree();

        bobj.Insert(15);
        bobj.Insert(11);
        bobj.Insert(17);
        bobj.Insert(19);
        bobj.Insert(14);

        System.out.println("Inorder Display : ");
        bobj.Inorder();

        System.out.println();
        
        System.out.println("Preorder Display : ");
        bobj.Preorder();

        System.out.println();
        
        System.out.println("Postorder Display : ");
        bobj.Postorder();

        System.out.println();

        iRet = bobj.Count();
        System.out.println("Number of elements in tree are : "+iRet);

        bRet = bobj.Search(14);
        if(bRet == true)
        {
            System.out.println("Element is present in BST");
        }
        else
        {
            System.out.println("Element is not present in BST");
        }

        iRet = bobj.CountLeafNodes();
        System.out.println("Total leaf nodes are : "+iRet);

    }
}