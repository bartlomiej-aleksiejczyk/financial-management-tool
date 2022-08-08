package bartlomiej9867463.financialmanagementtool.service;

import bartlomiej9867463.financialmanagementtool.domain.Wydatek;
import bartlomiej9867463.financialmanagementtool.exception.WydatekNotFoundException;
import bartlomiej9867463.financialmanagementtool.repository.WydatekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Wydatek> findAllWydatek(){
        return wydatekRepository.findAll();
    }
    public Wydatek findWydatek(Long id){
        return wydatekRepository.findWydatekById(id).orElseThrow(() -> new  WydatekNotFoundException("Wydatek by id"+ id+"was not found"));
    }
    public Wydatek updateWydatek(Wydatek wydatek){
        return wydatekRepository.save(wydatek);
    }
    public void deleteWydatek(Long id){
        wydatekRepository.deleteWydatekById(id);
    }
}
