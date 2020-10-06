package Network.Chat;

import java.awt.*; 
import java.awt.event.*; 
import java.io.*; 
import java.net.*;
import java.util.Scanner;

import javax.swing.*; 

public class MultiClient implements ActionListener {	// �̺�Ʈ �����ʸ� ��ӹ޴� �׼� �����ʸ� �������̽��� �޴´�.
	
	//��Ʈ��ŷ
	private Socket socket; 			// Socket Ŭ������ socket ������ ����
	private ObjectInputStream ois; 	// ObjectInputStream Ŭ������ ois ������ ���� ����
	private ObjectOutputStream oos;	// ObjectOutputStream Ŭ������ oos ������ ���� ����
	
	private String ip; 				// �޾ƿ� ip ���� ����
	private String id;				// �޾ƿ� id ���� ����
	
	//gui(swing)
	private JFrame jframe; 			
	private JTextField jtf; 
	private JTextArea jta; 
	private JLabel jlb1, jlb2; 
	private JPanel jp1, jp2; 
	private JButton jbtn; 
	
	//������
	public MultiClient(String argIp, String argId) { 
		ip = argIp; // ip�� �Է� �޴´�.
		id = argId; // id�� �Է� �޴´�.
		
		jframe = new JFrame("Multi Chatting"); 
		jtf = new JTextField(30);
		jta = new JTextArea("", 10, 50); 
		
		jlb1 = new JLabel("Usage ID : [[ " + id + "]]"); 
		jlb2 = new JLabel("IP : " + ip); 
		
		jbtn = new JButton("����"); 
		
		jp1 = new JPanel(); 
		jp2 = new JPanel(); 
		
		//�� ����
		jlb1.setBackground(Color.yellow);
		jlb2.setBackground(Color.green); 
		
		//ä��â ����
		jta.setBackground(Color.pink); 
		
		//�ǳ��� ���̾ƿ��� �������̾ƿ����� �޾ƿ´�.
		jp1.setLayout(new BorderLayout()); 
		jp2.setLayout(new BorderLayout()); 

		//�ǳڿ� ��ư, ��, �ؽ�Ʈ�ʵ��� ��ġ�� �������̾ƿ����� �����ϰ� ���δ�.
		jp1.add(jbtn, BorderLayout.EAST); 
		jp1.add(jtf, BorderLayout.CENTER); 
		jp2.add(jlb1, BorderLayout.CENTER); 
		jp2.add(jlb2, BorderLayout.EAST); 

		//�����ӿ� �ǳ��� ��ġ�� �������̾ƿ����� �����ϰ� ���δ�.
		jframe.add(jp1, BorderLayout.SOUTH); 
		jframe.add(jp2, BorderLayout.NORTH); 
		
		//��ũ���� ��ü�� ����� �����Ѵ�. (���� �� �˻��غ���)
		JScrollPane jsp = new JScrollPane(jta, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); 
		//�����ӿ� ��ũ���� ���δ�.
		jframe.add(jsp, BorderLayout.CENTER); 

		//�׼� ������
		jtf.addActionListener(this); 
		jbtn.addActionListener(this);
		//�������� ������
		jframe.addWindowListener(new WindowAdapter() { //�˾ƺ���
										public void windowClosing(WindowEvent e) { 
											try { 
												oos.writeObject(id+"#exit"); 
											} catch (IOException ee) { 
												ee.printStackTrace(); 	//�˾ƺ���
											} 
											System.exit(0);
											} 
											public void windowOpened(WindowEvent e) { 
												jtf.requestFocus(); 
											} 
										}); 
		
		//���̺� ����� ���� �Ұ��ϰ��Ѵ�.
		jta.setEditable(false);
		
		Toolkit tk = Toolkit.getDefaultToolkit();	// ������ Toolkit ��ü�� ����
		Dimension d = tk.getScreenSize(); 			// ����� ȭ���� ũ��
		
		int screenHeight = d.height; 
		int screenWidth = d.width; 

		jframe.pack(); 
		//â�� ȭ�� ����� ����.(����� ȭ�� ũ�� - ������ ũ��)/2
		jframe.setLocation((screenWidth - jframe.getWidth()) / 2, 
				(screenHeight - jframe.getHeight()) / 2); 
		
		jframe.setResizable(false);	// âũ�� ���� ����? false!
		jframe.setVisible(true); 	// â�� ȭ�鿡 ��� �Ŵ�? true!
	
	}	//������ ��
	
	
	public void actionPerformed(ActionEvent e) { // �̺�Ʈ�� �߻����� �� ����

		Object obj = e.getSource(); 	// �̺�Ʈ�� �߻���Ų ������Ʈ�� �����ּҸ� ������
		String msg = jtf.getText(); 	// �ؽ�Ʈ �ʵ忡�� �Է¹��� �ؽ�Ʈ
		
		if (obj == jtf) {	// �̺�Ʈ�� �߻���Ų ���� �ؽ�Ʈ �ʵ��� ��
			if (msg == null || msg.length()==0) { 
				JOptionPane.showMessageDialog(jframe, 	//�޽����� ���̰� 0�̰ų� �������� ���� �� �˾�â�� ���
						"����������", "���", 
						JOptionPane.WARNING_MESSAGE); 
			} else {	// �ƴϸ�
				try { 
					oos.writeObject(id+"#"+msg);	// id#"�޽��� ����" ��� 
				} catch (IOException ee) {			// iO ������ ���� (����� ó�� ����)
					ee.printStackTrace(); 			// ���� �߻��� �ٿ����� ã�� �ܰ躰�� ������ ����Ѵ�
				} 
				jtf.setText(""); 
			} 
		} else if (obj == jbtn) {	// �̺�Ʈ�� �߻���Ų ���� ���� ��ư�� �� 
			try { 
				oos.writeObject(id+"#exit");	// id#exit ���
			} catch (IOException ee) {			// ����� ó�� �����ϸ�
				ee.printStackTrace(); 			// �ٿ����� ã�� �ܰ躰�� ���� ���
			} 
			System.exit(0);		// ���α׷� ����
		}
	}//actionPerformed ����
	
	
	public void exit(){ 
		System.exit(0);	// ���α׷� ����
	}
	
	
	public void init() throws IOException {	// ����� ó�� ���п� ���� ���� ó�� �̸� ����
		socket = new Socket(ip, 5000);	// ���� ����
		System.out.println("connected..."); 
		oos = new ObjectOutputStream(socket.getOutputStream());	// ���Ͽ��� ����Ʈ ������ �����͸� ������.
		ois = new ObjectInputStream(socket.getInputStream());	// ���Ͽ��� ����Ʈ ������ �����͸� �д´�.
		
		MultiClientThread ct = new MultiClientThread(this);	// ���� ����
		Thread t = new Thread(ct);	// ������
		t.start();	// ������ ����
	} 

	
	public static void main(String args[]) throws IOException {	// ���� �޼ҵ�
		JFrame.setDefaultLookAndFeelDecorated(true);	// â ����� �ڹ� �������???
		Scanner sc = new Scanner(System.in);
		System.out.print("ip : ");
		String ip = sc.next();
		System.out.print("id : ");
		String id = sc.next();
		
		MultiClient cc = new MultiClient(ip, id);	// ���� ���� ������,���̵� �Է�
		cc.init();	// ���� �����Ѱ� �ҷ�����
		sc.close();	// ��ĳ�� �Է� ����
	} 
	public ObjectInputStream getOis(){ 
		return ois; 
	} 
	public JTextArea getJta(){ 
		return jta; 
	} 
	public String getId(){ 
		return id; 
	} 
}
