package applications.doacoes.controller;

import applications.doacoes.dto.request.DoacaoRequest;
import applications.doacoes.entity.Doacao;
import applications.doacoes.service.DoacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doacao")
public class DoacaoController {
    @Autowired
    private DoacaoService doacaoService;

    @PostMapping("/inserir")
    public String criarDoacao(@RequestBody DoacaoRequest doacao) {

        Integer idDoacao = doacaoService.insereDoacao(doacao);

        String result = "Nova Doacao Inserida com Sucesso... Id: " + idDoacao;

        return result;
    }

    @GetMapping("/listar")
     public List<Doacao> listarDoacoes() {
        return doacaoService.listarDoacoes();
    }
}

