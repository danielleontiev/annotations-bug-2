package foo

import scala.annotation.StaticAnnotation

class description(val text: String) extends StaticAnnotation

class Base(
  @description("base foo")
  val foo: String
)
case class Foo(
  @description("foo!")
  override val foo: String
) extends Base(foo)
