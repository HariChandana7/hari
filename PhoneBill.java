

import java.util.HashMap;
import java.util.Map;

public class PhoneBill {
	
	public static void main(String...  args) {
		String phoneLog = "00:01:07,444-234-090"+ "\n" +
				  "00:08:01,999-080-080" + "\n" +
				  "00:08:01,771-080-080" + "\n" +
				  "00:05:20,919-234-090";
		System.out.println("Total Phone Bill is : " + new PhoneBill().totalCost(phoneLog) +" Bugs");
		
	}
	
	public int totalCost(String log) {
		
		//split the phoneLog into its individual rows
		String[] logEntries = log.split("\\n");
		
		// create a hashmap to store the phoneNumber and the total phone call duration for it

		HashMap<String , Integer> phoneNumberDetails = new HashMap<String , Integer>();
		
		for (String record : logEntries) {
			String[] details = record.split(",");
			int durationOfHours = Integer.valueOf(details[0].substring(0, 2)) * 3600;//hrs to sec
			int durationOfMinutes = Integer.valueOf(details[0].substring(3, 5)) * 60;// mins to sec
			int durationOfSeconds = Integer.valueOf(details[0].substring(6, 8));
			int totalDuration = durationOfHours + durationOfMinutes + durationOfSeconds;//total  duration into secs
	
			// if we already have an entry for this phone number then add this total duration to the existing one else just add it
			if (phoneNumberDetails.containsKey(details[1]))
			{
				totalDuration += phoneNumberDetails.get(details[1]);
				phoneNumberDetails.put(details[1], totalDuration);
			}
			else {
				phoneNumberDetails.put(details[1], totalDuration);
			}
		}
		
		// Find the phone call with the maximum duration in event of a tie use the one with least numerical value  
		int maxDuration = 0;
		int maxPhoneNumberValue = 0;
		String maxPhoneNumber = "";
		
		for (Map.Entry<String, Integer> entry : phoneNumberDetails.entrySet()) {
			int duration = entry.getValue();
			
			if (duration > maxDuration) {
				maxPhoneNumber = entry.getKey();
				maxPhoneNumberValue = Integer.valueOf(entry.getKey().replaceAll("-", ""));
				maxDuration = duration;
			}
			else {
				
		                if (duration == maxDuration) {
			if (Integer.valueOf(entry.getKey().replaceAll("-", "")) < maxPhoneNumberValue) {
					maxPhoneNumber = entry.getKey();
				maxPhoneNumberValue = Integer.valueOf(entry.getKey().replaceAll("-", ""));
			System.out.println("PhoneNumber with  Longest  Time Duration is : " + maxPhoneNumber);		
				}
				}
				
			}
		}
		
		int totalCost = 0;
		
		for (Map.Entry<String, Integer> entry : phoneNumberDetails.entrySet())
		{
			if (entry.getKey().equals(maxPhoneNumber)) continue;
			
			if (entry.getValue() > 300)  // Time duration > 5 minutes cost is 150 bugs else 3 bugs
			{
				totalCost += ((entry.getValue()/60) * 150);
				if (entry.getValue() % 60 != 0) totalCost += 150;
			}
			else {
				totalCost += (entry.getValue() * 3);
			}
		}
		
		return totalCost;
	}

}

/* Output :
PhoneNumber with  Longest  Time Duration is : 771-080-080
Total Phone Bill is : 2451 Bugs
*/
