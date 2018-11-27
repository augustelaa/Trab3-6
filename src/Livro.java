
public class Livro {

	private String titulo;
	private String ISBN;
	private String codigo;
	private int ano;
	
	public Livro(String codigo, String isbn, int ano, String titulo) {
		this.setCodigo(codigo);
		this.setISBN(isbn);
		this.setAno(ano);
		this.setTitulo(titulo);
	}

	public String toString() {
		return "(Ano <"+this.getAno()+">, ISBN <"+this.getISBN()+">, Título <"+this.getTitulo()+">, código <"+this.getCodigo()+">)";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
