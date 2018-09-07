package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        //Arrange
        Account account = new Account(100);

        //Action
        int newBalance = account.deposit(50);

        //Assert
        assertThat(newBalance, is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        //Arrange
        Account account = new Account(100);

        //Action
        int newBalance = account.withdraw(50);

        //Assert
        assertThat(newBalance, is(50));

    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        //Arrange
        Account account = new Account(50);

        //Action
        int newBalance = account.withdraw(100);

        //Assert
        assertThat(newBalance, is(50));
    }
}
