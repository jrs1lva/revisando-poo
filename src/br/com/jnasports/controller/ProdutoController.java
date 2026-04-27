package br.com.jnasports.controller;

import br.com.jnasports.model.Produto;
import br.com.jnasports.view.ProdutoView;

public class ProdutoController {
	private Produto model;
	private ProdutoView view;
	public ProdutoController(Produto model, ProdutoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void atualizarView() {
		double precoDesconto = model.calcularDesconto();
		view.exibirDetalhesDoProduto(model.getNome(), model.getPreco(), precoDesconto);
	}
	
	
}
