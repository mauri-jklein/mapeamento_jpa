package educar.rs.endereco_jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Endereco {

    @Id
    private Long id;
    private String rua;
    private String cidade;
    private String estado;
    private String cep;

    //@JsonIgnoreProperties
    @JsonIgnore
    @OneToMany(mappedBy = "endereco")
    private List<Usuario> usuarios;

}
