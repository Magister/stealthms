package stealthms.forms;

import javax.microedition.lcdui.*;
import stealthms.StealthMS;

public class About extends Form implements CommandListener {

	private StealthMS midlet;
	
	private Command backCommand;
	
	public About(StealthMS midlet) {
		super("� ���������");
		this.midlet = midlet;
		
		append("StealthMS 1.57\n"
				+ "������ 20.09.2006\n"
				+ "\n"
				+ "��������� ������������� ��� �������� SMS ����� e-mail2sms ����� ����������. ��������������� ��� ���� � �������� �� ��� ���������� ������, ����� Life, � �������� ��� e-mail2sms ����� (��� KS ������ e-mail2sms ���� ������������ � ����������, ������ sms �� ����� 7021). ���������� ��� ����� ������������ SMTP ������, �� ������ ����� ����� �������� ������������ (smtp.umc.ua, smtp.jeans.com.ua, relay.kyivstar.net). � ���� �����/������ ����� ���-�� ������ ������ ���� ��� SMTP ������� ��������������. � ���� ����� ����� ������� ����� ����� ��� ����� �������� e-mail (��� ������� ������ ������������ �����). ������ ����� ��-������, �������� ���������. ������� ��������� ����������� �� �����. � ���� ����� � ���������� ����� ������ ���� ����� ��������, ����� ����� ��������� ������������� � �������� (�������� ������ � �������� ������ ���������). �� ������ �� ���� ����� ����� ������� ������� SMS. �������� - ��������� ������������������.");
		backCommand = new Command("�����", Command.BACK, 1);
		addCommand(backCommand);
		setCommandListener(this);
	}

	public void commandAction(Command comm, Displayable disp) {
		if (comm == backCommand) {
			midlet.displayMessage();
		}
	}

}