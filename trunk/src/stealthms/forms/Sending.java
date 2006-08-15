package stealthms.forms;



import javax.microedition.lcdui.*;

import stealthms.StealthMS;




public class Sending extends Form implements CommandListener {

	private StealthMS midlet;

	private Gauge sendingGauge;

	private Command cancCommand;

	private Command backCommand;

	private Command exitCommand;

	private Command reptCommand;
	
	private Command reguCommand;

	public Sending(StealthMS midlet) {
		super("��������");
		this.midlet = midlet;
		sendingGauge = new Gauge("��������...", false, 10, 0);
		append(sendingGauge);

		cancCommand = new Command("������", Command.CANCEL, 1);
		backCommand = new Command("�����", Command.BACK, 1);
		exitCommand = new Command("�����", Command.EXIT, 0);
		reptCommand = new Command("������", Command.OK, 0);
		reguCommand = new Command("�������", Command.OK, 1);
		setCommandListener(this);
	}

	public void setGaugeValue(int value) {
		sendingGauge.setValue(value);
	}

	public void setGaugeLabel(String label) {
		sendingGauge.setLabel(label);
	}

	private void removeSendCommands() {
		removeCommand(cancCommand);
		removeCommand(exitCommand);
		removeCommand(reptCommand);
		removeCommand(reguCommand);
		removeCommand(backCommand);
	}

	public void setSendingState() {
		removeSendCommands();
		addCommand(cancCommand);
	}
	
	public void setErrorState() {
		removeSendCommands();
		addCommand(backCommand);
		addCommand(reptCommand);
		addCommand(reguCommand);
	}

	public void setSuccessState() {
		removeSendCommands();
		addCommand(backCommand);
		addCommand(exitCommand);
	}
	
	public void commandAction(Command comm, Displayable disp) {
		if (comm == reptCommand) {
			midlet.displaySending(false);
		}
		if (comm == exitCommand) {
			midlet.exitRequested();
		}
		if (comm == cancCommand) {
			midlet.setErrorState(true);
			midlet.displayPhone();
		}
		if (comm == backCommand) {
			midlet.displayPhone();
		}
		if (comm == reguCommand) {
			midlet.displaySending(true);
		}
	}

}
