package Network.Chat;

public class MultiClientThread extends Thread{
	
    private MultiClient mc;		// ���� ���� Ŭ���̾�Ʈ Ŭ������ mc�� ����
    
    // ������
    public MultiClientThread(MultiClient mc){
    	
        this.mc = mc;
    }
    
    
    public void run(){	// �������� �޼ҵ� ���. �������̵�
        String message = null;
        String[] receivedMsg = null;
        boolean isStop = false;
        
        while(!isStop){
            try{
                message = (String)mc.getOis().readObject();
                receivedMsg = message.split("#");	// #�� �и�> �迭�� ���� ��..!
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
                    receivedMsg[0] +"���� ���� �ϼ̽��ϴ�."+
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