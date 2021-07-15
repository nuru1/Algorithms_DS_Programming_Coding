package programs;

import org.json.JSONObject;

public class JsonParse {
	public static void main(String[] args) {
		
		String s = "{ \"policyNumber\": 0, \"customerName\": \"Alex Johnes\", \"policyStatus\": \"InForce\", \"policyInceptionDate\": \"2021-05-03\", \"policyExpiryDate\": \"2022-05-03\", \"quoteNumber\": \"Line18Q2021\", \"premiumAmount\": 0, \"premiumDueDate\": null, \"premiumFrequency\": null, \"policyTerm\": 12, \"totalPremiumPaid\": 0, \"sumAssured\": 0, \"endorsementHistory\": null, \"customer\": { \"customerId\": 0, \"firstName\": \"Alex\", \"lastName\": \"Johnes\", \"saluation\": null, \"nationality\": null, \"gender\": null, \"dob\": null, \"primaryPhoneNumber\": 0, \"email\": \"alexB@gmail.com\" }, \"branch\": null }";
		String UpdatedEmail = "abc@gmail.com";
		
		JSONObject jsonObject = new JSONObject(s);
		jsonObject.getJSONObject("customer").put("email", UpdatedEmail);
		System.out.println(jsonObject.toString());
	}
}
