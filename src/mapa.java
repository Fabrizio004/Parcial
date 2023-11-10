import java.util.ArrayList;

public class mapa {
    // Atributos
    private boolean areaFin;
    private boolean areaInicio;
    private ArrayList<Boolean> casillas;
    private String color;
    private ArrayList<Ficha> fichas;

    // Constructor por defecto
    public mapa() {
        this.areaFin = false;
        this.areaInicio = false;
        this.casillas = new ArrayList<>();
        this.color = "";
    }

    // Constructor con parámetros
    public mapa(boolean areaFin, boolean areaInicio, ArrayList<Boolean> casillas, String color) {
        this.areaFin = areaFin;
        this.areaInicio = areaInicio;
        this.casillas = casillas;
        this.color = color;
    }

    // Métodos

    public void finalizarTurno() {
        // finalizar el turno
    }

    public void iniciacion() {
        // inicialización del juego
    }

    public void moverFicha() {
        // over una ficha en el juego
    }

    public void reiniciar() {
        //reiniciar el juego
    }
    public void agregarFicha(Ficha fichas) {
        fichas.add(fichas);
    }

    public boolean verificarGanador() {

        return false;
    }

    // Métodos getter y setter
    public boolean isAreaFin() {
        return areaFin;
    }

    public void setAreaFin(boolean areaFin) {
        this.areaFin = areaFin;
    }

    public boolean isAreaInicio() {
        return areaInicio;
    }

    public void setAreaInicio(boolean areaInicio) {
        this.areaInicio = areaInicio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
