package bartlomiej9867463.financialmanagementtool.service;

import bartlomiej9867463.financialmanagementtool.domain.Wydatek;
import bartlomiej9867463.financialmanagementtool.repository.WydatekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class WydatekService {
    private final WydatekRepository wydatekRepository;
    @Autowired
    public WydatekService(WydatekRepository wydatekRepository) {
        this.wydatekRepository = wydatekRepository;
    }
    public Wydatek addWydatek(Wydatek wydatek){
        return wydatekRepository.save(wydatek);
    }
}
