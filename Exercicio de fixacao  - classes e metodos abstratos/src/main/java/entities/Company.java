package entities;

import entities.enums.Type;

public class Company extends Pessoa {
    private Integer numberOfEmployees;

    public Company(String name, double income, Integer numberOfEmployees) {
        super(name, income);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        double percentage = 0.0;

        if (numberOfEmployees > 10) {
            percentage = 0.14;
        } else {
            percentage = 0.16;
        }
        return getIncome() * percentage;
    }
}
