package IUT.BoBot.SmartCells;

public class AuRevoirCell {
	
	public String ask(String question) {
		if (question.contains("au revoir"))
			return "au revoir";
		else
			return null;
				
	}
}
