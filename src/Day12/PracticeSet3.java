package Day12;

class Rectangle {
  int length;
  int breadth;

  public int area() {
    return length * breadth;
  }

  public int perimeter() {
    return 2 * (length + breadth);
  }
}

public class PracticeSet3 {
  public static void main(String[] args) {
    Rectangle ap = new Rectangle();
    ap.length = 2;
    ap.breadth = 5;
    System.out.println(ap.area());
    System.out.println(ap.perimeter());
  }
}
