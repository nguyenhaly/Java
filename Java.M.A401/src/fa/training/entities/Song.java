package fa.training.entities;

import java.util.Scanner;

public class Song extends Multimedia {
	private String singer;

	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Song(String name, double duration) {
		super(name, duration);
		// TODO Auto-generated constructor stub
	}

	public Song(String name, double duration, String singer) {
		super(name, duration);
		this.singer = singer;
	}

	public void createSong() {
		System.out.println("---Enter song information---");
		super.createMultimedia();
		System.out.print("Enter singer:");
		Scanner sc = new Scanner(System.in);
		this.singer = sc.nextLine();
	}

	@Override
	public String toString() {
		return "Song [singer=" + singer + "]" + super.toString();
	}

}
