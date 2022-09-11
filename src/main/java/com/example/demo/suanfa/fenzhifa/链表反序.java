package com.example.demo.suanfa.fenzhifa;

public class 链表反序 {

    private Node NodeLinked;

    //构建一个链表结构
    public void createNode(){
        Node tempNode = null;
        for(int i =0; i< 10; i++){
            Node node = new Node(String.valueOf(i), null);

            tempNode = node;

        }
    }



}

class Node{
    String Name;
    Node next;

    public Node(String name, Node next) {
        Name = name;
        this.next = next;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
