package br.ufpb.dcx;

public class CadastrarLivro {

    private String autor;
    private String titulo;
    private String editora;
    private int anoDePublicacao;

    public CadastrarLivro(String autor, String titulo, String editora, int anoDePublicacao) {
        this.autor = autor;
        this.titulo = titulo;
        this.editora = editora;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    @Override
    public String toString() {
        return "CadastrarLivro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", editora='" + editora + '\'' +
                ", anoDePublicacao=" + anoDePublicacao +
                '}';
    }
}
