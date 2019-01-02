
public abstract class Ship {
	
	private String shipType;
	private int shipSize;
	
	public Ship(String shipType, int shipSize) {
		this.setShipType(shipType);
		this.setShipSize(shipSize);
	}

	public String getShipType() {
		return shipType;
	}

	public void setShipType(String shipType) {
		this.shipType = shipType;
	}

	public int getShipSize() {
		return shipSize;
	}

	public void setShipSize(int shipSize) {
		this.shipSize = shipSize;
	}

}
