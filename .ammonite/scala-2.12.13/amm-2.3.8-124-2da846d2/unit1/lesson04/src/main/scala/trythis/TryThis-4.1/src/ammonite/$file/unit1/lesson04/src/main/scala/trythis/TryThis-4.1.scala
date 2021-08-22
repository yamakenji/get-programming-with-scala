
package ammonite
package $file.unit1.lesson04.src.main.scala.trythis
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


object `TryThis-4.1`{
/*<script>*/var marksSum = 0
var marksCount = 0

var minMark = 100
var maxMark = -100

def averageMark: Double =
  marksSum.toDouble / marksCount

def updateMinMark(mark: Int) = {
  if (mark < minMark) minMark = mark
}

def updateMaxMark(mark: Int) = {
  if (mark > maxMark) maxMark = mark
}

def markExam(q1: Double, q2: Double, q3: Double): Int = {
  val avgScore = (q1 + q2 + q3) / 3
  val scaledScore = avgScore * 10 / 3
  val mark = Math.round(scaledScore).toInt

  marksSum += mark
  marksCount += 1

  updateMinMark(mark)
  updateMaxMark(mark)

  mark
}
/*</script>*/ /*<generated>*/
def $main() = { scala.Iterator[String]() }
  override def toString = "TryThis$minus4$u002E1"
  /*</generated>*/
}
