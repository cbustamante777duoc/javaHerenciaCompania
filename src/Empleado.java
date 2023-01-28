public class Empleado extends Persona{

    private double remuneration;
    private int idEmployee;

    public Empleado(String name, String lastName, String fiscalNumber, String address, double remuneration,
            int idEmployee) {
        super(name, lastName, fiscalNumber, address);
        this.remuneration = remuneration;
        this.idEmployee = idEmployee;
    }
    
    public double getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(double remuneration) {
        this.remuneration = remuneration;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public void increaseRemuneration(int porcentaje){
        this.remuneration += this.remuneration* porcentaje/100;
        System.out.println("nueva"+this.remuneration);
    }

    @Override
    public String toString() {
        return "Empleado [remuneration=" + remuneration + ", idEmployee=" + idEmployee + "]"+super.toString();
    }

    

    
    

    

}
