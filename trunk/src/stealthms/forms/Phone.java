package stealthms.forms;



import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.TextField;

import stealthms.StealthMS;




public class Phone extends TextBox implements CommandListener {
	private StealthMS midlet;
	
	private Command sendCommand;

	private Command backCommand;
	
	private Command reguCommand;
	
	private Command receCommand;
	
	public Phone(StealthMS midlet) {
		super("����������", "", 15, TextField.PHONENUMBER);
		this.midlet = midlet;
		sendCommand = new Command("��������", Command.OK, 0);
		reguCommand = new Command("�������", Command.OK, 1);
		receCommand = new Command("���������", Command.OK, 1);
		backCommand = new Command("�����", Command.BACK, 1);
		addCommand(sendCommand);
		addCommand(backCommand);
		addCommand(receCommand);
		addCommand(reguCommand);
		setCommandListener(this);
	}

	public void commandAction(Command comm, Displayable disp) {
		if (comm == backCommand) {
			midlet.displayMessage();
		}
		if (comm == sendCommand) {
			midlet.displaySending(false);
		}
		if (comm == reguCommand) {
			midlet.displaySending(true);
		}
		if (comm == receCommand) {
			midlet.displayRecent();
		}
	}
	
}
