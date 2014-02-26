package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;
import org.junit.Test;

public class AuRevoirCellTest {

	AuRevoirCell cell = new AuRevoirCell();
	
	@Test
	public void TestAuRevoir() {
		assertEquals("au revoir", cell.ask("au revoir"));
	}
	
	@Test
	public void TestnotAuRevoir() {
		assertEquals(null, cell.ask("Yo"));
	}
	
}
