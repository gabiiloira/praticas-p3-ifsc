package ifsc;

import java.util.ArrayList;

public class mainProduto {

	public static void main(String[] args) {

		ArrayList<Produto> produtos = new ArrayList<>();

		Produto prod1 = new Produto();
		prod1.setNome("Bola de Vôlei");
		prod1.setCoddbarra(548564654l);
		prod1.setPreco(679.90);
		prod1.setFornecedor("mikasa");
		produtos.add(prod1);

		Produto prod2 = new Produto();
		prod2.setNome("Manguito");
		prod2.setCoddbarra(265419484l);
		prod2.setPreco(39.90);
		prod2.setFornecedor("Kanxa");
		produtos.add(prod2);

		Produto prod3 = new Produto();
		prod3.setNome("Joelehira");
		prod3.setCoddbarra(4941561564l);
		prod3.setPreco(79.96);
		prod3.setFornecedor("Penalty");
		produtos.add(prod3);

		for (Produto produto : produtos) {
			System.out.println(produto.getNome());
			System.out.println(produto.getCoddbarra());
			System.out.println(produto.getPreco());
			System.out.println(produto.getFornecedor());
		}

	}
}
