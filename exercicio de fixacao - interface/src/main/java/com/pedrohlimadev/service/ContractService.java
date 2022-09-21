package com.pedrohlimadev.service;

import com.pedrohlimadev.entities.Contract;
import com.pedrohlimadev.entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int mounts) {
        double basicQuota = contract.getTotalValue() / mounts;
        for (int i = 1; i <= mounts ; i++) {
            double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
            double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
            Date dueDate = addMounths(contract.getDate(), i);

            contract.getInstallment().add(new Installment(dueDate, fullQuota));
        }
    }

    private Date addMounths (Date date, int N) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, N);
        return calendar.getTime();
    }
}
