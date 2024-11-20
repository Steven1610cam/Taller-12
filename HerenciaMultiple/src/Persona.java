
public class Persona implements Hablador, Trabajador {
    @Override
    public void hablar() {
        System.out.println("Hola, soy una persona y estoy hablando.");
    }

    @Override
    public void trabajar() {
        System.out.println("Estoy trabajando en un proyecto.");
    }
}