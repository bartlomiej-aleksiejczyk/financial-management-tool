package bartlomiej9867463.financialmanagementtool.repository;

import bartlomiej9867463.financialmanagementtool.domain.Wydatek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WydatekRepository  extends JpaRepository  <Wydatek, Long> {
}
