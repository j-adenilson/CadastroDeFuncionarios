package br.com.crud.CadastroDeFuncionarios.Funcionarios;

import br.com.crud.CadastroDeFuncionarios.Setor.SetorModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Entity transforma uma classe em entidade do banco de dados
//JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor //Cria os construtores sem argumentos
@AllArgsConstructor //Cria os construtores com todos os arguentos
@Data //Cria todos os getter and setter

public class FuncionariosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "idade")
    private int idade;


    //@ManuToOne - um funcionario tem um unico setor
    @ManyToOne
    @JoinColumn(name = "setor_id") //Foreing Key ou chave estrangeira
    private SetorModel setor;
}



