class Foo {
 private int x;
 public int doProcess(int aValue) {
  return x * aValue;
 }
}

class Bar {
 private Foo myFoo = new Foo();
 public int process() {
  return myFoo.doProcess(4);
 }
}
