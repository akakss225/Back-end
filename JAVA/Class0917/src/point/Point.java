package point;

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}
	
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(this.x == p.x && this.y == p.y) {
			return true;
		}
		else {
			return false;
		}
	}

}
