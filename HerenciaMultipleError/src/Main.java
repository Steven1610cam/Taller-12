// Clase de prueba para observar los errores y malas prácticas
public class Main {
    public static void main(String[] args) {
        // Parte 1: Intentar crear un objeto de Futbolista (esto causará error de compilación)
        // Futbolista futbolista = new Futbolista(); // Descomentar para ver el error

        // Parte 2: Crear un objeto de Piedra
        Piedra piedra = new Piedra(); // Crear una instancia de Piedra
        piedra.correr(); // Llamar al método correr
    }
}