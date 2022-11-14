package Exercise;

public class Q07_Inheritence {

	public static void main(String[] args) {
		ColorTV mytv = new ColorTV(32, 1024);
		mytv.printProperty();
		
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
		
	}

}

class TV {
	private int size;

	public TV(int size) {
		super();
		this.size = size;
	}
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}

class ColorTV extends TV {
	private int resolution;
	public ColorTV(int size, int resolution) {
		super(size);
		this.resolution = resolution;
	}
	protected void printProperty() {
		System.out.println(getSize() + "인치 " + resolution + "해상도");
	}
}

class IPTV  extends ColorTV {
	private String addr;
	public IPTV(String addr, int size, int resolution) {
		super(size, resolution);
		this.addr = addr;
	}
	@Override
	protected void printProperty() {
		System.out.print("나의 IPTV는 "+ addr + " 주소의 " );
		super.printProperty();
	}
}