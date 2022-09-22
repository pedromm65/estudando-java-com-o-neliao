package service;


public class BrazilInterestService implements InterestService{
    private static double interestRate = 2.0;


    public BrazilInterestService() {
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
