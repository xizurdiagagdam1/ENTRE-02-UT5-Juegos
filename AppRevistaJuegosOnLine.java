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
        System.out.println(juegos.toString());
        
    }

}
