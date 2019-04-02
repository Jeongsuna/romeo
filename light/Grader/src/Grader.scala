import java.io.{File, FileInputStream, InputStreamReader}

import scala.io.Source

case class Grade(correct:Int, total: Int)

object Grader {
  import scala.concurrent.JavaConversions._
  var answerSheet :Map[String,Map[String, Set[Int]]] = Map() // canon -> (file -> line)
  var solutionSheet :Map[String,List[(String, Int)]] = Map() // canon -> (file, line),
  // solutionSheet ex) "0001_SQLI" -> [("CWE259_Hard_Coded_Password\m00\CWE259_Hard_Coded_Password__driverManager_01.java", 100)]

  var scoreSheet: Map[String, Grade] = Map()  // canon -> Grade(correct, total)
  def loadAnswer(answerSheetCSV: String, delimiter: String): Unit = {
    val ir = new InputStreamReader(new FileInputStream(answerSheetCSV), "euc-kr")
    val entries = Csv.parse(ir)
    var first = true
    entries.forEach( record => {
      if(!first) {
        val canon = record.at(1)// column B
        val fileLong = record.at(6) // column G
        val idx = fileLong.indexOf(delimiter) + delimiter.size
        print(fileLong + ":" + idx)
        val file = fileLong.substring(idx)
        val lineNo = record.at(7).toInt// column H
        answerSheet.get(canon) match {
          case Some(fileToLine) => {
            fileToLine.get(file) match {
              case Some(lines) => answerSheet += (canon -> (fileToLine + (file -> (lines + lineNo))))
              case None => answerSheet += (canon -> (fileToLine + (file -> Set(lineNo))))
            }
          }
          case None => answerSheet += (canon -> (Map(file -> Set(lineNo))))
        }
      }
      first = false
    })
  }

  def loadSolution(solutionSheetCSV: String, delimiter: String) = {
    val ir = new InputStreamReader(new FileInputStream(solutionSheetCSV))
    val entries = Csv.parse(ir)
    var first = true
    entries.forEach(record => {
      if(!first) {
        val canon = record.at(0)// column A
        val fileLong = record.at(9) // column J
        val idx = fileLong.indexOf(delimiter) + delimiter.size
        val file = fileLong.substring(idx)
        val lineNo = record.at(11).toInt// column L
        solutionSheet.get(canon) match {
          case Some(lst) => solutionSheet += (canon -> ((file, lineNo)::lst))
          case None => solutionSheet += (canon -> List((file, lineNo)))
        }
      }
      first = false
    })
  }

  def doGrading() = {
    solutionSheet.foreach(canonToIssues => {
      val cor = answerSheet.get(canonToIssues._1).fold(0)(ans =>  {
        val corrects = canonToIssues._2.foldLeft(0){case (corrects,(file, line)) => {
          ans.get(file) match {
            case Some(ansLines) => if(ansLines.contains(line)) corrects + 1 else corrects
            case None => corrects
          }
        }}
        corrects
      })
      scoreSheet += (canonToIssues._1 -> Grade(cor, canonToIssues._2.size))
    })
  }

  def printGrades() = {
    println()
    scoreSheet.toList.sortWith{ case ((a,_),(b,_)) => {
      val splitA = a.split("_")
      val splitB = b.split("_")
      val aValue = Integer.parseInt(splitA(0), 16)
      val bValue = Integer.parseInt(splitB(0), 16)
      aValue < bValue
    }}.foreach{case (canon, Grade(correct, total)) => {
      println(s"${canon} : ${correct}/${total} | ${correct * 100.0 / total}%")
    }}
  }

  def main(args: Array[String]): Unit = {
    val answerSheetCSV = args(0)
    val solutionSheetCSV = args(1)
    val delimiter =
      if(args.length != 3) {
        s"romeo${File.separator}light"
      } else {
        args(2) // ex) romeo\light\java
      }
    loadSolution(solutionSheetCSV, delimiter)
    loadAnswer(answerSheetCSV, delimiter)
    doGrading
    printGrades
  }
}
