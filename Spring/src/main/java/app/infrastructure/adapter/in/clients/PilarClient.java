package app.infrastructure.adapter.in.clients;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import app.application.UseCases.PilarUseCase;
import app.domain.models.Pilar;
import app.infrastructure.adapter.in.builders.PilarBuilder;
import jdk.jshell.Snippet.Status;
@Controller
public class PilarClient {
	@Autowired
	private PilarBuilder pilarBuilder;
	@Autowired
	private PilarUseCase pilarUsecase;
	private static final String MENU = "Ingrese una de las opciones \n1. para agregar la ubicacion de un pilar \n2. para actualizar la ubicacion de un pilar \n3. para salir";
	private static Scanner reader = new Scanner(System.in);

	public void session() {
		boolean session = true;
		while (session) {
			session = menu();

		}
	}

	private boolean menu() {
		try {
			System.out.println(MENU);
			String option = reader.nextLine();
			switch (option) {
			case "1": {
				Pilar pilar = readInfoFromPilar();
				pilarUsecase.createPilar(pilar);
				return true;
			}
			case "2": {
				Pilar pilar = readInfoFromPilar();
				pilarUsecase.updatePilar(pilar);
				return true;
			}
			case "3": {
				System.out.println("Cerrando sesion");
				return false;
			}
			default: {
				System.out.println("Ingrese una opcion valida");
				return true;
			}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	private Pilar readInfoFromPilar() throws Exception {
		System.out.println("Ingrese el nombre del pilar");
		String name = reader.nextLine();
		System.out.println("Ingrese la posicion en Y del pilar");
		String posY = reader.nextLine();
		System.out.println("ingrese la posicion en X del pilar");
		String posX = reader.nextLine();
		System.out.println("ingrese el estado del pilar");
		String statusInput = reader.nextLine();
		Status status = Status.valueOf(statusInput);

		return pilarBuilder.build(name, posX, posY, statusInput);
	}
}
