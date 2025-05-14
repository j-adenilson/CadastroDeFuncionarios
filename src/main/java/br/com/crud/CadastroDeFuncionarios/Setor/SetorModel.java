package br.com.crud.CadastroDeFuncionarios.Setor;

import br.com.crud.CadastroDeFuncionarios.Funcionarios.FuncionariosModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_setor")
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
