package paint;

public abstract class Shape implements Drawable, Resizable{

	private String lineColor;
	private String fillColor;

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	/*
	 * public void draw() { System.out.println("그려졌다"); }
	 */
	
	public abstract void draw();

	

}
