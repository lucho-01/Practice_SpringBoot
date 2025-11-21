package app.domain.ports;


import app.domain.models.Pilar;

public interface PilarPort {

	Pilar findById(Pilar pilar)throws Exception;
	Pilar update(Pilar pilar)throws Exception;
	Pilar save(Pilar pilar)throws Exception;
}
