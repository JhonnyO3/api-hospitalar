package med.vol.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.vol.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
        @NotBlank // Verifica se nao é nulo nem vazio

        String nome,
        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
                @Pattern(regexp = "\\d{4,6}") //expressao regular de 4 a 6 numeros
        String crm,
        @NotNull
        Especialidade especialidade,
        @NotNull
                @Valid // validar que a classe endereço está validando kk
        DadosEndereco endereco) {
}
