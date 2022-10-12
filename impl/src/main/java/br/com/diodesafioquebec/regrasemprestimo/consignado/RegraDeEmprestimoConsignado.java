package br.com.diodesafioquebec.regrasemprestimo.consignado;

import br.com.diodesafioquebec.cliente.ClienteModel;
import br.com.diodesafioquebec.regrasemprestimo.AnalisaCombinacao;
import br.com.diodesafioquebec.regrasemprestimo.commons.models.PossibilidadeDeEmprestimoModel;
import br.com.diodesafioquebec.regrasemprestimo.commons.enuns.TipoEmprestimo;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static br.com.diodesafioquebec.regrasemprestimo.commons.enuns.Taxas.DOIS_PORCENTO;

@Component
public class RegraDeEmprestimoConsignado implements AnalisaCombinacao {

    @Override
    public Optional<PossibilidadeDeEmprestimoModel> aceita(ClienteModel clienteModel) {
        if (clienteModel.salarioMaiorOuIqualA(5000)) {
            return Optional.of(new PossibilidadeDeEmprestimoModel(TipoEmprestimo.CONSIGNADO, DOIS_PORCENTO.getTaxa()));
        }
        return Optional.empty();
    }
}
