public class Empleado {
    public int calcularSalario(int sueldoBase){
        return sueldoBase;
    }

    public int calcularSalario(int sueldoBase, int bonificacion){
        return sueldoBase + bonificacion;
    }

    public int calcularSalario(int sueldoBase, int bonificacion, int horasExtra){
        return sueldoBase + bonificacion + (horasExtra * 20);
    }

}
