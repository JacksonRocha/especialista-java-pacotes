package jackson.rocha.estoque;

import java.util.Objects;
import java.util.UUID;

public class Produto {


    private static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    final String codigo;
    public String nome;
    int quantidadeEstoque;

    Produto() {
        this("Sem nome");
    }

    Produto(String nome) {
        this(nome, QUANTIDADE_ESTOQUE_INICIAL);
    }

    Produto(String nome, int estoqueInicial) {
        Objects.requireNonNull(nome, "Nome é obrigatório");

        if (estoqueInicial < 0) {
            throw new IllegalArgumentException("O estoque não pode ser negativo");
        }

        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;
        this.codigo = UUID.randomUUID().toString();
    }

}

