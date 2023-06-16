package fa.training.entities;

import java.util.Scanner;

public abstract class Multimedia {
	private String name;
	private double duration;

	public Multimedia(String name, double duration) {
		super();
		this.name = name;
		this.duration = duration;
	}

	public Multimedia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void createMultimedia() {
		Scanner sc = new Scanner(System.in);

		boolean status;
		System.out.print("Enter name:");
		this.name = sc.nextLine();

		do {
			status = false;
			System.out.print("Enter duration:");
			try {
				this.duration = Double.parseDouble(sc.nextLine());
			} catch (Exception exception) {
				status = true;
			}

		} while (status);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Multimedia [name=" + name + ", duration=" + duration + "]";
	}
	
}
