package ma.xproce.demo.repositories;

import ma.xproce.demo.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface videoRepository extends JpaRepository<Video,Long> {
List<Video> findAll();

}
