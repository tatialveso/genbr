package polyinherence.ex01;

public class Animal {
	private String name;
	private int age;
	private String sound;
	
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
}
