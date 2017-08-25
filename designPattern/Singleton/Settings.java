package designPattern.Singleton;

public class Settings {
	private static Settings firstObject = null;
	private String font = "calibri";
	private String color = "black";

	private Settings() {
	}

	public static Settings getObject() {
		if (firstObject == null) {
			firstObject = new Settings();
		}
		return firstObject;
	}

	public void setFont(String fontName) {
		this.font = fontName;
	}

	public void setColor(String colorName) {
		this.color = colorName;
	}

	public String getFont() {
		return this.font;
	}

	public String getColor() {
		return this.color;
	}
}
