package fa.training.main;

import java.util.ArrayList;
import java.util.Scanner;

import fa.training.entities.Multimedia;
import fa.training.entities.Song;
import fa.training.entities.Video;
import fa.training.management.MultimediaManagement;

public class Test {
	public static void main(String[] args) {
		menuInput();			
	}

	public static void menuInput() {
		int choice;
		var multimediaManagement = new MultimediaManagement(new ArrayList<Multimedia>());
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Choose function: \n" 
							+ "1. Add a new video \n" 
							+ "2. Add a new song \n"
							+ "3. Show all multimedia \n" 
							+ "4. Exit \n" 
							+ "Your choice:");
			choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1: {
				var video = new Video();
				video.createVideo();
				multimediaManagement.addMultiMedia(video);
				break;
			}
			
			case 2: {
				var song = new Song();
				song.createSong();
				multimediaManagement.addMultiMedia(song);
				break;
			}
			case 3: {
				multimediaManagement.displayMultiMedia();
				break;
				}
			}
		} 
		while (choice != 4);
		sc.close();
	}
}
