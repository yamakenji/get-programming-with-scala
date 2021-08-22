
package ammonite
package $file.unit1.lesson05.src.main.scala.quickchecks
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


object `QuickCheck-5.2`{
/*<script>*/def count() = {
  var i = 1
  while(i <= 10) {
    println(i)
    i += 1
  }
}

/*<amm>*/val res_1 = /*</amm>*/count()
/*</script>*/ /*<generated>*/
def $main() = { scala.Iterator[String]() }
  override def toString = "QuickCheck$minus5$u002E2"
  /*</generated>*/
}
