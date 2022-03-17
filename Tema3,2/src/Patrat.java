
public class Patrat {
	private int latura, aria;
	
	public Patrat() {
		this.latura =10;
		this.aria = this.latura * this.latura;
	}
	public Patrat(int latura) {
		this.latura = latura;
		this.aria=latura*latura;
	}
	@Override
	public String toString() {
		return "Patrat [latura=" + latura + ", aria=" + aria + "]";
	}
	
	

}
