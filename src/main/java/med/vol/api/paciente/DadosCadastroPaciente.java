package med.vol.api.paciente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import med.vol.api.endereco.Endereco;

public record DadosCadastroPaciente(

        @NotBlank
        String nome,
        @NotBlank @Email
        String email,

        String telefone,
        @NotBlank
        String cpf,
        Endereco endereco) {
}


