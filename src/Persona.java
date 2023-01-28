public class Persona {
    private String name;
    private String lastName;
    private String fiscalNumber;
    private String address;
    
    public Persona(String name, String lastName, String fiscalNumber, String address) {
        this.name = name;
        this.lastName = lastName;
        this.fiscalNumber = fiscalNumber;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFiscalNumber() {
        return fiscalNumber;
    }
    public void setFiscalNumber(String fiscalNumber) {
        this.fiscalNumber = fiscalNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Override
    public String toString() {
        return "Persona [name=" + name + ", lastName=" + lastName + ", fiscalNumber=" + fiscalNumber + ", address="
                + address + "]";
    }




    
}
