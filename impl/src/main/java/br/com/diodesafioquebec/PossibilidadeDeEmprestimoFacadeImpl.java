package br.com.diodesafioquebec;

import br.com.diodesafioquebec.analisador.AnalisadorDeEmprestimos;
import br.com.diodesafioquebec.cliente.ClienteModel;
import br.com.diodesafioquebec.regrasemprestimo.commons.models.PossibilidadeDeEmprestimoModel;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class PossibilidadeDeEmprestimoFacadeImpl {
    private final AnalisadorDeEmprestimos analisadorDeEmprestimos;

    public PossibilidadeDeEmprestimoFacadeImpl(AnalisadorDeEmprestimos analisadorDeEmprestimos) {
        this.analisadorDeEmprestimos = analisadorDeEmprestimos;
    }

    public Set<PossibilidadeDeEmprestimoModel> buscaPorCombinacao(ClienteModel clienteModel) {
        return analisadorDeEmprestimos.buscaPorCombinacao(clienteModel);
    }
}
