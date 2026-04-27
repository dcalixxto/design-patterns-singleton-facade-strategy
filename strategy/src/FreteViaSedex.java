public class FreteViaSedex implements EstrategiaFrete {
    private static final double TARIFA = 12.5;

    @Override
    public double calcular(double pesoKg) {
        return pesoKg * TARIFA;
    }
}