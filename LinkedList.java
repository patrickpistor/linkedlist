/**
 * Class file for a linked list data structure
 * 07/02/2015
 * @author Patrick
 *
 */
public class LinkedList {

    @SuppressWarnings("rawtypes")
    LLNode head = null;
    int size = 0;
    /**
     * Inserts parameter node into the LinkedList at the next available spot
     * @param node
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void insert(LLNode<?> node) {
        if(size == 0) {
            head = node;
            size++;
        }
        else if(size == 1) {
            head.setNext(node);
        }
        else {
            LLNode temp = head;
            for(int i = 0; i < size; i++) {
                if(temp.getNext() == null) {
                    temp.setNext(node);
                }
            }
        }
    }
    /**
     * Removes the head of the LinkedList from the 
     */
    @SuppressWarnings("rawtypes")
    public LLNode delete() {
        LLNode temp = head;
        if(size >= 1) {
            head = head.getNext();
        }
        return temp;

    }
    
    /**
     * Traverses through the LinkedList from start to finish.
     */
    @SuppressWarnings("rawtypes")
    public void traverse() {
        if(size == 0){
            System.out.println("List is Empty");
        }
        else if(size == 1) {
            System.out.println(head.getData());
        }
        else {
            LLNode temp = head;
            for(int i = 0; i < size; i++) {
                System.out.println(temp.getData());
                temp.getNext();
            }  
        }
    }
    
    /**
     * traverses the list from point a to point b
     * @param a
     * @param b
     */
    @SuppressWarnings("rawtypes")
    public void traverse(int a, int b) {
        if(a < 0) {
            System.out.println("Parameter A is too small.");
        }
        else if(b > size) {
            System.out.println("Parameter B is too Large");
        }
        else if(b < a) {
            LLNode temp = head;
            for(int i = b; i < a; i++) {
                System.out.println(temp.getData());
                temp.getNext();
            }  
        }
        else if(a == b) {
            LLNode temp = head;
            for(int i = 0; i < a; i++) {
                temp.getNext(); 
            }
            System.out.println(temp.getData());
        }
        else {
            LLNode temp = head;
            for(int i = a; i < b; i++) {
                System.out.println(temp.getData());
                temp.getNext();
            }  
        }
    }
    
    /**
     * Gets a value from a certain part of the list
     * @param a
     */
    @SuppressWarnings("rawtypes")
    public void get(int a) {
        if(a < 0){
            System.out.println("Parameter is too small.");
        }
        else if(a > size) {
            System.out.println("Parameter is too Large");
        }
        else {
            LLNode temp = head;
            for(int i = 0; i < a; i++) {
                temp.getNext(); 
            }
            System.out.println(temp.getData());
        }
    }
}
