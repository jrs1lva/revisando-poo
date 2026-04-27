package br.com.jnasports;

import br.com.jnasports.controller.ProdutoController;
import br.com.jnasports.model.Bicicleta;
import br.com.jnasports.model.Produto;
import br.com.jnasports.view.ProdutoView;

public class Main {

	public static void main(String[] args) {
		// 1. Criamos o Modelo com os dados (Bicicleta Speed)
        Produto minhaBike = new Bicicleta("Bicicleta Speed Caloi Strada", 3500.00);

        // 2. Criamos a View
        ProdutoView minhaView = new ProdutoView();

        // 3. O Controller une ambos
        ProdutoController controller = new ProdutoController(minhaBike, minhaView);

        // 4. Exibimos o resultado
        controller.atualizarView();
	}

}
