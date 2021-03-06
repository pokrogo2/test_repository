package controller;

import command.JoinCommand;
import command.LoginPageCommand;
import command.MemberCommand;

public class MemberCommandMapper {
	private static MemberCommandMapper instance = new MemberCommandMapper();
	
	public MemberCommandMapper() {
		// TODO Auto-generated constructor stub
	}
	public static MemberCommandMapper getInstance() {
		if(instance ==null) {
			instance = new MemberCommandMapper();
		}
		return instance;
	}
	public MemberCommand getCommand(String cmd) {
		MemberCommand command = null;
		switch(cmd) {
		
		case "loginPage.m":
			command = new LoginPageCommand();
			break;
		case "join.m":
			command = new JoinCommand();
			break;
		}
		return command;
	}
}
