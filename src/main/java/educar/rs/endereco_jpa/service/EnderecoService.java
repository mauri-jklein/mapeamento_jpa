package educar.rs.endereco_jpa.service;

import educar.rs.endereco_jpa.entity.Endereco;
import educar.rs.endereco_jpa.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco salvarEndereco(Endereco endereco){
        return enderecoRepository.save(endereco);
    }

    public Endereco buscarEnderecoPorId(Long id){
        return enderecoRepository.findById(id).get();
    }

    public Endereco buscarEnderecoPorCidade(String cidade){
        return enderecoRepository.findByCidade(cidade);
    }

    public Endereco buscarEnderecoPorCep(String cep){
        return enderecoRepository.findByCep(cep);
    }

    public List<Endereco> buscarEnderecos() {
        return enderecoRepository.findAll();
    }
}
