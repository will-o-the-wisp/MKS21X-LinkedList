public class MyLinkedList{
  private int length;
  private Node start,end;
  public MyLinkedList(){
    length = 0;
  }
  public int size(){
    return length;
  }
  public boolean add(Integer value){
    if(size()>0){
      Node newend = new Node(value, end, null);
      end.setNext(newend);
      end = newend;
    }
    else{
      Node n = new Node(value, null, null);
      start = n;
      end = n;
    }
    length++;
    return true;
  }
  public String toString(){
    String ans="[";
    if(size()>0){
      Node current=start;
      for(int i=0;i<length-1;i++){
        ans+=current.getData()+", ";
        current = current.next();
      }
      ans+=current.getData();
    }
    return ans+"]";
  }
  private Node getNthNode(int n){
    Node current = start;
    for(int i=0;i<n;i++){
      current = current.next();
    }
    return current;
  }
  public Integer get(int index){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index out of range");
    }
    else{
    return getNthNode(index).getData();
    }
  }
  public Integer set(int index, Integer value){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index out of range");
    }
    else{
      return getNthNode(index).setData(value);
    }
  }
  public boolean contains(Integer value){
    Node current = start;
    for(int i=0;i<length;i++){
      if(current.getData()==value){
        return true;
      }
      current=current.next();
    }
    return false;
  }
  public int indexOf(Integer value){
    int ans=0;
    Node current=start;
    for(int i=0;i<length;i++){
      if(current.getData()==value){
        return ans;
      }
      current=current.next();
      ans++;
    }
    return -1;
  }
  public void add(int index, Integer value){
    if(index < 0 || index > size()){
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    else{

    }
  }
  public Integer remove(int index){
    if(index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("index out of bounds");
    }
    else{
      return 0;
    }
  }
}
class Node{
  private Integer data;
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
  public Integer getData(){
    return data;
  }
  public Integer setData(Integer i){
    Integer old = data;
    data = i;
    return old;
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
  public String toString(){
    return ""+data;
  }
}
