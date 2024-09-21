package com.shashank.ewallet.wallet.service;

import com.shashank.ewallet.wallet.domain.Wallet;
import com.shashank.ewallet.wallet.service.resource.WalletResponse;
import com.shashank.ewallet.wallet.service.resource.WalletTransactionRequest;

public interface WalletService {

    public void createWallet(Long userId);

    public Wallet deleteWallet(Long userId);

    public WalletResponse getWallet(Long userId);

    public boolean performTransaction(WalletTransactionRequest walletTransactionRequest);
}
