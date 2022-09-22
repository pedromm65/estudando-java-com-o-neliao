package service;

import java.security.InvalidParameterException;

public class UsaInterestService implements InterestService{
    private static double interestRate = 1.0;

    public UsaInterestService() {
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
