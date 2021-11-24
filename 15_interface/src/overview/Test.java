package overview;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTV stv = new SmartTV();
		SmartRefrig srf = new SmartRefrig();
		
		stv.setVolume(-1);
		System.out.println(stv.getVolume());
		stv.setVolume(20);
		System.out.println(stv.getVolume());
		stv.setMute(true);
		// RemoteControl 정의된 디폴트 메서드가 스마트 티비 클래스에서 재정의됨
		stv.RCOff();
		RemoteControl.changeBattery();
		System.out.println();
		
		srf.RCOn();
		srf.setMute(true);
		srf.RCOff();
		System.out.println();
		
		// 인터페이스의 다형성
		RemoteControl rc = new SmartTV();
		rc.setMute(false);
		rc = new SmartRefrig();
		rc.setMute(false);
		
		RemoteControl[] rcArr = new RemoteControl[2];
		rcArr[0] = new SmartTV();
		rcArr[1] = new SmartRefrig();
		
		for(int i = 0; i < rcArr.length; i++) {
			rcArr[i].setMute(false);
		}
		
		rc.a();
		
		
		
	}

}
