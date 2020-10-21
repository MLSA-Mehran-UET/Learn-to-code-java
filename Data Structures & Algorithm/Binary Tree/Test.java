public class Test{
    public static void main(String[]args)
    {
        //The given tree to make is written in register
        //First we will make all the leafs
        BinaryTree treeB = new BinaryTree("B");
        BinaryTree treeD = new BinaryTree("D");
        BinaryTree treeE = new BinaryTree("E");    //All the leafs are created.
        BinaryTree treeC = new BinaryTree("C",treeD,treeE);
        BinaryTree treeA = new BinaryTree("A",treeB,treeC);

        System.out.println("TreeB --> isLeaf: "+treeB.isLeaf());
        System.out.println("TreeD --> isLeaf: "+treeD.isLeaf());
        System.out.println("TreeE --> isLeaf: "+treeE.isLeaf());
        System.out.println("TreeC --> isLeaf: "+treeC.isLeaf());
        System.out.println("TreeA --> isLeaf: "+treeA.isLeaf());

        System.out.println("TreeB --> Size: "+treeB.size());
        System.out.println("TreeD --> Size: "+treeD.size());
        System.out.println("TreeE --> Size: "+treeE.size());
        System.out.println("TreeC --> Size: "+treeC.size());
        System.out.println("TreeA --> Size: "+treeA.size());

        System.out.println("toString() on TreeC: "+treeC.toString());
        System.out.println("toString() on TreeA: "+treeA.toString());
        System.out.println("preOrder() on TreeC: "+treeC.preOrder());
        System.out.println("preOrder() on TreeA: "+treeA.preOrder());
        System.out.println("postOrder() on TreeC: "+treeC.postOrder());
        System.out.println("postOrder() on TreeA: "+treeA.postOrder());

        System.out.println("E in treeC? "+treeC.contains("E"));
        System.out.println("F in treeC? "+treeC.contains("F"));
        System.out.println("C in treeA? "+treeA.contains("C"));
        System.out.println("B in treeA? "+treeA.contains("B"));
        System.out.println("D in treeA? "+treeA.contains("D"));
        System.out.println("Z in treeA? "+treeA.contains("Z"));

        System.out.println("TreeC height: "+treeC.height());
        System.out.println("TreeA height: "+treeA.height());

        treeA.swapSubtrees();
        System.out.println("TreeA --> Swaping of subtrees: "+treeA.toString());
    }
}