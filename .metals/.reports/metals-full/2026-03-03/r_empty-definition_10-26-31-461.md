error id: file:///C:/Users/marce/TallerRecursion/src/main/scala/recursion/package.scala:scala/Predef.require(+1).
file:///C:/Users/marce/TallerRecursion/src/main/scala/recursion/package.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -require.
	 -require#
	 -require().
	 -scala/Predef.require.
	 -scala/Predef.require#
	 -scala/Predef.require().
offset: 319
uri: file:///C:/Users/marce/TallerRecursion/src/main/scala/recursion/package.scala
text:
```scala
package object Recursion {

  // potenciacion de naturales
  def potencia(m: Int, n: Int): Int = {
    require(m > 0, "m mayor que cero")
    require(n >= 0, "n debe ser natural")

    if (n == 0) 1
    else m * potencia(m, n - 1)
  }
  // triangulo de scala
  def pascal(c: Int, r: Int): Int = {
    requir@@e(c >= 0 && r >= 0, "c y r deben ser naturales")
    require(c <= r, "c no puede ser mayor que r")

    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }
  // balanceo de parentesis
  def balanceado(chars: List[Char]): Boolean = {

    def auxiliar(lista: List[Char], contador: Int): Boolean = {
      if (contador < 0) false
      else lista match {
        case Nil => contador == 0
        case '(' :: tail => auxiliar(tail, contador + 1)
        case ')' :: tail => auxiliar(tail, contador - 1)
        case _ :: tail   => auxiliar(tail, contador)
      }
    }

    auxiliar(chars, 0)
  }

  // cambio de monedas
  def cambioMonedas(total: Int, denoms: List[Int]): Int = {

    if (total == 0) 1
    else if (total < 0 || denoms.isEmpty) 0
    else {
      cambioMonedas(total, denoms.tail) +
      cambioMonedas(total - denoms.head, denoms)
    }
  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 