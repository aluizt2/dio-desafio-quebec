package br.com.diodesafioquebec.regrasemprestimo.comgarantia;

import br.com.diodesafioquebec.cliente.ClienteModel;
import br.com.diodesafioquebec.regrasemprestimo.AnalisaCombinacao;
import br.com.diodesafioquebec.regrasemprestimo.comgarantia.regras.RegraUm;
import br.com.diodesafioquebec.regrasemprestimo.commons.models.PossibilidadeDeEmprestimoModel;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RegraDeEmprestimoComGarantia implements AnalisaCombinacao {
    private final RegraUm regraUm;

    public RegraDeEmprestimoComGarantia(RegraUm regraUm) {
        this.regraUm = regraUm;
    }

    @Override
    public Optional<PossibilidadeDeEmprestimoModel> aceita(ClienteModel clienteModel) {
        return regraUm.analisa(clienteModel);
    }
}
