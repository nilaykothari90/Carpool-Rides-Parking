package com.edu.payment;

public class DebitcardStrategy implements PaymentStrategy {

	public void makePayment(float amount, String member) {
		float creditbackAmt = 150 - amount;
		if (member.equalsIgnoreCase("passenger")) {
			System.out.println(" fare $" + amount + " amount paid with debit card. " + creditbackAmt
					+ " has been credited back to your account." + "\n Thank you for your payment");
		} else if (member.equalsIgnoreCase("driver")) {
			System.out.println("Amount $" + amount + " is paid using debit card. \nThank you for your payment");
		}
	}
}
