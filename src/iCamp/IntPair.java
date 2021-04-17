package iCamp;

public class IntPair {

  int first, second;

  public IntPair(int first, int second) {
    super();
    this.first = first;
    this.second = second;
  }

  public int getFirst() {
    return first;
  }

  public void setFirst(int first) {
    this.first = first;
  }

  public int getSecond() {
    return second;
  }

  public void setSecond(int second) {
    this.second = second;
  }

  public String toString() {
    return "[" + first + ", " + second + "]";
  }
}
