package controller;

import command.BoardCommand;

public class BoardCommandMapper {

	private static BoardCommandMapper instance = new BoardCommandMapper();
	private BoardCommandMapper() {}
	public static BoardCommandMapper getInstance() {
		if(instance==null) {
			instance= new BoardCommandMapper();
		}
		return instance;
	}
	public BoardCommand getCommand(String cmd) {
		BoardCommand command =null;
		switch(cmd) {
		case "selectListBoardPage":
			
		}
		return command;
	}
}

