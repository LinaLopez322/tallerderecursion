package object Recursion {

  /**
   * Ejercicio 1 (Potenciacion de Naturales)
   */
  def potencia(m: Int, n: Int): Int = {
    if (n == 0) 1 // Caso base: cualquier número elevado a la 0 es 1
    else m * potencia(m, n - 1) // Paso recursivo: m^n = m * m^(n-1)
  }

  /**
   * Ejercicio 2 (Triangulo de pascal)
   */
  def pascal(c: Int, r: Int): Int = {
    // Caso base: Si es la primera columna (0) o la última de la fila (c == r), el valor es 1
    if (c == 0 || c == r) 1
    // Paso recursivo: Suma de los dos elementos "encima" en la fila anterior (r - 1)
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Ejercicio 3 (Balanceo de Parentesis)
   */
  def balanceado(chars: List[Char]): Boolean = {
    def verificar(lista: List[Char], contador: Int): Boolean = {
      if (lista.isEmpty) contador == 0
      else if (contador < 0) false
      else if (lista.head == '(') verificar(lista.tail, contador + 1)
      else if (lista.head == ')') verificar(lista.tail, contador - 1)
      else verificar(lista.tail, contador)
    }

    verificar(chars, 0)
  }

  /**
   * Ejercicio 4 (Cambio de Monedas)
   */
  def cambioMonedas(total: Int, denom: List[Int]): Int = {
    if (total == 0) 1
    else if (total < 0) 0
    else if (denom.isEmpty) 0
    else cambioMonedas(total, denom.tail) + cambioMonedas(total - denom.head, denom)
  }

}