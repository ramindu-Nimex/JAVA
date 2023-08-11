public class Point3D {
   private int x, y, z;

   // create an default constructor
   public Point3D() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	// create an overloaded constructor
	public Point3D(int px, int py, int pz) {
		this.x = px;
		this.y = py;
		this.z = pz;
	}
	
	public double distance() {
		double dis = Math.sqrt((x * x) + (y * y) + (z * z));
		return dis;
	}
}
