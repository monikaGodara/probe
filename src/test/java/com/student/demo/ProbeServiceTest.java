package com.student.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ProbeServiceTest {

	ProbeService service =new ProbeService();
	
	@Test
	void testMOvementAndTurns() {
		Probe probe =new Probe(0,0,"N");
		List<String> commands=List.of("MOVE_FORWARD","TURN_RIGHT","MOVE_FORWARD");
		Probe result=service.executeCommands(probe, commands);
		assertEquals(1, result.getX());
		assertEquals(1, result.getY());
		assertEquals("E", result.getDirection());
	}
}
