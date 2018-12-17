public class Driver{
  public static void main(String[] args){
    MyLinkedList a = new MyLinkedList();
    System.out.println(a);
    a.add(5);
    a.add(7);
    System.out.println(a);
    System.out.println(a.contains(3));
    System.out.println(a.contains(7));
    System.out.println(a.indexOf(7));
    a.add(7);
    a.add(7);
    a.set(1,100);
    a.add(0,20);
    System.out.println(a);
  }
}
