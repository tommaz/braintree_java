package com.braintreegateway;

import com.braintreegateway.util.NodeWrapper;

import java.math.BigDecimal;

public class ServiceFee {
    private BigDecimal amount;
    private String merchantAccountId;

    public ServiceFee(NodeWrapper node) {
        amount = node.findBigDecimal("amount");
        merchantAccountId = node.findString("merchant-account-id");
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getMerchantAccountId() {
        return merchantAccountId;
    }
}