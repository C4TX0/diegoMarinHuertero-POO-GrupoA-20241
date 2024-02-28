public class CalculadoraImpuestos {

    public double calcularImpuestos(int ingresos){
        return ingresos + (0.15 * ingresos);
    }
    public double calcularImpuestos(int ventas,double porcentajeImpuestos) {
        return ventas * (porcentajeImpuestos/100);
    }
    public double calcularImpuestos(double porcentajeImpuestos, double dividendos, int exencion){
        double impuestos = dividendos * (porcentajeImpuestos / 100);
        if (impuestos > exencion){
            return impuestos - exencion;
        }
        else{
            return 0;
        }
    }

}
