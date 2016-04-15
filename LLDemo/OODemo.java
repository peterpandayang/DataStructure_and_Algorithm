package LLDemo;

/**
 * Created by bingkunyang on 15/11/29.
 */

class Node {
    private String data;
    private Node next;
    public Node(String data) {
        this.data = data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }

    public String getData(){
        return this.data;
    }
                                            //增加节点
    public void addNode(Node newNode){      //将节点保存在合适的位置上
        if (this.next == null) {            //当前节点后没有其他节点
            this.next = newNode;
        }
        else {
            this.next.addNode(newNode);
        }
    }

    public void printNode(){
        System.out.println(this.data);
        if(this.next != null){
            this.next.printNode();
        }
    }

                                                    //搜索含有某个数据的节点
    public boolean containsNode(String data){
        if(this.data.equals(data)){                 //当前节点的数据是查找数据
            return true;
        }
        else{
            if (this.next != null){
                return this.next.containsNode(data);
            }
            else {
                return false;
            }
        }
    }
                                                        //删除节点
    public void removeNode(Node previous, String data){
        if (this.data.equals(data)){
            previous.next = this.next;
        }
        else {
            this.next.removeNode(this, data);
        }
    }

}



class Link {                                //链表操作类
    private Node root;

                                            //增加节点
    public void add(String data){
        if (data == null){
            return;
        }
        Node newNode = new Node(data);
        if (this.root == null){
            this.root = newNode;
        }
        else{
            this.root.addNode(newNode);
        }
    }

    public void print(){
        if(this.root != null){
            this.root.printNode();
        }
    }
                                                      //搜索含有某个数据的节点
    public boolean contains(String data){
        if (data == null || this.root == null){         //没有内容就不查了
            return false;
        }
        return this.root.containsNode(data);
    }
                                                            //删除节点
    public void remove(String data){
        if(this.contains(data)){
            if(this.root.getData().equals(data)){          // 如果要删除的是根节点
                this.root = this.root.getNext();
            }
            else {                                          //交给root来完成
                this.root.getNext().removeNode(this.root, data);        //从根节点开始判断要删除的节点
            }
        }
    }
}


public class OODemo {
    public static void main (String args[]){
        Link all = new Link();
        all.add("A");
        all.add("B");
        all.add("C");
        all.add("D");
        all.print();

        System.out.println(all.contains("E"));

        all.remove("C");
        all.print();



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
