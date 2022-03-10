package com.db.awmd.challenge.service.account.events;

import com.db.awmd.challenge.domain.Account;
import com.db.awmd.challenge.event.GenericEvent;
import lombok.Data;

import java.math.BigDecimal;


@SuppressWarnings("serial")
public class AccountBalanceTransferredEvent extends GenericEvent<AccountBalanceTransferredEvent.Payload> {

	@Data
	public static class Payload {
		public Payload(Account sender2, Account receiver2, BigDecimal amount2) {
			// TODO Auto-generated constructor stub
		}
		private final Account sender = null;
		private final Account receiver = null;
		private final BigDecimal amount = null;

		public Account getSender() {
			return sender;
		}
		public Account getReceiver() {
			return receiver;
		}
		public BigDecimal getAmount() {
			return amount;
		}

	}

	public AccountBalanceTransferredEvent(Account sender, Account receiver, BigDecimal amount) {
		super(new Payload(sender, receiver, amount));
	}


}
