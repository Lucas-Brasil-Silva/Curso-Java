package br.com.estudos.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.estudos.model.Contract;
import br.com.estudos.model.Installment;

public class ContractService {

    private OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }
    
    public void processContract(Contract contract, int months) {

        BigDecimal basicQuota = contract.getTotalValue().divide(BigDecimal.valueOf(months), 2, RoundingMode.HALF_EVEN);

        for (int i = 1; i <= months; i++) {
            LocalDate installmentDate = contract.getDate().plusMonths(i);

            BigDecimal interest = paymentService.interest(basicQuota, i);
            BigDecimal amountWithInterest = basicQuota.add(interest);

            BigDecimal paymentFee = paymentService.paymentFee(amountWithInterest);
            BigDecimal finalAmount = amountWithInterest.add(paymentFee);

            finalAmount = finalAmount.setScale(2, RoundingMode.HALF_EVEN);

            contract.getListInstallments().add(new Installment(installmentDate, finalAmount));
        }
    }
}
