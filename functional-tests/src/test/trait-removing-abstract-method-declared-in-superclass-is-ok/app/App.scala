object App {
  def main(args: Array[String]): Unit = {
    println(new A { def foo = 2 }.foo)
    println(new B { def foo = 3 }.foo)
  }
}
