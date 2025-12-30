package br.com.estudos.services;

import java.math.BigDecimal;

public class PaypalService implements OnlinePaymentService {
    
    @Override
    public BigDecimal paymentFee(BigDecimal amount) {
        return amount.multiply(new BigDecimal("0.02"));
    }

    @Override
    public BigDecimal interest(BigDecimal amount, int months) {
        return amount.multiply(new BigDecimal("0.01").multiply(BigDecimal.valueOf(months)));
    }
}
