
package com.account;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {

	Account account; //object of Account
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() {
		account = new Account(); //instantiated Account object
	}

	@AfterEach
	void tearDown() {
	}
	

	@Test
	void accountObjectIsNotNullTest() {
		assertNotNull(account);
	}
	
	@Test
	void accountObjectCanRecieveDepositTest() {
		account.depositMoney(2500);
		assertEquals(2500,account.getAccountBalance());
		
		account.depositMoney(5000);
		assertEquals(7500,account.getAccountBalance());
	}
	@Test
	void accountWillNotTakeNegativeAmountTest() {
		account.depositMoney(5000);
		account.depositMoney(-1500);
		int accountBalance =account.getAccountBalance();
		assertEquals(5000,accountBalance);
	}
	
	@Test
	void accountCanNotBeLessThanOneThousandNairaTest(){
		account.depositMoney(5500);
		assertEquals(5500,account.getAccountBalance());
		
		int accountBalance =account.minimumBalance();
		account.ammountToWithDraw(5000);
		assertEquals(1000,accountBalance);
		
	}
	
	@Test
	void accountWillNotAcceptWithdrawalAsDepositTest() {
		account.depositMoney(10000);
		assertEquals(10000,account.getAccountBalance());
		account.ammountToWithDraw(2000);
		int accountBalance =account.getAccountBalance();
		assertEquals(8000,accountBalance);
		
		account.ammountToWithDraw(7500);
		//account.minimumBalance();
		accountBalance =account.minimumBalance();
		assertEquals(1000,accountBalance);
		
		//accountBalance =account.getAccountBalance();
		//assertEquals(account.minimumBalance(1000),accountBalance);
			
	}
	
	@Test
	void accountToWithdrawCashTest() {
		
		account.depositMoney(9000);
		assertEquals(9000,account.getAccountBalance());
		account.ammountToWithDraw(6000);
		int accountBalance =account.getAccountBalance();
		assertEquals(6000,accountBalance);
		
	}
	
	

	

}
