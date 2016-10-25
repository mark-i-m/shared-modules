// Basically runs all the tests

import Chisel._

object Main extends App {
  val margs = Array("--backend c", "--genHarness", "--compile", "--test", "--vcd")
  val gen = () => Module(new RegFile(16, 4, 4, i => Valid(UInt(OUTPUT, 16))))

  chiselMainTest(margs, gen){ c => new RegFileTests(c) }
}
