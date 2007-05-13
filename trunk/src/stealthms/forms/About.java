package stealthms.forms;

import javax.microedition.lcdui.*;
import stealthms.StealthMS;

public class About extends Form implements CommandListener {

	private StealthMS midlet;
	
	private Command backCommand;
	
	public About(StealthMS midlet) {
		super("� ���������");
		this.midlet = midlet;
		
		append("StealthMS 1.75\n"
				//#ifdef MIDP2JSR75
//# 				+ "������ MIDP2/JSR75\n"
				//#elifdef MIDP2
//# 				+ "������ MIDP2\n"
				//#elifdef MIDP1
//# 				+ "������ MIDP1\n"
				//#endif
				+ "������ 13.05.2007\n"
				+ "\n"
				+ "��������� ������������� ��� �������� SMS ����� GPRS. "
//#if RU
//#                                 + "���������� � ��������� ������� ���� ���������� ������ � ��������� "
//#                                 + "��� �������� �� ��� ����� ���� (������� O6OPoTEHb). "
//#else
                                + "���������� ��������� ��� ���������� UMC � �������� �� ��� "
                                + "���������� ������ (��� KS ������ e-mail2sms ���� ������������ "
                                + "� ����������, ������ sms �� ����� 7021). "
//#endif
                                + "���������� ��� ����� "
                                + "������������ SMTP ������, �� ������ ����� ����� �������� "
                                + "������������ (smtp.umc.ua, smtp.jeans.com.ua, relay.kyivstar.net). "
                                + "� ���� �����/������ ����� ���-�� ������ ������ ���� ��� SMTP ������� "
                                + "��������������. � ���� ����� ����� ������� ����� ����� ��� ����� "
                                + "�������� e-mail (��� ������� ������ ������������ �����). "
                                + "������ ����� ��-������, ���� ����������� ��������. ������� "
                                + "��������� ����������� �� �����. � ���� ����� � ���������� "
                                + "����� ������ ���� ����� ��������, ����� ����� ��������� "
                                + "������������� � �������� (�������� ������ � �������� ������ ���������). "
                                + "�� ������ �� ���� ����� ����� ������� ������� SMS.");
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
