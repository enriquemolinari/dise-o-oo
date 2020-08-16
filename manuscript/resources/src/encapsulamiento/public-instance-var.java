class Foo {
 public int x;
}

class Bar {
 private Foo myFoo = new Foo();
 public int process() {
  int intialValue = myFoo.x;
  return initialValue * 4;
 }
}
