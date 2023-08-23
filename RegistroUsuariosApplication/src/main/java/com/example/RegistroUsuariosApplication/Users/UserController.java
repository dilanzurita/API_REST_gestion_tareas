// UserController.java
package com.example.RegistroUsuariosApplication.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserAplication> getAllUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public ResponseEntity<Object> crearUser(@RequestBody UserAplication user) {
        return userService.createUser(user);
    }

    @PutMapping
    public ResponseEntity<Object> actualizarUser(@RequestBody UserAplication user) {
        return userService.updateUser(user);
    }

    @DeleteMapping(path = "{userId}")
    public ResponseEntity<Object> eliminarUser(@PathVariable("userId") Long userId) {
        return userService.deleteUser(userId);
    }

}
