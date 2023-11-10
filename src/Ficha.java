public class Ficha {

    private int cantidadDeFichas;
    private String color;
    private int fichasRestantes;
    private String nombreDeJugador;
    private int posicionDeCasilla;
    private String tipoDeFicha;
    private mapa mapa;
    private Dado dado;

    // Constructores
    public Ficha() {
        // Constructor por defecto
    }

    public Ficha(int cantidadDeFichas, String color, int fichasRestantes, String nombreDeJugador,
                 int posicionDeCasilla, String tipoDeFicha) {
        this.cantidadDeFichas = cantidadDeFichas;
        this.color = color;
        this.fichasRestantes = fichasRestantes;
        this.nombreDeJugador = nombreDeJugador;
        this.posicionDeCasilla = posicionDeCasilla;
        this.tipoDeFicha = tipoDeFicha;
        this.mapa = mapa;
        this.dado = dado;
    }


    // Métodos
    public void capturarFicha() {
        // Lógica para capturar una ficha
        System.out.println("Ficha capturada");
    }

    public void movimiento() {

        if (dado.obtenerValor() > 0) {
            System.out.println(
                    "Movimiento de la ficha: " + dado.obtenerValor() + " espacios");

            posicionDeCasilla += dado.obtenerValor();

            posicionDeCasilla += dado.obtenerValor();

        }
        else {
            System.out.println("Primero debes lanzar los dados.");
        }
    }


    public void resetearFicha() {

        System.out.println("Ficha reseteada");
    }

    public void retroceder() {
        //  retroceder la ficha
        System.out.println("Retroceso de la ficha");
    }
    public void lanzarDados() {
        dado.tirarDadosTodos();
    }

    public int getCantidadDeFichas() {
        return cantidadDeFichas;
    }

    public void setCantidadDeFichas(int cantidadDeFichas) {
        this.cantidadDeFichas = cantidadDeFichas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFichasRestantes() {
        return fichasRestantes;
    }

    public void setFichasRestantes(int fichasRestantes) {
        this.fichasRestantes = fichasRestantes;
    }

    public String getNombreDeJugador() {
        return nombreDeJugador;
    }

    public void setNombreDeJugador(String nombreDeJugador) {
        this.nombreDeJugador = nombreDeJugador;
    }

    public int getPosicionDeCasilla() {
        return posicionDeCasilla;
    }

    public void setPosicionDeCasilla(int posicionDeCasilla) {
        this.posicionDeCasilla = posicionDeCasilla;
    }

    public String getTipoDeFicha() {
        return tipoDeFicha;
    }

    public void setTipoDeFicha(String tipoDeFicha) {
        this.tipoDeFicha = tipoDeFicha;
    }

    public void add(Ficha ficha) {
    }
}
