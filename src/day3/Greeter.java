package day3;
import javax.swing.JOptionPane;
public class Greeter {
public static void main(String[] args) {
	String name;
	name = JOptionPane.showInputDialog(null, "Type in your name!");
	name = JOptionPane.showInputDialog(null, "Good Day "+ name);
	System.out.println(name);
}
}
