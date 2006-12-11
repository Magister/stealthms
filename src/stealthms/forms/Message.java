package stealthms.forms;

import javax.microedition.lcdui.*;
import stealthms.StealthMS;

public class Message extends TextBox implements CommandListener {
	private StealthMS midlet;
	
	private Command exitCommand;

	private Command sendCommand;

	private Command optsCommand;

	private Command abotCommand;

	private Command histCommand;

	public Message(StealthMS midlet) {
		super("���������", "", 700, TextField.INITIAL_CAPS_SENTENCE); // INITIAL_CAPS_SENTENCE
		this.midlet = midlet;
		exitCommand = new Command("�����", Command.BACK, 3);
		optsCommand = new Command("���������", Command.OK, 1);
		abotCommand = new Command("� ���������", Command.OK, 2);
		histCommand = new Command("������������", Command.OK, 1);
		sendCommand = new Command("��������", Command.OK, 0);
		addCommand(exitCommand);
		addCommand(optsCommand);
		addCommand(abotCommand);
		addCommand(histCommand);
		addCommand(sendCommand);
		setCommandListener(this);
	}

	public void commandAction(Command comm, Displayable disp) {
		if (comm == exitCommand) {
			midlet.exitRequested();
		}
		if (comm == abotCommand) {
			midlet.displayAbout();
		}
		if (comm == optsCommand) {
			midlet.displayOptions();
		}
		if (comm == histCommand) {
			midlet.displayHistoryList(true);
		}
		if (comm == sendCommand) {
			if (midlet.getPhone().compareTo("") != 0) {
				midlet.displayPhone();
			} else {
				midlet.displayRecent();
			}
		}
	}

}
