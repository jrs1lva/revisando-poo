package br.com.jnasports.view;

public class ProdutoView {
	
	public void exibirDetalhesDoProduto(String nome, double precoOriginal, double precoComDesconto) {
		System.out.println("\n--- DETALHES DO PRODUTO ---");
		System.out.println("Item: " + nome);
		System.out.println("Preço original: " + precoOriginal);
		System.out.println("Preço com desconto: " + precoComDesconto);
		System.out.println("--------------------------------------\n");
	}
}
