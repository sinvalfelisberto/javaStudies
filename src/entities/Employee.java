package entities;

public class Employee {
    private String name;
    private Double grossSalary;
    private Double tax;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGrossSalary(Double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public Double getGrossSalary() {
        return this.grossSalary;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTax() {
        return this.tax;
    }

    public Double netSalary() {
        return getGrossSalary() - getTax();
    }

    public void increaseSalary(Double percentage) {
        Double tempSalary;
        if (percentage > 1) {
            tempSalary = getGrossSalary() * ((percentage / 100) + 1);
            setGrossSalary(tempSalary);
            return;
        }
        tempSalary = (getGrossSalary() * percentage) + getGrossSalary();
        setGrossSalary(tempSalary);
    }

    public String toString() {
        return getName()
                + ", $ "
                + String.format("%.2f", netSalary());
    }

}
