package allprogram;

public class Cube {
	int height;
	int width;
	int depth;
	
	
	public Cube(int height,int width,int depth){
		this.height=height;
		this.depth=depth;
		this.width=width;
		 
	}
//	int volume() {
//		return width* height*depth;
//	}
	public static void main(String[] args) {
		int volume ;
		Cube cube =new Cube(10, 20, 15);
		//volume=cube.volume();
		System.out.println(cube.depth*cube.height*cube.width);
	}

}
