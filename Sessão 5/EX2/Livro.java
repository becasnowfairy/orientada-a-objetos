package Sessao5.EX2;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrarInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: " + preco);
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("Livro 1", "Autor 1", 20.0);
        Livro livro2 = new Livro("Livro 2", "Autor 2", 30.0);

        livro1.mostrarInformacoes();
        livro2.mostrarInformacoes();
    }
}