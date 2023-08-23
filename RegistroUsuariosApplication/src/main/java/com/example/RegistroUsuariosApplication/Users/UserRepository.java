package com.example.RegistroUsuariosApplication.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserAplication, Long> {

    Optional<UserAplication> findUserAplicationByName(String name);

}
