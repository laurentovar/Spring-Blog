package com.codeup.spring.repositories;
import com.codeup.spring.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
//Create a UserRepository interface and inject it into the PostController.
public interface UserRepository extends JpaRepository<User, Long> {
}
