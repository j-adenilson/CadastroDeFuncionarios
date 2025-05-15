package br.com.crud.CadastroDeFuncionarios.Setor;

import br.com.crud.CadastroDeFuncionarios.Funcionarios.FuncionariosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_setor")
@NoArgsConstructor //Cria os construtores sem argumentos
@AllArgsConstructor //Cria os construtores com todos os arguentos
@Data //Cria todos os getter and setter

public class SetorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeSetor;

    private String cargoFuncionarios;

    //@OneToMany - Um setor pode ter varios funcionarios
    @OneToMany(mappedBy = "setor")
    private List<FuncionariosModel> funcionarios;

}
