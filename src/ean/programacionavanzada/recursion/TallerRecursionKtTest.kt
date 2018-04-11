package ean.programacionavanzada.recursion

import ean.collections.List
import ean.collections.asLinkedList
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TallerRecursionKtTest {
    @Test
    fun pruebaSumaCuadrados() {
        assertEquals(204, sumaCuadrados(8))
    }

    @Test
    fun pruebaContarDigitos() {
        assertEquals(7, contarDigitos(2351804))
    }

    @Test
    fun pruebaDigitos() {
        assertTrue {
            digitos(351804) == List(3, 5, 1, 8, 0, 4)
        }
    }

}