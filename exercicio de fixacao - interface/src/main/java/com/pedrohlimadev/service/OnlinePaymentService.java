package com.pedrohlimadev.service;

public interface OnlinePaymentService {
    double paymentFee(double amount);
    double interest(double amount, int months);
}
