package BadAccess.subPackage

import BadAccess.A

public fun main(args: Array<String>) {
  B().test(B())
}

public class B : A() {
  public fun test(other:Any) {
    if (other is B && other.xy!!.x == 2) {
    }
  }
}