/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package repositoriotests;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
    public int sumar (int num1, int num2) {
        int suma = num1 + num2;
        System.out.println(suma);
        return suma;
    }
    public int restar (int num1, int num2) {
        int resta = num1 - num2;
        System.out.println(resta);
        return resta;
    }
}
