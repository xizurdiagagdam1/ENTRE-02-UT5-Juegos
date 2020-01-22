/**
 * Un objeto de esta clase guarda informaci�n relativa a un juego
 * 
 * @Xavier Izurdiaga
 */
public class Juego {
    private static final String SEPARADOR = ":";
    private String titulo;
    private Genero genero;
    private int year;
    private int[] valoraciones;

    /**
     *  Inicializa los atributos a partir de la informaci�n recibida
     *  Esta informaci�n se encuentra en linea
     */
    public Juego(String linea) {
        linea = linea.replace(" ", "");
        String[] aux = linea.split(SEPARADOR);
        titulo = aux[0];
        valoraciones = new int[10];
        genero = Genero.valueOf(aux[1].toUpperCase());
        year = Integer.parseInt(aux[2]);
        for(int a = 0; a < 10; a++){
            valoraciones[a] = Integer.parseInt(aux[a + 3]);
        }
    }

    /**
     * accesor t�tulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * accesor g�nero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * accesor year
     */
    public int getYear() {
        return year;
    }

    /**
     * accesor valoraciones
     */
    public int[] getValoraciones() {
        return valoraciones;
    }

    /**
     * total votos emitidos
     */
    public int getVotos() {
        int total = 0;
        for(int a = 0; a < valoraciones.length; a ++){
            total += valoraciones[a];
        }
        return total;
    }

    /**
     *  obtener valoraci�n media
     */
    public double getValoracionMedia() {
        double total = 0;
        for(int a = 0; a < valoraciones.length; a ++){
            total += valoraciones[a] * (a + 1);
        }
        total = total / getVotos();
        return total;
    }

    /**
     *  Un usuario punt�a el juego con un valor entre 1 y 10 
     */
    public void puntuar(int puntuacion) {
        valoraciones[puntuacion]++;
    }

    /**
     * Representaci�n textual del juego 
     * (Ver enunciado)
     */
    public String toString() {
        return titulo + "\nG�nero: " + this.genero +
        "| Lanzamiento: " + this.year +
        "\nValoraci�n (" + getVotos() + " votos): "
        + String.format("%.2f", this.getValoracionMedia());

    }

    public static void main(String[] args) {
        Juego juego1 = new Juego(
                "Steep: deportes: 2016  : 0:0:0:0: 0: 0:0:0:12:  10");
        System.out.println(juego1.toString());

        Juego juego2 = new Juego(
                "For the King: estrategia: 2018  : 0:0:0:7: 12: 0:33:13:2: 0");
        System.out.println(juego2.toString());

    }
}
