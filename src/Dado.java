import java.util.Random;

public class Dado {
    private int cantidadDeDados;
    private boolean estadoDeLanzamiento;
    private int valor;


    public Dado() {
        this.cantidadDeDados = 1;
        this.estadoDeLanzamiento = false;
        this.valor = 0;
    }


    public Dado(int cantidadDeDados) {
        this.cantidadDeDados = cantidadDeDados;
        this.estadoDeLanzamiento = false;
        this.valor = 0;
    }

    public int obtenerValor() {
        return valor;
    }

    public void reset() {
        this.estadoDeLanzamiento = false;
        this.valor = 0;
    }

    public void tirarDadosTodos() {
        Random random = new Random();
        int suma = 0;

        for (int i = 0; i < cantidadDeDados; i++) {
            int resultado = random.nextInt(6) + 1;  // Lanzar un dado de 6 caras
            System.out.println("Dado " + (i + 1) + ": " + resultado);
            suma += resultado;
        }

        this.valor = suma;
        this.estadoDeLanzamiento = true;
    }
}
