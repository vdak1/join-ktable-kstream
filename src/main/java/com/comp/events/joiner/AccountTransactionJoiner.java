package com.comp.events.joiner;

import org.apache.kafka.streams.kstream.ValueJoiner;
import avro.Account;
import avro.Transaction;
import avro.EnrichedTransaction;

public class AccountTransactionJoiner implements ValueJoiner<Transaction, Account, EnrichedTransaction> {

    public EnrichedTransaction apply(Transaction transaction, Account account) {

        String transactionIBAN = transaction.getIBAN().toString();
        long transactionDate = transaction.getDate();
        String paymentType = transaction.getPaymentType().toString();
        String transactionDetails = transaction.getDetails().toString();
        double moneyOut = transaction.getMoneyOut();
        double moneyIn = transaction.getMoneyIn();
        double balance = transaction.getBalance();

        String accountName = account.getName().toString();
        String accountAddress = account.getAddress().toString();
        String accountSortCode = account.getSortCode().toString();
        String accountNo = account.getAccountNo().toString();
        String accountIBAN = account.getIBAN().toString();
        String accountBIC = account.getBIC().toString();
        String accountBranch = account.getBranch().toString();
        String accountType = account.getAccountType().toString();

        return EnrichedTransaction.newBuilder()
                        .setTransaction(EnrichedTransaction.newBuilder().getTransactionBuilder()
                                .setIBAN(transactionIBAN)
                                .setDate(transactionDate)
                                .setPaymentType(paymentType)
                                .setDetails(transactionDetails)
                                .setMoneyOut(moneyOut)
                                .setMoneyIn(moneyIn)
                                .setBalance(balance)
                                .build())
                        .setAccount(EnrichedTransaction.newBuilder().getAccountBuilder()
                                .setName(accountName)
                                .setAddress(accountAddress)
                                .setSortCode(accountSortCode)
                                .setAccountNo(accountNo)
                                .setIBAN(accountIBAN)
                                .setBIC(accountBIC)
                                .setBranch(accountBranch)
                                .setAccountType(accountType)
                                .build())
                        .build();
    }
}