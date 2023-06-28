package educar.rs.endereco_jpa.controller;

import educar.rs.endereco_jpa.entity.Endereco;
import educar.rs.endereco_jpa.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;

    @PostMapping("endereco")
    public ResponseEntity<Endereco> salvarEndereco(@RequestBody Endereco endereco){
        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoService.salvarEndereco(endereco));
    }

    @GetMapping("enderecos")
    public ResponseEntity<List<Endereco>> buscarEnderecos(){
        return ResponseEntity.status(HttpStatus.OK).body(enderecoService.buscarEnderecos());
    }

    @GetMapping("enderecos/cidade/{nomeCidade}")
    public ResponseEntity<Endereco> buscarEnderecos(@PathVariable String nomeCidade){
        return ResponseEntity.status(HttpStatus.OK).body(enderecoService.buscarEnderecoPorCidade(nomeCidade));
    }

}
