
public class Player {
	
	String name;
	int totalWin;
	
	public Player(String name) {
		this.name = name;
		this.totalWin = 0;
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getTotalWin() {return totalWin;}
	public void setTotalWin(int totalWin) {	this.totalWin = totalWin;}
	
	public void setTotalWin() {
		totalWin = totalWin + 1;
	}
	
}
