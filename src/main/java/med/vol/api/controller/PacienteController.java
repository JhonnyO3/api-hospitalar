package med.vol.api.controller;

import jakarta.validation.Valid;
import med.vol.api.paciente.DadosCadastroPaciente;
import med.vol.api.paciente.DadosListagemPaciente;
import med.vol.api.paciente.Paciente;
import med.vol.api.paciente.PacienteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {


    private PacienteRepository repository;


    @PostMapping
    public void cadastrarPaciente(@RequestBody @Valid DadosCadastroPaciente paciente) {
        System.out.println(paciente);
        repository.save(new Paciente(paciente));

    }

    @GetMapping
    public Page<DadosListagemPaciente> exibir(Pageable paginacao) {
      return repository.findAll(paginacao).map(DadosListagemPaciente::new);
    }





}
