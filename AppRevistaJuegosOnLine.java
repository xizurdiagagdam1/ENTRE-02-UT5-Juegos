/**
 * Punto de entrada a la aplicación
 * 
 * @Xavier Izurdiaga
 */
public class AppRevistaJuegosOnLine 
{
    public static void main(String[] args)throws Exception
    {
        if(args.length == 0){
            throw new Exception("Sintaxis: java AppRevistaJuegosOnLine <nombre> <n>");
        }
        RevistaOnLineJuegos juegos = new RevistaOnLineJuegos(args[0], Integer.parseInt(args[1]));
        juegos.leerDeFichero();
        juegos.puntuar("PlanetZoo", 8);
        juegos.puntuar("Steep", 7);
        juegos.puntuar("Catastronauts", 9);
        juegos.puntuar("Wattam", 9);
        juegos.toString();
        juegos.valoracionMayorQue(8.2);
        juegos.borrarDeGenero(Genero.valueOf("ROL"));
        juegos.toString();
    }

}
