package com.saeyan.controller;

import com.saeyan.controller.action.Action;
import com.saeyan.controller.action.BoardListAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {
		super();
	}
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	// command에 따라서 action 객체생성
	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory : " + command);
		if(command.equals("board_list")) {
			action = new BoardListAction();
		}
		else if(command.equals("board_view")) {
			action = new BoardViewAction();
		}
		return action;
	}
}
