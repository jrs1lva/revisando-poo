package br.com.jnasports;

import br.com.jnasports.controller.ProdutoController;
import br.com.jnasports.model.Bicicleta;
import br.com.jnasports.model.Produto;
import br.com.jnasports.model.Vestuario;
import br.com.jnasports.view.ProdutoView;

public class Main {

	public static void main(String[] args) {

		Produto minhaRoupa = new Vestuario("Short de Compressão", 20.00);

        ProdutoView minhaView = new ProdutoView();

        ProdutoController controller = new ProdutoController(minhaRoupa, minhaView);

        controller.atualizarView();
	}

}
