//Make a tree of height 4 --->it will have 31 nodes, formula: 2^h+1 -1
//Make a method which make two queues of left sub-tree and right sub-tree in which the elements were in preorder
public class Task1{
    public static void main(String[]args)
    {
        //First make all the leafs, total leafs=16
        BinaryTree P = new BinaryTree("P");
        BinaryTree Q = new BinaryTree("Q");
        BinaryTree R = new BinaryTree("R");
        BinaryTree S = new BinaryTree("S");
        BinaryTree T = new BinaryTree("T");
        BinaryTree U = new BinaryTree("U");
        BinaryTree V = new BinaryTree("V");
        BinaryTree W = new BinaryTree("W");
        BinaryTree X = new BinaryTree("X");
        BinaryTree Y = new BinaryTree("Y");
        BinaryTree Z = new BinaryTree("Z");
        BinaryTree a = new BinaryTree("a");
        BinaryTree b = new BinaryTree("b");
        BinaryTree c = new BinaryTree("c");
        BinaryTree d = new BinaryTree("d");
        BinaryTree e = new BinaryTree("e");

        BinaryTree H = new BinaryTree("H",P,Q);
        BinaryTree I = new BinaryTree("I",R,S);
        BinaryTree J = new BinaryTree("J",T,U);
        BinaryTree K = new BinaryTree("K",V,W);
        BinaryTree L = new BinaryTree("L",X,Y);
        BinaryTree M = new BinaryTree("M",Z,a);
        BinaryTree N = new BinaryTree("N",b,c);
        BinaryTree O = new BinaryTree("O",d,e);

        BinaryTree D = new BinaryTree("D",H,I);
        BinaryTree E = new BinaryTree("E",J,K);
        BinaryTree F = new BinaryTree("F",L,M);
        BinaryTree G = new BinaryTree("G",N,O);

        BinaryTree B = new BinaryTree("B",D,E);
        BinaryTree C = new BinaryTree("C",F,G);

        BinaryTree A = new BinaryTree("A",B,C);

        //System.out.println(A.toString());
        //System.out.println(A.preOrder());
        //System.out.println(A.postOrder());

        A.leftSubtree();
        A.rightSubtree();
        System.out.println("TreeA height: "+A.height());


    }
}