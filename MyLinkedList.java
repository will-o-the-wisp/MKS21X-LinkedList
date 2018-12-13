public class MyLinkedList{
  private int size;
  private Node start,end;
  public MyLinkedList(){

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
    prev = _prev;
    next = _next;
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
}
