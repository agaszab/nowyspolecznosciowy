package pl.betulia.spolecznoscnet.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.betulia.spolecznoscnet.mod.Relation;

public interface RelationRepository extends JpaRepository<Relation, Long> {

}
