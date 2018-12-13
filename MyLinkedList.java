public class MyLinkedList{
  private int size;
  private Node start,end;
  public MyLinkedList(){
    size = 1;
    start = new Node(0,null,null);
    end = start;
  }
  public int size(){
    return size;
  }
  public boolean add(int value){
    Node newend = new Node(value, end, null);
    end.setNext(newend);
    end = newend;
    size++;
    return true;
  }
  public String toString(){
    String ans="[";
    Node current=start;
    for(int i=0;i<size-1;i++){
      ans+=current.get()+", ";
      current = current.next();
    }
    ans+=current.get();
    return ans+"]";
  }
}
class Node{
  private int data;
  private Node prev, next;
  public Node(int _data, Node _prev, Node _next){
    data = _data;
    if(prev!=null){
      prev = _prev;
    }
    if(next!=null){
      next = _next;
    }
  }
  public int get(){
    return data;
  }
  public Node next(){
    return next;
  }
  public Node prev(){
    return prev;
  }
  public void setPrev(Node _prev){
    prev = _prev;
  }
  public void setNext(Node _next){
    next = _next;
  }
}
