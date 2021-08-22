
package ammonite
package $file.unit1.lesson05.src.main.scala.listings
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


object `Listing-5.1`{
/*<script>*/def categorizeDayOfWeek(n: Int) = {
  if (n == 1 || n == 7) {
    "weekend"
  } else if (n > 1 && n < 7) {
    "weekday"
  } else {
    "unknown"
  }
}

/*<amm>*/val res_1 = /*</amm>*/for (i <- 1 to 7) println(categorizeDayOfWeek(i))
/*</script>*/ /*<generated>*/
def $main() = { scala.Iterator[String]() }
  override def toString = "Listing$minus5$u002E1"
  /*</generated>*/
}
