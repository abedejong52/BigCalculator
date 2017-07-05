//import java.util.Scanner 
public class TheBigCalculater {

	public static void main(String[] args) {
		printHello();
	}
		
	

	public static void printHello() {
		System.out.println(("ABE insert thing here"));
	}

	// START AREA
	public static double trianglearea(double b, double h) {
		return ((b * h) / 2);
	}

	public static double squarearea(double s) {
		double spart = Math.pow(s, 2);
		return (spart);
	}

	public static double rectanglearea(double l, double w) {
		return (l * w);
	}

	public static double pentagonarea(double x) {
		return (x * x * 1.72048);
	}
	public static double hexagonarea(double x) {
		return (x * x * 2.59808);
	}
	// END AREA
	// START DISTANCE

	
	// END DISTANCE
	
	
	// START VOLUME
	public static double pyramidvolume(double h, double s) {
		double sSquared = Math.pow(s, 2);
		return Math.sqrt((sSquared * h) / 3);
	}
	public static double cubevolume(double x) {
		double xpart = Math.pow(x, 3);
		return xpart;
	}
	public static double rectanglevolume(double w, double h, double l) {
		return (w * h * l);
	}
	public static double pentagonvolume(double x, double h) {
		return (x * x * h * 1.72048);
	}
	public static double hexagonvolume(double x, double h) {
		return (x * x * h * 2.59808);
	}
	// END VOLUME
	// START SA
	public static double pyramidsurfacearea(double w, double h, double l) {
		double wpart = Math.sqrt(w * w / 4 + (h * h)) * l;
		double hpart = w * Math.sqrt(l * l / 4 + h * h);
		double lpart = l * w;
		return (wpart + hpart + lpart);
	}
	public static double cubesurfacearea(double x) {
		return (x * x * 6);
	}
	public static double rectangleprismsurfacearea(double w, double h, double l) {
		double wpart = w * l;
		double hpart = h * l;
		double lpart = h * w;
		return (2 * (wpart + hpart + lpart));
	}
	public static double pentagonprismsurfacearea(double a, double h) {
		double apart = (3.44096 * a * a);
		double hpart = (5 * a * h);
		return (apart + hpart);
	}
	public static double hexagonprismsurfacearea(double a, double h) {
		double apart = (6 * a * h);
		double hpart = Math.sqrt(3) * a * a * 3;
		return (hpart + apart);
	}
	// END SA
	// START QUADRATIC
	public static double quadraticpositive(double a, double b, double c) {
		double apart = Math.sqrt((b * b) - (4 * a * c));
		double bpart = 2 * a;
		double cpart = -b;
		return ((cpart + apart) / bpart);
	}
	public static double quadraticnegative(double a, double b, double c) {
		double apart = Math.sqrt((b * b) - (4 * a * c));
		double bpart = 2 * a;
		double cpart = -b;
		return ((cpart - apart) / bpart);
	}
}