package br.com.fiap.rodrigo.product;

import java.util.List;

public interface IProdutoService {
    List<Produto> getAllProdutos();
    Produto getProdutoById(long id);
    Produto addProduto(Produto produto);
    Produto updateProduto(Produto produto);
    void deleteProduto(long id);
}
