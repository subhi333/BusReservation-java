package marketing.own.dev.service;

public class Bus {
	private int busno;
	private boolean Ac;
	private int capacity;
	
	
	public Bus(int no, boolean ac, int cap) {
	this.busno=no;
	this.Ac=ac;
	this.capacity=cap;
	
	}
	public int getBusno() {
		return busno;
	}

	public boolean isAc() {
		return Ac;
	}

	public void setAc(boolean ac) {
		Ac = ac;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int cap) {
		this.capacity = cap;
	}
    
	public void businfo() {
		System.out.println("Busno="+busno +"AC="+ Ac + "Capacity=" + capacity);
	}
	
}
	
