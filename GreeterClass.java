
public class GreeterClass {
private String name;
private int age;

public GreeterClass() {
	name="Jasmine";
	age=17; }

public GreeterClass(String xName, int xAge) {
	name=xName;
	age=xAge; }

public String toString() {
	return "Greeter: Name - "+name+"Age - "+age; }
}
