package tut10;

public class MobilePhone {
	private char color;
	private String colorCode;
	
	public MobilePhone(char color) {
		this.color=color;
		computeColorCode();
	}
	public String getColorCode() {
		return colorCode;
	}
	public boolean setColor(char color) {
		this.color = color;
		computeColorCode();
		return true;
	}
	
	private void computeColorCode() {
		if (this.color == 'R')
			colorCode = "#FF0000";
		if (this.color == 'O')
			colorCode = "#FFA500";
		if (this.color == 'Y')
			colorCode = "#FFFF00";
		if (this.color == 'P')
			colorCode = "#800080";
		if (this.color == 'B')
			colorCode = "#0000FF";
	}

}
