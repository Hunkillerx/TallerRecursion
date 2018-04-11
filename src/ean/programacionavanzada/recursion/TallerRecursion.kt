/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 *
 * Taller Funciones Recursivas
 * Fecha: 06 de abril de 2018
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package ean.programacionavanzada.recursion

import ean.collections.IList
import ean.collections.LinkedList

/**
 * Halla el factorial del número entero n
 * n! = n * (n-1) * (n-2) * ... * 2 * 1
 */
fun factorial(n: Int): Int {
    return when (n) {
        0    -> 1
        else -> n * factorial(n-1)
    }
}

/**
 * Halla el n-ésimo término de la serie de fibonacci
 */
fun fibonacci(n: Int): Int =
    when (n) {
        0    ->  1
        1    ->  1
        else -> fibonacci(n-1) + fibonacci(n-2)
    }

/**
 * Halla el valor de a^b
 */
fun elevar(a: Int, b: Int): Int =
    TODO("Completar")

/**
 * Halla la suma de los cuadrados de los números de 1 hasta n
 */
fun sumaCuadrados(n: Int): Int =
    TODO("Completar")

/**
 * Permite saber la cantidad de digitos que posee un número entero positivo n
 */
fun contarDigitos(n: Int): Int =
    TODO("Completar")

/**
 * Permite hallar la suma de los dígitos de un número entero positivo n
 */
fun sumarDigitos(n: Int): Int =
    TODO("Completar")

/**
 * Un número entero positivo en múltiplo de 3 si:
 *  - es 0, 3, 6, o 9
 *  - la suma de sus dígitos es múltiplo de 3
 *  - Si no es de un digito sumarlos y mirar si ese digito es multiplo de 3
 */
fun esMultiploDe3(n: Int): Boolean {
    if(contarDigitos(n) == 1){

    }
}

/**
 * Cuenta el número de dígitos pares que tiene un número entero positivo >= 1
 */
fun cantidadDigitosPares(n: Int): Int {
    TODO("Completar")
}

/**
 * Determina si el número dado es binario o no.
 * Los números binarios solo contienen los dígitos 1 y 0
 * Por ejemplo: el numero 100011110 es binario, pero 231 no lo es
 */
fun esNumeroBinario(n: Int): Boolean {
    TODO("Completar")
}

/**
 * Permite saber si el número dado posee el dígito indicado
 */
fun poseeDigito(n: Int, digito: Int): Boolean {
    TODO("Completar")
}

/**
 * Retorna el dígito más grande que hace parte del número n
 * Ejemplo: el dígito más grande del númer 381704 es el 8
 */
fun digitoMasGrande(n: Int): Int {
    TODO("Completar")
}

/**
 * Obtiene recursivamente la lista de los dígitos del número entero positivo n
 * Ejemplo: digitos(351804) == [3, 5, 1, 8, 0, 4]
 */
fun digitos(n: Int): IList<Int> {
    TODO("Completar")
}

/**
 * Dado un número entero positivo >= 0, retorna una lista con la representación binaria
 * del número dado.
 * Ejemplo: convertirDecimalBinario(231) = List(1, 1, 0, 0, 1, 1, 1, 1, 1, 1)
 */
fun convertirDecimalBinario(n: Int): IList<Int> {
    TODO("completar!")
}

/**
 * Recursion con listas: Hallar la suma de los números pares de la lista que se recibe
 * como parámetro.
 * Ejemplo: sumarParesLista([40, 21, 8, 31, 6]) == 54
 */
fun sumarParesList(lista: IList<Int>): Int {
    TODO("Completar!")
}

/**
 * Traduce los diversos dígitos de la lista a un número entero
 * Ejemplo: convertirListaDigitosNumero([3, 4, 1, 7, 9]) == 34179
 */
fun convertirListaDigitosNumero(digitos: IList<Int>): Int {
    TODO("Completar!")
}

/**
 * Una clase auxiliar
 */
data class Punto(val x: Int, val y: Int)

/**
 * Recursivamente, obtener una lista con aquellos puntos que están en el origen o
 * que hacen parte del primer cuadrante.
 */
fun puntosPrimerCuadrante(puntos: IList<Punto>): IList<Punto> {
    TODO("Completar")
}
