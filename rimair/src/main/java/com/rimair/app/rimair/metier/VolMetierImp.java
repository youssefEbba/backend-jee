package com.rimair.app.rimair.metier;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rimair.app.rimair.dao.VolRepository;
import com.rimair.app.rimair.models.Vol;
@Service
public class VolMetierImp implements VolMetier {
    @Autowired
    VolRepository volrepository;
    @Override
    public void saveVol(Vol vol) {
     volrepository.save(vol);
        
    }

    @Override
    public List<Vol> vols() {
   
        return volrepository.findAll();
    }

    @Override
    public void updateVol(Vol vol ,Long id) {
        volrepository.save(vol);
        
    }

    @Override
    public void deleteVol(Long id) {
       volrepository.deleteById(id);
        
    }

    @Override
    public Optional<Vol> getVol(Long vol) {
        
        return volrepository.findById(vol);
    }
    
}
