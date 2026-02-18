package org.example.LibrosModel;

// Aqui aplicamos encapsulamiento en la clase Principal que es la de Libro
public class Libro {
    private String id;
    private String titulo;
    private String autor;
    private EstadoLibro estado;
//Es como una fiesta, tienes que invitar a tus amigos, que en este caso es id, titulo y autor del libro
    public Libro(String id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.estado = EstadoLibro.DISPONIBLE; // Estado inicial
    }
    public String getTitulo()
    { return titulo;
    }
    public EstadoLibro getEstado() {
        return estado;
    }
    public void setEstado(EstadoLibro estado) {
        this.estado = estado;
    }
    @Override
    public String toString() {
        return String.format("ID: %s/ Título: %s / Estado: %s", id, titulo, estado);
    }
}
