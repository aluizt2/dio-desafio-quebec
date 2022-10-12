package br.com.diodesafioquebec.regrasemprestimo.comgarantia.regras;

import br.com.diodesafioquebec.cliente.ClienteModel;
import br.com.diodesafioquebec.regrasemprestimo.commons.models.PossibilidadeDeEmprestimoModel;
import br.com.diodesafioquebec.regrasemprestimo.commons.enuns.TipoEmprestimo;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static br.com.diodesafioquebec.regrasemprestimo.commons.enuns.Taxas.TRES_PORCENTO;


/**
 * O salario tem de ser <= 3000, a idade tem de ser < 30 anos e o cliente tem de ser de SP
 */
@Component
public class RegraUm extends RegrasComGarantias {
    private final RegraDois regraDois;

    public RegraUm(RegraDois regraDois) {
        this.regraDois = regraDois;
    }

    @Override
    public Optional<PossibilidadeDeEmprestimoModel> analisa(ClienteModel clienteModel) {
        boolean salarioMenorIgual3000 = clienteModel.salarioMenorIgual(3000);
        boolean ehDeSaoPaulo = clienteModel.ehDeSaoPaulo();
        boolean idadeMenorDoQue30 = clienteModel.idadeMenorDoQue(30);

        if (salarioMenorIgual3000
                && ehDeSaoPaulo
                && idadeMenorDoQue30) {
            return Optional.of(PossibilidadeDeEmprestimoModel.builder()
                    .tipo(TipoEmprestimo.COM_GARANTIA)
                    .taxa(TRES_PORCENTO.getTaxa())
                    .build());
        }
        return getProxima(regraDois).analisa(clienteModel);
    }
}
