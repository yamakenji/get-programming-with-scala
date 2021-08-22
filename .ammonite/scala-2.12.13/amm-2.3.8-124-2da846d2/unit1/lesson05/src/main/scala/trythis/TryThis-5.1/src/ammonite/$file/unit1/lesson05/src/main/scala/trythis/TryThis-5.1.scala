
package ammonite
package $file.unit1.lesson05.src.main.scala.trythis
import _root_.ammonite.interp.api.InterpBridge.{
  value => interp
}
import _root_.ammonite.interp.api.InterpBridge.value.{
  exit,
  scalaVersion
}
import _root_.ammonite.interp.api.IvyConstructor.{
  ArtifactIdExt,
  GroupIdExt
}
import _root_.ammonite.compiler.CompilerExtensions.{
  CompilerInterpAPIExtensions,
  CompilerReplAPIExtensions
}
import _root_.ammonite.runtime.tools.{
  browse,
  grep,
  time,
  tail
}
import _root_.ammonite.compiler.tools.{
  desugar,
  source
}
import _root_.mainargs.{
  arg,
  main
}
import _root_.ammonite.repl.tools.Util.{
  PathRead
}


object `TryThis-5.1`{
/*<script>*/def applyDiscount(price: Double) = {
  val discount = {
    if (price >= 100) 0.15
    else if (price >= 50) 0.10
    else 0
  }

  price * (1 - discount)
}

/*<amm>*/val res_1 = /*</amm>*/for (p <- List(10, 60, 110)) println(applyDiscount(p))
/*</script>*/ /*<generated>*/
def $main() = { scala.Iterator[String]() }
  override def toString = "TryThis$minus5$u002E1"
  /*</generated>*/
}
