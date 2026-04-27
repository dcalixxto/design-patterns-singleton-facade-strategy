public class FreteViaPAC implements EstrategiaFrete {
    @Override
    public double calcular(double pesoKg) {
        return pesoKg * 6.0 + 2.0; // taxa fixa + por kg
    }
}