package br.com.diodesafioquebec.regrasemprestimo.comgarantia.regras;

import br.com.diodesafioquebec.cliente.ClienteModel;
import br.com.diodesafioquebec.regrasemprestimo.commons.models.PossibilidadeDeEmprestimoModel;

import java.util.Optional;

public abstract class RegrasComGarantias {
    private RegrasComGarantias proxima;

    public abstract Optional<PossibilidadeDeEmprestimoModel> analisa(ClienteModel clienteModel);

    public RegrasComGarantias getProxima(RegrasComGarantias proxima){
        this.proxima = proxima;
        return proxima;
    }

}
