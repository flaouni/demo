package ma.xproce.demo.repositories;

import ma.xproce.demo.entities.Creator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface creatorRepository extends JpaRepository<Creator,Long> {
Optional<Creator> findById(Long id);

}
