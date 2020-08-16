class Foo {
 private int x;

 Foo (int anInt) {
  x = anInt;
 }

 public void setX(int newInt) {
  x = newInt;
 }

 public void doProcess(int aValue) {
  return x * aValue;
 }
}

class Bar {
  private Foo myFoo;

  public Bar(Foo aFoo){
   myFoo = aFoo;
  }
  public int process() {
   return myFoo.doProcess(4);
  }
}

class Client {
 public static void main(String[] args) {
  int x = 5;
  Foo f = new Foo(x);
  Bar b = new Bar(f);
  int i = b.process();
 }
}
