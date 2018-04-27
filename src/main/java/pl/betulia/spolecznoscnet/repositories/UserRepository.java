package pl.betulia.spolecznoscnet.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.betulia.spolecznoscnet.mod.User;


public interface UserRepository extends JpaRepository<User, Long> {

  User  findByUsername(String login);

}