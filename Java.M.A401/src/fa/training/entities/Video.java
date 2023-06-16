package fa.training.entities;

public class Video extends Multimedia {

	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Video(String name, double duration) {
		super(name, duration);
		// TODO Auto-generated constructor stub
	}

	public void createVideo() {
		System.out.println("---Enter video information---");
		super.createMultimedia();
	}

	@Override
	public String toString() {
		return "Video []" + super.toString();
	}

}
