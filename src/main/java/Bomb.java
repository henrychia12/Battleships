
public class Bomb {
	
	private boolean hit;
	private boolean miss;
	
	public Bomb(boolean hit, boolean miss) {
		this.setHit(hit);
		this.setMiss(miss);
	}

	public boolean isHit() {
		return hit;
	}

	public void setHit(boolean hit) {
		this.hit = hit;
	}

	public boolean isMiss() {
		return miss;
	}

	public void setMiss(boolean miss) {
		this.miss = miss;
	}

}
