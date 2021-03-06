package temperaturakelvin1;

/**
 * Crear: clases de equivalencia y las pruebas de codigo
 * correspondientes a la clase TemperaturaKelvin.
 * 
 * Kelvin - CTE => centígragos
 * ( Kelvin-CTE ) * 9 / 5 + 32 => Farenheit
 * 
 * K => Cº -273,15 ==0    -100 == 173,15
 * 
 * @author dam132
 */
public class TemperaturaKelvin {
    
    private double temperaturaKelvin;
    static final double CTE = 273.15;
    
    
    public TemperaturaKelvin() {
    }

    public TemperaturaKelvin( double temperaturaKelvin ) {
        this.temperaturaKelvin = temperaturaKelvin;
    }
    
    public double getTemperaturaCelsius() {
        return temperaturaKelvin - CTE;
    }
    
    public double getTemperaturaFahrenheit() {
        return ( temperaturaKelvin - CTE ) * 9 / 5 + 32;
    }

    public double getTemperaturaKelvin() {
        return temperaturaKelvin;
    }

    public void setTemperaturaKelvin( double temperaturaKelvin ) {
        this.temperaturaKelvin = temperaturaKelvin;
    }
    
 }
