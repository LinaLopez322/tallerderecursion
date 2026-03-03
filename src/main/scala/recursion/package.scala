package object Recursion {

  // potenciacion de naturales
 def potencia(m: Int, n: Int): Int = {
  if (n == 0) 1 // Caso base: cualquier número elevado a la 0 es 1
  else m * potencia(m, n - 1) // Paso recursivo: m^n = m * m^(n-1)
}
  // triangulo de pascal
  def pascal(c: Int, r: Int): Int = {
  // Caso base: Si es la primera columna (0) o la última de la fila (c == r), el valor es 1
  if (c == 0 || c == r) 1
  // Paso recursivo: Suma de los dos elementos "encima" en la fila anterior (r - 1)
  else pascal(c - 1, r - 1) + pascal(c, r - 1)
}
  // balanceo de parentesis
 

  // cambio de monedas
