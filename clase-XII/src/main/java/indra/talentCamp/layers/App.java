package indra.talentCamp.layers;

import java.awt.Color;

import indra.talentCamp.layers.models.Jedi;
import indra.talentCamp.layers.persistence.JediFileRepository;
import indra.talentCamp.layers.persistence.NotFoundException;
import indra.talentCamp.layers.persistence.SaveErrorException;

public class App {

	public static void main(String[] args) {

		JediFileRepository prueba = new JediFileRepository();
//		try {
//			prueba.save(new Jedi("Anakin",1000, Color.RED));
//		} catch (SaveErrorException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Jedi jedi;
//		try {
//			jedi = prueba.findById(1);
//			System.out.println(jedi);
//		} catch (NotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		prueba.findAll();
	}

}
