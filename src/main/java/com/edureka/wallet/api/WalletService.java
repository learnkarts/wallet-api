package com.edureka.wallet.api;

import org.springframework.stereotype.Service;

import com.edureka.wallet.model.WalletDto;

@Service
public interface WalletService {

	WalletDto doTransaction(PaymentTransactionDto transaction);

	WalletDto getBalance(String emailId);

}
