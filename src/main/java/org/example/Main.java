package org.example;
import org.example.LibrosModel.Libro;
import org.example.LibrosController.LibrosController;
import org.example.LibrosView.LibrosView;

//Esta es la clase principal
public class Main {
    //Aqui el dato se queda como estatico en el main
    public static void main(String[] args) {
        LibrosController ctrl = new LibrosController();
        LibrosView view = new LibrosView();

        // Registro de los libros en base a la tabla con el codigo (RF-01)

        Libro libro1 = new Libro("UDEC-2026", "Matematicas Simplificadas", "Alejandro Minero");
        Libro libro2 = new Libro("UDEC-2026", "Fundamentos de python", "Cesar Alanis");
        Libro libro3 = new Libro("UDEC-2026", "El pirata del caribe", "Axel Trujillo");
        // Aplicamos el prestamo en base a la seccion de la tabla en la seccion (RF-03)

        if (ctrl.vPrestamo(libro1)) {
            view.imprimirMensaje("Préstamo exitoso de: " + libro1.getTitulo());
        }
        if (ctrl.vPrestamo(libro1)) {
            view.imprimirMensaje("Préstamo exitoso de: " + libro2.getTitulo());
        }
        if (ctrl.vPrestamo(libro3)) {
            view.imprimirMensaje("Préstamo exitoso de: " + libro3.getTitulo());
        }
        // Aqui se hace una negacion del libro si ya fue prestado al menos 1 vez al mismo usuario
        if (!ctrl.vPrestamo(libro1)) {
            view.imprimirMensaje("Error: El libro ya está en estado PRESTADO.");
        }
        if (!ctrl.vPrestamo(libro3)) {
            view.imprimirMensaje("Error: El libro ya está en estado DISPONIBLE.");
        }
        // Aqui mostramos las rsptas finales del sistema en base a la tabla con la seccion (RF-04)
        ctrl.mResultados(libro1);
        ctrl.mResultados(libro2);
        ctrl.mResultados(libro3);
    }
}