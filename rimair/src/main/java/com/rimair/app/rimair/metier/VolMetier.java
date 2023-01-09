package com.rimair.app.rimair.metier;

import java.util.List;
import java.util.Optional;

import com.rimair.app.rimair.models.Vol;

public interface VolMetier {
    void saveVol(Vol vol);
    List<Vol> vols();
    void updateVol(Vol vol, Long id);
    void deleteVol(Long id);
    Optional<Vol> getVol(Long vol);
}
