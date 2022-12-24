package med.vol.api.medico;

import jakarta.validation.constraints.NotNull;
import med.vol.api.endereco.DadosEndereco;

public record DadosAttMedico(
       @NotNull
       Long id,
       String email,
       String telefone,
       DadosEndereco endereco) {
}
