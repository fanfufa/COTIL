public class Livro extends  Produto{

    private String titulo;

    public void mostra()
    {
        super.mostra();
        System.out.println(titulo);
    }

    public void ler()
    {
        System.out.println("Lendo");
    }

    public Livro(int codigo, String descricao, String titulo) {
        super(codigo, descricao);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
