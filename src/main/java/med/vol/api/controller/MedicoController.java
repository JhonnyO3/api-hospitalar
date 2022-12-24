package med.vol.api.controller;


import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.vol.api.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional //sinaliza tranzações no banco de dados
    public void cadastrar(@RequestBody @Valid  DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }
    @GetMapping
    public Page<DadosListagemMedico> exibir(Pageable paginacao) { //no parametro é passado uma interface do spring que faz a paginação
        return repository.findAll(paginacao).map(DadosListagemMedico::new); //realizando um parse para que o listagem medico consiga se adequar ao medico, pois a classe é referente ao medico

    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAttMedico dadosAtt) {

        var medico = repository.getReferenceById(dadosAtt.id());
        medico.atualizarInfo(dadosAtt);

    }
    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }



}
