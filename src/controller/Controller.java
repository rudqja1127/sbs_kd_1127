package sbs.kb.ssg.controller;

public abstract class Controller {
	public abstract void doAction(String command, String actionMethodName);
	
	public void makeTestData();
	
}