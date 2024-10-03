package applications.doacoes.service;

import applications.doacoes.dto.request.DoacaoRequest;
import applications.doacoes.entity.Doacao;
import applications.doacoes.repository.DoacaoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoacaoService {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    private DoacaoRepository doacaoRepository;

    @Transactional
    public int insereDoacao(DoacaoRequest request){
        Doacao doacao = new Doacao();

        doacao.setNomeDoador(request.getNomeDoador());
        doacao.setTipoDoacao(request.getTipoDoacao());
        doacao.setQuantidade(request.getQuantidade());
        doacao.setValor(request.getValor());

        Integer idDoacao = Math.toIntExact(entityManager.merge(doacao).getId());

        return idDoacao;
    }

    public List<Doacao> listarDoacoes() {
        return doacaoRepository.findAll();
    }

}


