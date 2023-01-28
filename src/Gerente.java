public class Gerente extends Empleado {

    private double budget;

    public Gerente(String name, String lastName, String fiscalNumber, String address, double remuneration,
            int idEmployee, double budget) {
        super(name, lastName, fiscalNumber, address, remuneration, idEmployee);
        this.budget = budget;
    }



    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }



    @Override
    public String toString() {
        return "Gerente [budget=" + budget + "]"+super.toString();
    }




    
}
