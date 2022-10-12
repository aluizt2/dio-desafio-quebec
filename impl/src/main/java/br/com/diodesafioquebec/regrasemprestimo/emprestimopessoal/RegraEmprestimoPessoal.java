package br.com.diodesafioquebec.regrasemprestimo.emprestimopessoal;

import br.com.diodesafioquebec.cliente.ClienteModel;
import br.com.diodesafioquebec.regrasemprestimo.AnalisaCombinacao;
import br.com.diodesafioquebec.regrasemprestimo.commons.models.PossibilidadeDeEmprestimoModel;
import br.com.diodesafioquebec.regrasemprestimo.commons.enuns.TipoEmprestimo;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static br.com.diodesafioquebec.regrasemprestimo.commons.enuns.Taxas.QUATRO_PORCENTO;

@Component
public class RegraEmprestimoPessoal implements AnalisaCombinacao {

    public Optional<PossibilidadeDeEmprestimoModel> aceita(ClienteModel clienteModel) {
        return Optional.of(new PossibilidadeDeEmprestimoModel(TipoEmprestimo.PESSOAL, QUATRO_PORCENTO.getTaxa()));
    }
}
