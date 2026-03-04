import Recursion.{potencia, pascal, balanceado, cambioMonedas}

// --- Pruebas para la función Potencia ---

// 1. Caso base: Cualquier número m > 0 elevado a la 0 debe dar 1
val prueba1 = potencia(2, 0) 
assert(potencia(2, 0) == 1) [4, 5]

// 2. Potencia estándar: 2 elevado a la 3 es 8
val prueba2 = potencia(2, 3)
assert(potencia(2, 3) == 8) [4, 5]

// 3. Identidad: Cualquier número m elevado a la 1 debe dar m
val prueba3 = potencia(5, 1)
assert(potencia(5, 1) == 5)

// 4. Base unitaria: 1 elevado a cualquier potencia n debe dar 1
val prueba4 = potencia(1, 10)
assert(potencia(1, 10) == 1)

// 5. Cálculo con números mayores: 3 elevado a la 4 es 81
val prueba5 = potencia(3, 4)
assert(potencia(3, 4) == 81)

// --- Casos de Prueba para la función Pascal ---

// 1. Caso base: El vértice superior del triángulo (fila 0, columna 0)
val p1 = pascal(0, 0) 
assert(pascal(0, 0) == 1)

// 2. Bordes izquierdos: Cualquier fila en la columna 0 debe ser 1
val p2 = pascal(0, 4)
assert(pascal(0, 4) == 1)

// 3. Bordes derechos: Cuando la columna es igual a la fila (c == r) debe ser 1
val p3 = pascal(3, 3)
assert(pascal(3, 3) == 1)

// 4. Valor interno estándar: Fila 2, columna 1 (suma de 1+1 de la fila anterior)
val p4 = pascal(1, 2)
assert(pascal(1, 2) == 2) // Según el ejemplo: pascal(1,2)=2 [3]

// 5. Valor interno más profundo: Fila 4, columna 2
val p5 = pascal(2, 4)
assert(pascal(2, 4) == 6)

// --- Casos de Prueba para la funcion Balanceo de Parentesis ---
balanceado("(5x - (3 * 4(x - 3)) + ((x-2) / 3(x + 5)) + 3x) ".toList)
assert(balanceado("(5x - (3 * 4(x - 3)) + ((x-2) / 3(x + 5)) + 3x) ".toList) == true)
balanceado("(este fin) de semana) son elecciones (".toList)
assert(balanceado("(este fin) de semana) son elecciones (".toList) == false)

balanceado("((((((buenas noches)))".toList)
assert(balanceado("((((((buenas noches)))".toList) == false)

balanceado("el jueves hay futbol".toList)
assert(balanceado("el jueves hay futbol".toList) == true)

balanceado("(hay (que (repasar) hoy) para (ganar (el parcial))".toList)
assert(balanceado("(hay (que (repasar) hoy) para (ganar (el parcial))".toList) == false )


// --- Casos de Prueba para la funcion Cambio de Monedas ---
cambioMonedas(501, List(50,100,40,200,300,500))
assert(cambioMonedas(501, List(50,100,40,200,300,500)) == 0)

cambioMonedas(0, List(100,20,30,500))
assert(cambioMonedas(0, List(100,20,30,500)) == 1)

cambioMonedas(100, List(1, 5, 10, 25))
assert(cambioMonedas(100, List(1, 5, 10, 25)) == 242)

cambioMonedas(300, List(50))
assert(cambioMonedas(300, List(50)) == 1)

cambioMonedas(300, List(10, 20, 50, 100, 200, 500))
assert(cambioMonedas(300, List(10, 20, 50, 100, 200, 500)) == 109)