public class SignalTower {
	public SignalTower(String name, SignalTower link) {
		towerName = name;
		nextTower = link;
	}
	
	public void signal() {
		lightCurrentTower();
		if(nextTower != null) nextTower.signal();
	}
	
	public void lightCurrentTower() {
		System.out.println("Lighting " + towerName);
	}
	
	private String towerName;
	private SignalTower nextTower;
}
