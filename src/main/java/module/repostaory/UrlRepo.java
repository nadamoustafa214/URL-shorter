package module.repostaory;

import module.entity.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UrlRepo extends JpaRepository<Url, Long> {
    Optional<Url> findByURLShort(String urlShort);
}
