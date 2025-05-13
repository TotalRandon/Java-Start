package br.com.joao.todolist.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/primeiraRota")
//HTTPS://localhost:8080/primeiraRota
public class MainController {
    /**
     * METODOS HTTP
     * 
     * GET = Buscar/mostrar uma informação
     * POST = Adicionar um dado/info
     * PUT = Atualizar um dado/info
     * DELETE = Excluir um dado
     * PATH = Alterar apenas uma parte do dado/info
     * 
     */
    @GetMapping("/")
    public String primeiraMensagem() {
        return "Funcionou!";
    }
}
