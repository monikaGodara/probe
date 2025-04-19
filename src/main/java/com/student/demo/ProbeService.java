package com.student.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProbeService {
	private final List<String>visited =new ArrayList<>();
	
	
	public Probe executeCommands(Probe probe,List<String>commands) {
		for(String command:commands) {
			switch(command) {
			case "MOVE_FORWARD"->move(probe,1);
			case "MOVE_BACKWARD"->move(probe,-1);
			case "TURN_LEFT"->turnLeft(probe);
			case "TURN_RIGHT"->turnRight(probe);
			}
			
			visited.add(probe.getX()+", "+probe.getY());
			
		}
		return probe;
	}
	
	public void move(Probe probe,int steps) {
		
			switch(probe.getDirection()) {
			case "N"->probe.setY(probe.getY()+steps);
			case "S"->probe.setY(probe.getY()-steps);
			case "E"->probe.setX(probe.getX()+steps);
			case "W"->probe.setX(probe.getX()-steps);
			
			
		}
		
	}
	
	public void turnLeft(Probe probe) {
		probe.setDirection(switch(probe.getDirection()) {
		case "N"->"W";
		case "S"->"E";
		case "E"->"N";
		case "W"->"S";
		default->probe.getDirection();
		});
		
	}
	
	public void turnRight(Probe probe) {
		probe.setDirection(switch(probe.getDirection()) {
		case "N"->"E";
		case "S"->"W";
		case "E"->"S";
		case "W"->"N";
		default->probe.getDirection();
		});
		
	}
	
	public List<String> getVisited(){
		return visited;
	}

}
