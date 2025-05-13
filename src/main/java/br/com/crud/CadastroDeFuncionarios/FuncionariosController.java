package br.com.crud.CadastroDeFuncionarios;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FuncionariosController {


    @GetMapping("/boasvindas")
    public String boasVinads(){
        return "Essa é minha primeira mensagem nessa rota";
    }

}
