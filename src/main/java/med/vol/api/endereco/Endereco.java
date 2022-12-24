package med.vol.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Endereco {

    private String logradouro;
    private String bairro;
    private String numero;
    private String cep;

    private String cidade;
    private String uf;

    private String complemento;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.uf = dados.uf();
        this.cidade = dados.cidade();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
    }

    public void atualizarInfo(DadosEndereco dados) {
        if (dados.logradouro() != null) {
            this.logradouro = dados.logradouro();
        };

        if (dados.bairro() != null) {
            this.bairro = dados.bairro();
        };

        if (dados.cep() != null) {
            this.cep = dados.cep();
        };

        if (dados.uf() != null) {
            this.uf = dados.uf();
        };

        if (dados.cidade() != null) {
            this.cidade = dados.cidade();
        };

        if (dados.numero() != null) {
            this.numero = dados.numero();
        };

        if (dados.complemento() != null) {
            this.complemento = dados.complemento();
        };



    }
}
