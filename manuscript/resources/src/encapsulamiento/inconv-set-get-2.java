class Client {
 public static void main(String[] args) {
  int x = 5;
  Foo f = new Foo(x);
  Bar b = new Bar(f);
  int i = b.process();
  f.setX(10);
  i = b.process();
 }
}
