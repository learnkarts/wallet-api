package com.edureka.wallet.Impl;

import org.springframework.stereotype.Service;

import com.edureka.wallet.api.WalletService;
import com.edureka.wallet.model.PaymentTransactionDto;
import com.edureka.wallet.model.WalletDto;

@Service
public class WalletServiceImpl implements WalletService {

	@Override
	public WalletDto doTransaction(PaymentTransactionDto transaction) {
		// Implemented
		return null;
	}

	@Override
	public WalletDto getBalance(String emailId) {
		// Implemented
		return null;
	}

}
