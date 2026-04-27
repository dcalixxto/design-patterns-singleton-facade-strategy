public class FretePorTransportadora implements EstrategiaFrete {
    @Override
    public double calcular(double pesoKg) {
        double bruto = pesoKg * 9.0;
        double desconto = pesoKg > 5 ? bruto * 0.10 : 0;
        return bruto - desconto;
    }
}