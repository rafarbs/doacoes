package applications.doacoes.dto.request;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoacaoRequest {

    private String nomeDoador;
    private String tipoDoacao;
    private Integer quantidade;
    private Double valor;
}
