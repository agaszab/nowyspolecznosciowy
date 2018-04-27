package pl.betulia.spolecznoscnet.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.betulia.spolecznoscnet.mod.UserRole;

public interface UserRoleRepository extends JpaRepository <UserRole, Long> {
    UserRole findByRole(String role);
}
