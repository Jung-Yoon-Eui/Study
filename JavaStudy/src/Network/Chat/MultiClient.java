package Network.Chat;

import java.awt.*; 
import java.awt.event.*; 
import java.io.*; 
import java.net.*;
import java.util.Scanner;

import javax.swing.*; 

public class MultiClient implements ActionListener {	// 이벤트 리스너를 상속받는 액션 리스너를 인터페이스로 받는다.
	
	//네트워킹
	private Socket socket; 			// Socket 클래스를 socket 변수로 선언
	private ObjectInputStream ois; 	// ObjectInputStream 클래스를 ois 변수로 선언 받음
	private ObjectOutputStream oos;	// ObjectOutputStream 클래스를 oos 변수로 선언 보냄
	
	private String ip; 				// 받아올 ip 변수 선언
	private String id;				// 받아올 id 변수 선언
	
	//gui(swing)
	private JFrame jframe; 			
	private JTextField jtf; 
	private JTextArea jta; 
	private JLabel jlb1, jlb2; 
	private JPanel jp1, jp2; 
	private JButton jbtn; 
	
	//생성자
	public MultiClient(String argIp, String argId) { 
		ip = argIp; // ip를 입력 받는다.
		id = argId; // id를 입력 받는다.
		
		jframe = new JFrame("Multi Chatting"); 
		jtf = new JTextField(30);
		jta = new JTextArea("", 10, 50); 
		
		jlb1 = new JLabel("Usage ID : [[ " + id + "]]"); 
		jlb2 = new JLabel("IP : " + ip); 
		
		jbtn = new JButton("종료"); 
		
		jp1 = new JPanel(); 
		jp2 = new JPanel(); 
		
		//라벨 색상
		jlb1.setBackground(Color.yellow);
		jlb2.setBackground(Color.green); 
		
		//채팅창 색상
		jta.setBackground(Color.pink); 
		
		//판넬의 레이아웃을 보더레이아웃으로 받아온다.
		jp1.setLayout(new BorderLayout()); 
		jp2.setLayout(new BorderLayout()); 

		//판넬에 버튼, 라벨, 텍스트필드의 위치를 보더레이아웃으로 설정하고 붙인다.
		jp1.add(jbtn, BorderLayout.EAST); 
		jp1.add(jtf, BorderLayout.CENTER); 
		jp2.add(jlb1, BorderLayout.CENTER); 
		jp2.add(jlb2, BorderLayout.EAST); 

		//프레임에 판넬의 위치를 보더레이아웃으로 설정하고 붙인다.
		jframe.add(jp1, BorderLayout.SOUTH); 
		jframe.add(jp2, BorderLayout.NORTH); 
		
		//스크롤의 객체를 만들고 설정한다. (설정 값 검색해보기)
		JScrollPane jsp = new JScrollPane(jta, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); 
		//프레임에 스크롤을 붙인다.
		jframe.add(jsp, BorderLayout.CENTER); 

		//액션 리스너
		jtf.addActionListener(this); 
		jbtn.addActionListener(this);
		//윈도우즈 리스너
		jframe.addWindowListener(new WindowAdapter() { //알아보기
										public void windowClosing(WindowEvent e) { 
											try { 
												oos.writeObject(id+"#exit"); 
											} catch (IOException ee) { 
												ee.printStackTrace(); 	//알아보기
											} 
											System.exit(0);
											} 
											public void windowOpened(WindowEvent e) { 
												jtf.requestFocus(); 
											} 
										}); 
		
		//테이블 에리어를 편집 불가하게한다.
		jta.setEditable(false);
		
		Toolkit tk = Toolkit.getDefaultToolkit();	// 구현된 Toolkit 객체를 만듬
		Dimension d = tk.getScreenSize(); 			// 모니터 화면의 크기
		
		int screenHeight = d.height; 
		int screenWidth = d.width; 

		jframe.pack(); 
		//창을 화면 가운데에 띄운다.(모니터 화면 크기 - 프레임 크기)/2
		jframe.setLocation((screenWidth - jframe.getWidth()) / 2, 
				(screenHeight - jframe.getHeight()) / 2); 
		
		jframe.setResizable(false);	// 창크기 조절 가능? false!
		jframe.setVisible(true); 	// 창을 화면에 띄울 거니? true!
	
	}	//생성자 끝
	
	
	public void actionPerformed(ActionEvent e) { // 이벤트가 발생했을 때 실행

		Object obj = e.getSource(); 	// 이벤트를 발생시킨 컴포넌트의 참조주소를 가져옴
		String msg = jtf.getText(); 	// 텍스트 필드에서 입력받은 텍스트
		
		if (obj == jtf) {	// 이벤트를 발생시킨 곳이 텍스트 필드일 때
			if (msg == null || msg.length()==0) { 
				JOptionPane.showMessageDialog(jframe, 	//메시지의 길이가 0이거나 존재하지 않을 때 팝업창을 띄움
						"글을쓰세요", "경고", 
						JOptionPane.WARNING_MESSAGE); 
			} else {	// 아니면
				try { 
					oos.writeObject(id+"#"+msg);	// id#"메시지 내용" 출력 
				} catch (IOException ee) {			// iO 에러나 나면 (입출력 처리 실패)
					ee.printStackTrace(); 			// 에러 발생의 근원지를 찾아 단계별로 에러를 출력한다
				} 
				jtf.setText(""); 
			} 
		} else if (obj == jbtn) {	// 이벤트를 발생시킨 곳이 종료 버튼일 때 
			try { 
				oos.writeObject(id+"#exit");	// id#exit 출력
			} catch (IOException ee) {			// 입출력 처리 실패하면
				ee.printStackTrace(); 			// 근원지를 찾아 단계별로 에러 출력
			} 
			System.exit(0);		// 프로그램 종료
		}
	}//actionPerformed 종료
	
	
	public void exit(){ 
		System.exit(0);	// 프로그램 종료
	}
	
	
	public void init() throws IOException {	// 입출력 처리 실패에 대한 예외 처리 미리 선언
		socket = new Socket(ip, 5000);	// 소켓 생성
		System.out.println("connected..."); 
		oos = new ObjectOutputStream(socket.getOutputStream());	// 소켓에서 바이트 단위로 데이터를 보낸다.
		ois = new ObjectInputStream(socket.getInputStream());	// 소켓에서 바이트 단위로 데이터를 읽는다.
		
		MultiClientThread ct = new MultiClientThread(this);	// 다중 접속
		Thread t = new Thread(ct);	// 스레드
		t.start();	// 스레드 시작
	} 

	
	public static void main(String args[]) throws IOException {	// 메인 메소드
		JFrame.setDefaultLookAndFeelDecorated(true);	// 창 모양을 자바 모양으로???
		Scanner sc = new Scanner(System.in);
		System.out.print("ip : ");
		String ip = sc.next();
		System.out.print("id : ");
		String id = sc.next();
		
		MultiClient cc = new MultiClient(ip, id);	// 다중 접속 아이피,아이디 입력
		cc.init();	// 소켓 생성한거 불러오기
		sc.close();	// 스캐너 입력 종료
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
