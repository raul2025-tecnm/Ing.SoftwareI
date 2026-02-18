package org.example.LibrosService;

import org.example.LibrosModel.Libro;

public interface ILibrosService {
    // RF-03: Método para validar las reglas de préstamo
    boolean vPrestamo(Libro libro);

    // RF-04: Método para mostrar resultados
    void mResultados(Libro libro);
}
