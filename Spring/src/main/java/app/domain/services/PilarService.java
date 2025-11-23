package app.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domain.models.Pilar;
import app.domain.ports.PilarPort;

@Service
public class PilarService {

    @Autowired
    private PilarPort pilarPort;

    public void createPilar(Pilar pilar) throws Exception {
        if (pilar.getId() != 0) {
        pilarPort.save(pilar);
        }
    }

    public void updatePilar(Pilar pilar) throws Exception {

        Pilar pilarInput = pilarPort.findById(pilar);

        if (pilarInput == null) {
            throw new Exception("No existe un pilar con ese id");
        }

        pilarPort.update(pilar);
    }
}