package ifsc;

public class Produto{
	
	private String nome;
	private Long coddbarra;
	private Double preco;
	private String fornecedor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCoddbarra() {
		return coddbarra;
	}
	public void setCoddbarra(Long coddbarra) {
		this.coddbarra = coddbarra;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	
}