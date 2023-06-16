package fa.training.management;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fa.training.entities.Multimedia;

public class MultimediaManagement {
	private List<Multimedia> listOfMultimedia;

	public MultimediaManagement(ArrayList<Multimedia> arrayList) {
		super();
		this.listOfMultimedia = arrayList;
	}

	public void displayMultiMedia() {
		for (Multimedia multimedia : listOfMultimedia) {
			System.out.println(multimedia);
		}
	}
	
	public void addMultiMedia(Multimedia multimedia) {
		listOfMultimedia.add(multimedia);
	}

}
