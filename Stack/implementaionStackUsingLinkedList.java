package DSA_Problems.Stack;

public class implementaionStackUsingLinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;
        // isEmpty
        public static boolean isEmpty(){
            return head == null;
        }
        // push
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        // pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int data = head.data;
            head = head.next;
            return data;
        }
    }
    public static void main(String[] args) {
        
    }
}
