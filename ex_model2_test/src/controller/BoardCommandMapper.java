package controller;

import command.BoardCommand;
import command.DeleteBoardCommand;
import command.InsertBoardCommand;
import command.InsertBoardPageCommand;
import command.InsertReplyCommand;
import command.SelectListBoardCommand;
import command.SelectOneBoardCommand;
import command.ToBoardCommand;

public class BoardCommandMapper {

	

	private static BoardCommandMapper instance = new BoardCommandMapper();
	private BoardCommandMapper() {}
	public static BoardCommandMapper getInstance() {
		if (instance == null) {
			instance = new BoardCommandMapper();
		}
		return instance;
	}
	public BoardCommand getCommand(String cmd) {
		BoardCommand command = null;
		switch (cmd) {
		case "insertBoardPage.b":
			command =new InsertBoardPageCommand();
			break;
		case "insertBoard.b":
			command = new InsertBoardCommand();
			break;
		
		case "selectListBoardCommand.b":
			command = new SelectListBoardCommand();
			break;
		case "selectOneBoard.b":
			command = new SelectOneBoardCommand();
			break;
		case "deleteBoard.b":
			command = new DeleteBoardCommand();
			break;
		case "insertReply.b":
			command = new InsertReplyCommand();
			break;
		case "board.b":
			command = new ToBoardCommand();
		}
		return command;
	}
}
