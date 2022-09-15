package entities;

public class Individual extends Pessoa {

    private Double healthIncome;

    public Individual(String name, double income, Double healthIncome) {
        super(name, income);
        this.healthIncome = healthIncome;
    }

    public Double getHealthIncome() {
        return healthIncome;
    }

    public void setHealthIncome(Double healthIncome) {
        this.healthIncome = healthIncome;
    }

    @Override
    public Double tax() {

        double percentage = 0.0;

        if (getIncome() < 20000.00) {
            percentage = 0.15;
        } else {
            percentage = 0.25;
        }

        double halfHealthIncome = healthIncome / 2;

        return getIncome() * percentage - halfHealthIncome;
    }
}
