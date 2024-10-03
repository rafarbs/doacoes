package applications.doacoes.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="CONTROLE_DOACOES")
@DynamicInsert
@DynamicUpdate
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doacao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="ID")
    private Long id;

    @Column(name="NOME_DOADOR")
    private String nomeDoador;

    @Column(name="TIPO_DOACAO")
    private String tipoDoacao;

    @Column(name="QUANTIDADE")
    private Integer quantidade;

    @Column(name="VALOR")
    private Double valor;
}