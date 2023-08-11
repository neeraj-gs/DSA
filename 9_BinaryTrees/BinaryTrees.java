//BINARY TREES
/* 
Hierarchial Data Strucutre taht has a parent as root and connecting as branch and 
BT has at max 2 Children

Terminologies in Trees
Levels - Data stored at each level from top to bottom from level 1 to ..
Depth - level n - depth = n
Sub Tree - Tre of a Specific node considering that node as a root[left and right sub tree]




*/

public class BinaryTrees {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        //1.Build a Tree
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1||idx>=nodes.length){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }

    public static void main(String[] args) {
        //1.Building a Tree
        //Root--> Left -->Right
        //Trick: Point index finger to the root and traverse a tree
        int nodes[] = {-1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
    }
}
