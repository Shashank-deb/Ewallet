package com.shashank.ewallet.wallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WalletApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletApplication.class, args);
	}


	//	@Autowired
//	WalletService walletService;

//	@Override
//	public void run(String... args) throws Exception {
//		WalletTransactionRequest walletTransactionRequest= new WalletTransactionRequest();
//		walletTransactionRequest.setAmount(10.0);
//		walletTransactionRequest.setReceiverId(103L);
//		walletTransactionRequest.setSenderId(102L);
//		walletService.performTransaction(walletTransactionRequest);
//	}

}
