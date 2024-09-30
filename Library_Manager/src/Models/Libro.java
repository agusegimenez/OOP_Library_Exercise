package Models;

public class Libro implements Comparable<Libro>{
    private String titulo;
    private String autor;
    private Integer añoPublicacion;
    private Integer isbn;
    private Libreria libreria;

    public Libro(java.lang.String titulo, java.lang.String autor, Integer añoPublicacion, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(Integer añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Libreria getLibreria() {
        return libreria;
    }

    public void setLibreria(Libreria libreria) {
        this.libreria = libreria;
    }

    @Override
    public String toString(){
        return "Libro: " + this.titulo + "\nAutor: " + this.autor + "\nAño de publicacion: " + this.añoPublicacion + "\nISBN: " + this.isbn + "\n";
    }

    @Override
    public int compareTo(Libro otroLibro) {
        return this.titulo.compareTo(otroLibro.getTitulo());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Libro libro = (Libro) obj;
        return titulo.equals(libro.titulo);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }


}
