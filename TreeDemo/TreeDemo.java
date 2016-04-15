package TreeDemo;

/**
 * Created by bingkunyang on 15/11/30.
 */


class TreeNode {
    private String data;
    private TreeNode left;
    private TreeNode right;
    public TreeNode(String data) {
        this.data = data;
    }

    public String getData(){
        return this.data;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getLeft(){
        return this.left;
    }

    public TreeNode getRight(){
        return this.right;
    }

    public void addNode(TreeNode newNode){
        if (newNode.getData().compareTo(this.data) < 0){
            if (this.left == null) {
                this.left = newNode;
            }
            else {
                this.left.addNode(newNode);
            }
        }
        else {
            if (this.right == null) {
                this.right = newNode;
            }
            else {
                this.right.addNode(newNode);
            }
        }
    }

    public void printNode(){
        if(this.left != null){
            this.left.printNode();
        }
        System.out.println(this.data);

        if(this.right != null){
            this.right.printNode();
        }
    }

}



class BinaryTree{
    private TreeNode root;
    public void add(String data){
        TreeNode newNode = new TreeNode(data);
        if(this.root ==null){
            this.root = newNode;
        }
        else {                                  //交给Node类保存在合适的位置上
            this.root.addNode(newNode);
        }
    }

    public void print(){
       if(this.root != null){
           this.root.printNode();
       }
    }
}



public class TreeDemo {
    public static void main (String args[]){
        BinaryTree bt = new BinaryTree();
        bt.add("A");
        bt.add("C");
        bt.add("B");
        bt.print();





//        LLDemo.Node root = new LLDemo.Node("根节点");
//        LLDemo.Node n1 = new LLDemo.Node("保存数据A");
//        LLDemo.Node n2 = new LLDemo.Node("保存数据B");
//        LLDemo.Node n3 = new LLDemo.Node("保存数据C");
//        LLDemo.Node n4 = new LLDemo.Node("保存数据D");
//        LLDemo.Node n5 = new LLDemo.Node("保存数据E");
//
//        root.setNext(n1);
//        n1.setNext(n2);
//        n2.setNext(n3);
//        n3.setNext(n4);
//        n4.setNext(n5);
//
//        LLDemo.Node currentNode = root;
//        while (currentNode != null){
//            System.out.println(currentNode.getData());
//            currentNode = currentNode.getNext();
//        }
    }
}

