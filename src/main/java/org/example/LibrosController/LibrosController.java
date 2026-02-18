package org.example.LibrosController;

import org.example.LibrosModel.Libro;
import org.example.LibrosModel.EstadoLibro;
import org.example.LibrosService.ILibrosService;

public class LibrosController implements ILibrosService {

    @Override
    public boolean vPrestamo(Libro libro) {
        // Condi1: Los libros que esten disponibles pueden ser prestados
        if (libro.getEstado() == EstadoLibro.DISPONIBLE) {
            libro.setEstado(EstadoLibro.PRESTADO);
            return true;
        }
        // Condi2: Un libro que ya fueprestado no puede prestarse nuevamente
        return false;
    }

    @Override
    public void mResultados(Libro libro) {
        System.out.println("Informacion del sistema UDec");
        System.out.println(libro.toString());
    }
}
