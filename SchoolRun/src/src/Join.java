package src;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class Join extends JFrame {
	//��������
	private JFrame frame;
	private JTextField textID;
	private JButton checkIDbtn;
	private JTextField textPW;
	private JTextField textPW_2;
	private JButton joinbtn;
	private JLabel backImg;
	private JLabel message;
	User u1 = new User();
	int checkId = 0; //0�̸� �ߺ� Ȯ�� ����, 1�̸� ��� ����, 2�� �ߺ�
	//Music introMusic = new Music("..\\music\\LOGIN_BGM.MP3",true);//����s

	//���θ޼���
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Join window = new Join();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//������
	public Join() {
		initialize();
	}
	//GUI ����޼���
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 717, 765);
		frame.getContentPane().setLayout(null);
		//���̵� �Է�
		textID = new JTextField(); 
		textID.setFont(new Font("�����ý��丮", Font.BOLD, 32));
		textID.setBounds(138, 212, 352, 50);
		textID.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		frame.getContentPane().add(textID);
		textID.setColumns(10);
		//�ߺ�Ȯ�� ��ư
		checkIDbtn = new JButton(""); 
		checkIDbtn.setIcon(new ImageIcon("..\\image\\btn_image\\doublecheck_bt.png"));
		checkIDbtn.setBounds(527, 205, 106, 69);
		checkIDbtn.setBorderPainted(false);
		checkIDbtn.setContentAreaFilled(false);
		checkIDbtn.setFocusPainted(false);
		frame.getContentPane().add(checkIDbtn);

		
		//��й�ȣ �Է�
		textPW = new JTextField(); 
		textPW.setFont(new Font("�����ý��丮", Font.BOLD, 32));
		textPW.setBounds(169, 344, 352, 50);
		textPW.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		frame.getContentPane().add(textPW);
		textPW.setColumns(10);
		//��й�ȣ Ȯ��
		textPW_2 = new JTextField(); 
		textPW_2.setFont(new Font("�����ý��丮", Font.BOLD, 32));
		textPW_2.setBounds(169, 489, 352, 50);
		textPW_2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		frame.getContentPane().add(textPW_2);
		textPW_2.setColumns(10);
		//���� ��ư
		joinbtn = new JButton(""); 
		joinbtn.setIcon(new ImageIcon("..\\image\\btn_image\\signup_bt.png"));
		joinbtn.setBounds(251, 575, 223, 79);
		joinbtn.setBorderPainted(false);
		joinbtn.setContentAreaFilled(false);
		joinbtn.setFocusPainted(false);
		frame.getContentPane().add(joinbtn);
		
		//���̵�� 8�� �̳�
		message = new JLabel("���̵�� 8�� �̳����� �մϴ�.");
		message.setFont(new Font("\uBA54\uC774\uD50C\uC2A4\uD1A0\uB9AC", message.getFont().getStyle(), message.getFont().getSize()));
		message.setBounds(206, 174, 284, 20);
		frame.getContentPane().add(message);
		//�ʵ�� �޹�� ��
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("..\\image\\back_image\\PW_field.png"));
		lblNewLabel.setBounds(112, 294, 521, 109);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel2 = new JLabel("");
		lblNewLabel2.setIcon(new ImageIcon("..\\image\\back_image\\PWokay_field.png"));
		lblNewLabel2.setBounds(112, 439, 521, 109);
		frame.getContentPane().add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("");
		lblNewLabel3.setIcon(new ImageIcon("..\\image\\back_image\\ID_field.png"));
		lblNewLabel3.setBounds(112, 162, 521, 109);
		frame.getContentPane().add(lblNewLabel3);
		
		//��� �̹���
		backImg = new JLabel(""); 
		backImg.setIcon(new ImageIcon("..\\image\\back_image\\newaccount_bg.png"));
		backImg.setBounds(0, 0, 701, 734);
		frame.getContentPane().add(backImg);
		
		//introMusic.start();
		
		
			
//===============================================================================

		
		//�ߺ�Ȯ�ι�ư ��� ����
		checkIDbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newId = textID.getText();
				boolean check = u1.checkID(newId);
				
				if(check==false && newId.length() <= 8 && newId.length() > 0) {
					System.out.println("��밡��");
					message.setText("����Ͻ� �� �ֽ��ϴ�.");
					checkId = 1;
				} else if(newId.length() > 8) {
					System.out.println("8�� �ʰ�");
					message.setText("���ڼ��� �ʰ��Ǿ����ϴ�.");
					checkId = 2;
				} else if(newId.length() == 0) {
					System.out.println("�Է¿��");
					message.setText("���̵� �Է����ּ���.");
					checkId = 2;
				} else if(check==true) {
					System.out.println("�ߺ�");
					message.setText("�ߺ��� ���̵��Դϴ�.");
					checkId = 2;
				}
			}
		});

		
		//ȸ�� ���Թ�ư ��� ����
		joinbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newId = textID.getText();
				String newPw = textPW.getText();
				String newPw_2 = textPW_2.getText();
				///introMusic.close();
				if(checkId==1&&newPw.equals(newPw_2)) {
					u1.join(newId, newPw);
					frame.setVisible(false);
				}
				else if(checkId==2) {
					System.out.println("���Ұ�");
					message.setText("���̵� �ٽ� Ȯ�����ּ���");
					message.setForeground(Color.red);
				}
				else if(checkId==0) {
					message.setText("���̵� �ߺ�Ȯ���� ���ּ���");
					message.setForeground(Color.red);
					System.out.println("�ߺ�Ȯ��plz");
				}
				else {
					message.setText("��й�ȣ�� ��ġ�����ʽ��ϴ�");
					message.setForeground(Color.red);
					System.out.println("��ġ X");
				}
			}
		});
	}
}