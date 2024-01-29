class TestMainScalaCheck extends org.scalacheck.Properties("Main"):
  property("test not implemented with scalacheck") = {
    val x = Main.isNotImplemented
    true
  }

  property("test other exception with scalacheck") = {
    val x = Main.isException
    true
  }
