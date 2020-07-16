package test;
import processing.core.*;
public class Testing extends PApplet {	
	
	private String URL = "https://images.unsplash.com/photo-1472214103451-9374bd1c798e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80";
	public PImage backgroundImg;
	public static void main(String[] args) {
		PApplet.main("test.Testing");
	}
		
		public void settings() {
			size(500,500);
			backgroundImg=loadImage(URL,"jpg");
		}
		
		public void draw() {
			backgroundImg.resize(0, height);
			image(backgroundImg,0,0);
			fill(255,209,0);
			int[] color = sunColorSec((second()));
			fill(color[0],color[1],color[2]);
			ellipse(width/4,height/5, width/5,height/5);
			
			
	}
		public int[] sunColorSec(float second) {
			int[] rgb = new int[3];
			float diffFrom30 = Math.abs(30-second);
			float ratio = diffFrom30/30;
			rgb[0]=(int)(255*ratio);
			rgb[1]=(int)(255*ratio);
			rgb[2]=0;
			
			return rgb;
		}
}



