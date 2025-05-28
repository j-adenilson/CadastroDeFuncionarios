package br.com.crud.CadastroDeFuncionarios.Funcionarios;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class FuncionariosController {


    @GetMapping("/boasvindas")
    public String boasVinads(){
        return "Essa é minha primeira mensagem nessa rota";
    }


    //Adicionar funconarios  (CREATE)
    @PostMapping("/criar")
    public String criarfuncionario(){
        return "Funcionário criado";
    }

    //Procurar funcionarios por ID (REATE)
    @GetMapping("/todos")
    public String mostrarTodosOsfuncionariosId(){
        return "Mostrar Funcionarios";
    }

    //Mostrar os funcionarios por ID (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsfuncionarios(){
        return "Mostrar Funcionarios Por ID";
    }
    //Alterar dados dos funcionarios (UPDATE)
    @PutMapping("/alterarID")
    public String alterarFuncionarioPorId(){
        return "Alterar Funcionarios Por ID";
    }
    //Deletar funcionarios (DELETE)
    @DeleteMapping("/deletarID")
    public  String deletarPorId(){
        return "Deletar por ID";
    }
}
