class BinaryTree{
    Object root;
    BinaryTree left;
    BinaryTree right;
    public BinaryTree(Object root){
        this.root=root;
    }
    public BinaryTree(Object root,BinaryTree left,BinaryTree right){
        this.root=root;
        this.left=left;
        this.right=right;
    }
    public Object setRoot(Object root){
        Object oldRoot = this.root;
        this.root=root;
        return oldRoot;
    }
    public Object getRoot(){
        return root;
    }
    public BinaryTree setLeft(BinaryTree left){
        BinaryTree oldLeft=this.left;
        this.left=left;
        return oldLeft;
    }
    public BinaryTree getLeft(){
        return left;
    }
    public BinaryTree setRight(BinaryTree right){
        BinaryTree oldRight=this.right;
        this.right=right;
        return oldRight;
    }

    public BinaryTree getRight(){
        return right;
    }

    public boolean isLeaf(){
        if(left==null && right==null)
            return true;
        return false;
    }

    public int size(){
        if(left==null && right==null)
            return 1;
        if(left==null)
            return 1+right.size();
        if(right==null)
            return 1+left.size();
        return 1+left.size()+right.size();
    }
    
    public String toString(){
        StringBuffer buffer = new StringBuffer("");
        if(left!=null)
            buffer.append(left+",");
        buffer.append(root);
        if(right!=null)
            buffer.append(","+right);
        return buffer+"";
    }

    public String preOrder(){
        StringBuffer buffer = new StringBuffer("");
        buffer.append(root);
        if(left!=null)
            buffer.append(","+left.preOrder());
        if(right!=null)
            buffer.append(","+right.preOrder());
        return buffer+"";
    }

    public String postOrder(){
        StringBuffer buffer = new StringBuffer("");
        if(left!=null)
            buffer.append(left.postOrder()+",");
        if(right!=null)
            buffer.append(right.postOrder()+",");
        buffer.append(root);
        return buffer+"";
    }

    public int height(){
        if(root==null)
            return -1;
        int lefts=0;
        int rights=0;
        if(left!=null)
            lefts = 1+left.height();
        if(right!=null)
            rights = 1 + right.height();
        return lefts>rights?lefts:rights;   //if left is greater than left will be returned else right will be returned    
    }

    public boolean contains(Object object){
        if(root.equals(object))
            return true;
        boolean contains=false;
        if(left!=null){
            if(left.toString().equals(object.toString()))
                contains = left.contains(object);
        }
        if(right!=null){
            if(right.toString().equals(object.toString()))
                contains = right.contains(object);
        }
        return contains;
    }

    public void leftSubtree(){
        LinkedQueue leftSubTree = new LinkedQueue();
        if(left!=null){
            String[] s = left.preOrder().split(",");
            for(int i=0;i<s.length;i++){
                leftSubTree.add(s[i]);
            }
        }
        System.out.println(leftSubTree);
    }

    public void rightSubtree(){
        LinkedQueue rightSubTree = new LinkedQueue();
        if(right!=null){
            String[] s = right.preOrder().split(",");
            for(int i=0;i<s.length;i++){
                rightSubTree.add(s[i]);
            }
        }
        System.out.println(rightSubTree);
    }

    public void swapSubtrees(){
        BinaryTree temp=left;
        left = right;
        right = temp;
    }
}