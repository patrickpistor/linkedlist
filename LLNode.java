
public class LLNode<E> {
    
    private E data = null;
    private LLNode<E> next = null;
    private LLNode<E> back = null;
    
    public void setData(E newData) {
        data = newData;
    }
    
    public E getData() {
        return data;
    }
    
    public void setNext(LLNode<E> newNext) {
        next = newNext;
    }
    
    public LLNode<E> getNext() {
        return next;
    }
    
    public void setBack(LLNode<E> newBack) {
        back = newBack;
    }
    
    public LLNode<E> getBack() {
        return back;
    }
    
}
