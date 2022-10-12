package br.com.diodesafioquebec.v1.controller;

import br.com.diodesafioquebec.v1.annotationswagger.ModalidadeEmprestimoSwagger;
import br.com.diodesafioquebec.v1.facade.PossibilidadeDeEmprestimoFacade;
import br.com.diodesafioquebec.v1.model.ClienteRequest;
import br.com.diodesafioquebec.v1.model.ModalidadeDeEmprestimoResponse;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/emprestimos")
@Api(tags = "Modalidades de Emprestimo")
public class ModalidadesController {
    private final PossibilidadeDeEmprestimoFacade possibilidadeDeEmprestimoFacade;

    public ModalidadesController(PossibilidadeDeEmprestimoFacade possibilidadeDeEmprestimoFacade) {
        this.possibilidadeDeEmprestimoFacade = possibilidadeDeEmprestimoFacade;
    }

    @PostMapping(value = "/modalidades")
    @ModalidadeEmprestimoSwagger
    public ModalidadeDeEmprestimoResponse pesquisa(@RequestBody @Valid ClienteRequest request) {
        return possibilidadeDeEmprestimoFacade.buscaPorCombinacao(request);
    }
}
