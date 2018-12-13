public class MyLinkedList{
  private int size;
  private Node start,end;
  public MyLinkedList(){
    size = 0;
    start = new Node(0,null,null);
  }
  public int size(){
    return size;
  }
  public boolean add(int value){
    return true;
  }
  public String toString(){
    return "";
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
