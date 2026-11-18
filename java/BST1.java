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

    public BinarySerachTree()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void Insert(int no)
    {

    }

    public void Inorder()
    {

    }

    public void Preorder()
    {

    }
    
    public void Postorder()
    {

    }

    public int Count()
    {
        return iCount;
    }

    public boolean Serach(int no)
    {
        return false;

    }

    public int CountLeafNodes()
    {
        return 0;
    }

    public int CountParentNodes()
    {
        return 0;
    }

}
class BST1
{
    public static void main(String A[])
    {
        BinarySerachTree bobj = new BinarySerachTree();

    }
}