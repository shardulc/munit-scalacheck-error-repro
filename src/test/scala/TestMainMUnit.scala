class TestMainMUnit extends munit.FunSuite:
  test("test not implemented with munit"):
    val x = Main.isNotImplemented
    assert(true)

  test("test other exception with munit"):
    val x = Main.isException
    assert(true)
