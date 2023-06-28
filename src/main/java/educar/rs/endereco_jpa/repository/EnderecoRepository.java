package educar.rs.endereco_jpa.repository;

import educar.rs.endereco_jpa.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

    Endereco findByCidade(String cidade);

    List<Endereco> findAllByCidade(String cidade);

    Endereco findByCep(String cep);

    Endereco findByRua(String rua);

}
