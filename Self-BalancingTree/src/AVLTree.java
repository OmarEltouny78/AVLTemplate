public class AVLTree {

    protected Node root;
    public class Node{
        private int item, height;

        Node left, right;
        public Node(int d) {
            item = d;
            height = 1;
        }
    }
    //height function return the height of the node
    //if n is null return 0
    public int height(Node n){
        return 0;
    }
    //get the maximum between a and b
    public int max(int a, int b) {
        return 0;
    }
    //RightRotate performs the right rotation operation
    public Node rightRotate(Node y) {
        //store the left of node y in a new Node x

        //Store the right of x in a node set T2

        //Set the right node of x to y

        // Set the left of y to T2

        //update the height of y to the max of left and right height + 1

        //Do the same for x

        //return x
        return null;
    }
    public Node leftRotate(Node x) {
        //Store the right Node of x in a new Node y

        //Store the left of y in new Node T2

        //Set the left of y to x

        //set the right of x to T2

        //Update the heights of both x and y

        //return y
        return null;
    }
    // Get balance factor of a node


    public int getBalanceFactor(Node N) {
        //if node is null return 0
        if (N == null)
            return 0;
        //return the height of left child of N minus the height of the right child of N
        return height(N.left) - height(N.right);
    }
    public Node insertNode(Node node, int item) {

        // Find the position and insert the node

        //Case 1:(Root) if node==null return new Node that has item as an element


        //Case 2 if value inside the node is more item, call the function recursively on the left child of the node


        //Case 3  if value inside the node is less item, call the function recursively on the right child of the node



        //Case 4:(leaf) return node


        // Update the balance factor of each node
        // And, balance the tree


        //if balanceFactor is bigger than 1

            //check if the left item is bigger than the item then return the right rotation of node


            //check if the left item is less than the item then return the left rotation of node to the left child of node


                //rotate the node to the right



        // If the balance Factor less than -1

            //if right node item is less than item then leftRotate


            //if the right node item is more than item then rightRotate right child and leftRotate node




        return null;
    }
    public  Node nodeWithMimumValue(Node node) {
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    public Node deleteNode(Node root, int item){
        // Find the node to be deleted and remove it

        //Case 1 if root = null return the root


        //Case 2 if root item is bigger than item, delete the left child recursively


        //Case 3 if root item is bigger than item, delete the right child recursively


        //Case 4 leaf

            // if the root left or right has the value of null

                //create a temporary node and set to null

                //if temp equal to left child of temp
                //then set temp to right of root



                 //else set temp to left of root

                //if temp =null

                    //set temp to root and set root to null



                    //else set temp to root


                //Last case if temp with MimumValue set temp to the right of root

                //set root of item to temp of item

                //Call recursive deleteNode on root of right, pass root right and pass temp of item







        // Update the balance factor of each node and balance the tree
       
        //get the balance factor
        //do the same as the insert function













      ;



        //return root
        return null;
    }
    // Print the tree
    void printTree(Node currPtr, String indent, boolean last) {
        if (currPtr != null) {
            System.out.print(indent);
            if (last) {
                System.out.print("R----");
                indent += "   ";
            } else {
                System.out.print("L----");
                indent += "|  ";
            }
            System.out.println(currPtr.item);
            printTree(currPtr.left, indent, false);
            printTree(currPtr.right, indent, true);
        }
    }
}
