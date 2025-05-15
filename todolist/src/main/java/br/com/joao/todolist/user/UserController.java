package br.com.joao.todolist.user;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


/**
 * Modificadores
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class UserController {
    /*
     * String (texto)
     * Integer (int) numeros inteiros, 1, 12, 23, 434
     * Double (double) numeros 0.00
     * Float (float) numeros 0.00000
     * Char (char) A, B, C
     * Date (data)
     * void (    )
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.name);
    }
}
