/**
 * Program description.
 * @author Volodymyr Turchanskyi
 */
public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String Surname = "Specimen";
		String givenName = "Test V";
		String usCIS1, usCIS2, usCIS3;
		usCIS1 = "000";
		usCIS2 = "000";
		usCIS3 = "725";
		String category = "C09";
		String cardNum = "SRC0000000725";

		String country = "Ethiopia";
		String termsAndConditions = "None";
		String dateOfBirthDay = "01";
		String dateOfBirthMonth = "Jan";
		int dateOfBirthYear = 1920;
		char sex = 'M';
		int validFrom1, validFrom2, validFrom3;
		validFrom1 = 01;
		validFrom2 = 01;
		validFrom3 = 80;
		int cardExpires1, cardExpires2, cardExpires3;
		cardExpires1 = 05;
		cardExpires2 = 10;
		cardExpires3 = 11;

		//INPUT SECTION
		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       " + Surname);
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )    " + givenName);
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          "+usCIS1+"-"+usCIS2+"-"+usCIS3+"    "+category+"        "+cardNum);
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      "+country);
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /       "+termsAndConditions);
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         "+dateOfBirthDay+" "+dateOfBirthMonth+" "+dateOfBirthYear+"     "+sex);
		System.out.println("║                       Valid From:     "+validFrom1+"/"+validFrom2+"/"+validFrom3);
		System.out.println("║                       Card Expires:   "+cardExpires1+"/"+cardExpires2+"/"+cardExpires3);
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}