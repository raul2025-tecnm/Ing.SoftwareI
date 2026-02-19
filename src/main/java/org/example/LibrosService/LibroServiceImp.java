package org.example.LibrosService;
import org.example.LibrosModel.Libro;
import org.example.LibrosModel.EstadoLibro;

/**
 * Fase 4: Codificación - Implementación de la lógica de negocio siguiendo
 * los estándares de código Java y principios SOLID.
 */
public class LibroServiceImp implements ILibrosService {

    @Override
    public boolean vPrestamo(Libro libro) {
        // Regla: Solo los libros disponibles pueden ser prestados [cite: 8, 9]
        // Se utiliza el Enum de LibrosModel para evaluar el estado [cite: 7]
        if (libro.getEstado() == EstadoLibro.DISPONIBLE) {

            // Aplicar Encapsulamiento para cambiar el estado de forma segura
            libro.setEstado(EstadoLibro.PRESTADO);
            System.out.println("SISTEMA: El préstamo del libro '" + libro.getTitulo() + "' ha sido procesado con éxito[cite: 9].");
            return true;
        } else {
            // Regla: Un libro prestado no puede prestarse nuevamente [cite: 8]
            System.out.println("ERROR: El libro '" + libro.getTitulo() + "' ya se encuentra prestado y no está disponible[cite: 8].");
            return false;
        }
    }

    @Override
    public void mResultados(Libro libro) {
        // Fase 2 y 3: Mostrar resultados del sistema en tiempo real [cite: 12]
        // Enlista los libros por título, autor, identificador y estado actual [cite: 7]
        System.out.println("\n--- REPORTE DE BIBLIOTECA - UNIVERSIDAD DE CUNDINAMARCA ---");
        System.out.println("DETALLES: " + libro.toString());
        System.out.println("----------------------------------------------------------\n");
    }

    /**
     * RNF-01: Validación de cantidad total mayor a cero.
     */
    public boolean vCantidad(int total) {
        return total > 0;
    }
}
