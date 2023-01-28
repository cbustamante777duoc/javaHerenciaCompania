public class Cliente extends Persona{

    private int IdCustomer;

    public Cliente(String name, String lastName, String fiscalNumber, String address, int idCustomer) {
        super(name, lastName, fiscalNumber, address);
        IdCustomer = idCustomer;
    }
    
    public int getIdCustomer() {
        return IdCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        IdCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Cliente [IdCustomer=" + IdCustomer + "]"+super.toString();
    }



}
