package Network.Chat;

public class MultiClientThread extends Thread{
	
    private MultiClient mc;		// 다중 접속 클라이언트 클래스를 mc로 선언
    
    // 생성자
    public MultiClientThread(MultiClient mc){
    	
        this.mc = mc;
    }
    
    
    public void run(){	// 스레드의 메소드 사용. 오버라이딩
        String message = null;
        String[] receivedMsg = null;
        boolean isStop = false;
        
        while(!isStop){
            try{
                message = (String)mc.getOis().readObject();
                receivedMsg = message.split("#");	// #로 분리> 배열로 저장 됨..!
            }catch(Exception e){
                e.printStackTrace();
                isStop = true;
            }
            
            System.out.println(receivedMsg[0]+","+receivedMsg[1]);
            if(receivedMsg[1].equals("exit")){
                if(receivedMsg[0].equals(mc.getId())){
                    mc.exit();
                }else{
                    mc.getJta().append(
                    receivedMsg[0] +"님이 종료 하셨습니다."+
                    System.getProperty("line.separator"));
                    mc.getJta().setCaretPosition(
                    mc.getJta().getDocument().getLength());
                }
            }else{               
                mc.getJta().append(
                receivedMsg[0] +" : "+receivedMsg[1]+
                System.getProperty("line.separator"));
                mc.getJta().setCaretPosition(
                    mc.getJta().getDocument().getLength());
                
            }
        }
    }
}