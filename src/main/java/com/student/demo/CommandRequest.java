package com.student.demo;

import java.util.List;

public class CommandRequest {
	private int startX;
	private int startY;
	private String startDirection;
	private List<String> commands;

	public int getStartX() {
		return startX;
	}

	public void setStartX(int startX) {
		this.startX = startX;
	}

	public int getStartY() {
		return startY;
	}

	public void setStartY(int startY) {
		this.startY = startY;
	}

	public String getStartDirection() {
		return startDirection;
	}

	public void setStartDirection(String startDirection) {
		this.startDirection = startDirection;
	}

	public List<String> getCommands() {
		return commands;
	}

	public void setCommands(List<String> commands) {
		this.commands = commands;
	}

}
