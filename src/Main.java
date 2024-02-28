public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        CalculadoraImpuestos calculadoraImpuestos = new CalculadoraImpuestos();
        Rectangulo rectangulo = new Rectangulo();

        System.out.println("Salario 1: " + empleado.calcularSalario(1000));
        System.out.println("Salario 2: " + empleado.calcularSalario(1000, 200));
        System.out.println("Salario 3: " + empleado.calcularSalario(1000, 200, 5));

        System.out.println("Impuestos 1: " + calculadoraImpuestos.calcularImpuestos(5000));
        System.out.println("Impuestos 2: " + calculadoraImpuestos.calcularImpuestos(5000, 10));
        System.out.println("Impuestos 3: " + calculadoraImpuestos.calcularImpuestos(20, 5000, 2000));

        System.out.println("Área int: " + rectangulo.calcularArea(5, 10));
        System.out.println("Área double: " + rectangulo.calcularArea(5.5, 10.5));
        System.out.println("Perímetro int: " + rectangulo.calcutarPerimetro(5, 10));
        System.out.println("Perímetro double: " + rectangulo.calcutarPerimetro(5.5, 10.5));
    }
}
