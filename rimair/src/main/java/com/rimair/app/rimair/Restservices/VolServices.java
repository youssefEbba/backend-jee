package com.rimair.app.rimair.Restservices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rimair.app.rimair.metier.VolMetier;
import com.rimair.app.rimair.models.Vol;

@RestController
public class VolServices {
    @Autowired
    VolMetier volMetier;
    @RequestMapping(value = "/vols" ,method = RequestMethod.POST)
    public String saveVol(@RequestBody Vol vol) {
        volMetier.saveVol(vol);
        return "succes";
    }
     
    @RequestMapping(value = "/vols" , method = RequestMethod.GET)
    public List<Vol> vols() {
        return volMetier.vols();
    }
    @RequestMapping(value = "/vols/{id}", method = RequestMethod.PUT)
    public Optional<Vol> updateVol(@RequestBody Vol vol , @PathVariable Long id) {
        volMetier.updateVol(vol ,id);
        return volMetier.getVol(id);
        
    }
    @RequestMapping(value = "/vols/{vol}", method = RequestMethod.DELETE)
    public void deleteVol(@PathVariable Long vol) {
        volMetier.deleteVol(vol);
    }
    @RequestMapping(value = "/vols/{vol}", method = RequestMethod.GET)
    public Optional<Vol> getVol(@PathVariable Long vol) {
        return volMetier.getVol(vol);
    }

}
