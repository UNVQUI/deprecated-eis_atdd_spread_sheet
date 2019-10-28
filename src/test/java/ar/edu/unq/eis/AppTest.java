package ar.edu.unq.eis;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void usuarioCompraCocaA1000HabiendoCostado10SiendoLaGanancia990() {

        // Given
        Coca c = Coca.compraA(10);

        // When
        Renta r = c.vender(1000);

        // Then
        assertEquals(new Renta(990), r);

    }

    @Test
    void usuarioCompraCocaA10HabiendoCostado5SiendoLaGanancia15() {

        // Given
        Coca c = Coca.compraA(10);

        // When
        Renta r = c.vender(15);

        // Then
        assertEquals(new Renta(5), r);

    }

    @Test
    void usuarioCompraCocaA100HabiendoCompradoUnPackDe10A200SiendoLaGanancia80() {

        // Given
        PackCoca c = PackCoca.comprarTantasA(10,
            200);

        // When
        Renta r = c.venderUna(100);

        // Then
        assertEquals(new Renta(80), r);

    }

    @Test
    void usuarioCompraPalitosa30HabiendoCostado12LaRentaEsDe18() {

        // Given
        Palitos p = Palitos.comprarA(12);

        // When
        Renta r = p.vender(30);

        // Then
        assertEquals(new Renta(18), r);
    }

    @Test
    void usuarioCompraComboPalitosMasCocaA2000HabiendoCostadoPalitos12YPackDeCoca20UnidadesA100() {

        // Given
        PackCoca pack = PackCoca.comprarTantasA(20,
                100);
        Palitos p = Palitos.comprarA(12);

        Combo c = Combo.de( pack.item(), p);


        // When
        Renta r = c.vender(2000);

        // Then
        assertEquals(new Renta(1983), r);
    }
}