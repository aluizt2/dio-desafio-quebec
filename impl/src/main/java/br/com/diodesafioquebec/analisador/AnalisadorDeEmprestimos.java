package br.com.diodesafioquebec.analisador;

import br.com.diodesafioquebec.cliente.ClienteModel;
import br.com.diodesafioquebec.regrasemprestimo.AnalisaCombinacao;
import br.com.diodesafioquebec.regrasemprestimo.commons.models.PossibilidadeDeEmprestimoModel;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class AnalisadorDeEmprestimos {

    private final Set<AnalisaCombinacao> analisadoresDeCombinacao;

    public AnalisadorDeEmprestimos(Set<AnalisaCombinacao> analisadoresDeCombinacao) {
        this.analisadoresDeCombinacao = analisadoresDeCombinacao;
    }

    public Set<PossibilidadeDeEmprestimoModel> buscaPorCombinacao(ClienteModel clienteModel) {
        return analisadoresDeCombinacao
                .stream()
                .map(analisador -> analisador.aceita(clienteModel))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toSet());
    }
}
