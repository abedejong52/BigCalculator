import java.util.Scanner;

public class MindBaby {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What formula would you like to use");
		String equation = scan.nextLine();
		// Distance
		if (equation.equals("distance") || equation.equals("length")) {
			String distance;
			System.out.println("What is your 'x1' value");
			double x1 = Double.parseDouble(scan.nextLine());
			System.out.println("What is the 'x2' value");
			double x2 = Double.parseDouble(scan.nextLine());
			System.out.println("What is your 'y1' value");
			double y1 = Double.parseDouble(scan.nextLine());
			System.out.println("What is your 'y2' value");
			double y2 = Double.parseDouble(scan.nextLine());
			double dist = distance(x1, x2, y1, y2);
			System.out.println("The distance from point a to point b is " + dist);
		}

		// Volume

		else if (equation.equals("volume"))

		{
			System.out.println("What shape are you solving for");
			String volume = scan.nextLine();
			if (volume.equals("pyramid")) {
				System.out.println("What is your length value");
				double length = Double.parseDouble(scan.nextLine());
				System.out.println("What is your width value");
				double height = Double.parseDouble(scan.nextLine());
				System.out.println("What is your height value");
				double width = Double.parseDouble(scan.nextLine());
				double Vpyr = pyramidvolume(length, width, height);
				System.out.println("The volume of this pyramid is: " + Vpyr);
			} else if (volume.equals("cube")) {
				System.out.println("What is your side length");
				double side = Double.parseDouble(scan.nextLine());
				double Vcube = cubevolume(side);
				System.out.println("The volume of this cube is: " + Vcube);
			} else if (volume.equals("pentagon")) {
				System.out.println("What is your side length");
				double side = Double.parseDouble(scan.nextLine());
				System.out.println("What is your height value");
				double height = Double.parseDouble(scan.nextLine());
				double Vpent = pentagonvolume(side, height);
				System.out.println("The volume of this pentagon is: " + Vpent);
			} else if (volume.equals("rectangle")) {
				System.out.println("What is your lenght value");
				double length = Double.parseDouble(scan.nextLine());
				System.out.println("What is your width value");
				double width = Double.parseDouble(scan.nextLine());
				System.out.println("What is your height value");
				double height = Double.parseDouble(scan.nextLine());
				double rectVolume = rectanglevolume(length, width, height);
				System.out.println("The volume of this rectangle is: " + rectVolume);
			} else if (volume.equals("hexagon")) {
				System.out.println("What is your side length");
				double side = Double.parseDouble(scan.nextLine());
				System.out.println("What is your height value");
				double height = Double.parseDouble(scan.nextLine());
				double hexvolume = hexagonvolume(side, height);
				System.out.println("The volume of this hexagon is: " + hexvolume);
			}
		}

		// Area
		else if (equation.equals("area")) {
			System.out.println("What shape are you solving for");
			String area = scan.nextLine();
			if (area.equals("triangle")) {
				System.out.println("What is your base value");
				double base = Double.parseDouble(scan.nextLine());
				System.out.println("What is your height value");
				double height = Double.parseDouble(scan.nextLine());
				double Atri = trianglearea(base, height);
				System.out.println("The area of this triangle is: " + Atri);
			} else if (area.equals("square")) {
				System.out.println("What is your side length");
				double side = Double.parseDouble(scan.nextLine());
				double Asqua = squarearea(side);
				System.out.println("The area of this square is: " + Asqua);
			} else if (area.equals("pentagon")) {
				System.out.println("What is your side length");
				double side = Double.parseDouble(scan.nextLine());
				double Apent = pentagonarea(side);
				System.out.println("The area of this pentagon is: " + Apent);
			} else if (area.equals("rectangle")) {
				System.out.println("What is your length value");
				double length = Double.parseDouble(scan.nextLine());
				System.out.println("What is your width value");
				double width = Double.parseDouble(scan.nextLine());
				double Arect = rectanglearea(length, width);
				System.out.println("The area of this rectangle is: " + Arect);
			} else if (area.equals("hexagon")) {
				System.out.println("What is your side length");
				double side = Double.parseDouble(scan.nextLine());
				double Ahexa = hexagonarea(side);
				System.out.println("The area of this hexagon is: " + Ahexa);
			} else if (area.equals("parallelogram")) {
				System.out.println("What is your base value");
				double base = Double.parseDouble(scan.nextLine());
				System.out.println("What is your height value");
				double height = Double.parseDouble(scan.nextLine());
				double paraA = parallelogramarea(base, height);
				System.out.println("The area of this parallelogram is: " + paraA);
				
			}
		}

		// Surface Area
		else if (equation.equals("surface area")) {
			System.out.println("What shape are you solving for");
			String SurfaceArea = scan.nextLine();
			if (SurfaceArea.equals("pyramid")) {
				System.out.println("What is your lenght value");
				double length = Double.parseDouble(scan.nextLine());
				System.out.println("What is your width value");
				double width = Double.parseDouble(scan.nextLine());
				System.out.println("What is your height value");
				double height = Double.parseDouble(scan.nextLine());
				double pyrSA = pyramidsurfacearea(length, width, height);
				System.out.println("The surface area of this pyramid is: " + pyrSA);
				
			} else if (SurfaceArea.equals("cube")) {
				System.out.println("What is your side length");
				double side = Double.parseDouble(scan.nextLine());
				double cubeSA = cubesurfacearea(side);
				System.out.println("The surface area of this cube is: " + cubeSA);
			} else if (SurfaceArea.equals("pentagon")) {
				System.out.print("What is your side length");
				double side = Double.parseDouble(scan.nextLine());
				System.out.println("What is your height value");
				double height = Double.parseDouble(scan.nextLine());
				double pentSA = pentagonprismsurfacearea(side, height);
				System.out.println("The surface area of this pentagonal prism is " + pentSA);
			} else if (SurfaceArea.equals("rectangle")) {
				System.out.println("What is your lenght value");
				double length = Double.parseDouble(scan.nextLine());
				System.out.println("What is your width value");
				double width = Double.parseDouble(scan.nextLine());
				System.out.println("What is your height value");
				double height = Double.parseDouble(scan.nextLine());
				double pentSA = rectanglesurfacearea(length, width, height);
				System.out.println("The surface area of this pentagonal prism is " + pentSA);
			} else if (SurfaceArea.equals("hexagon")) {
				System.out.print("What is your side length");
				double side = Double.parseDouble(scan.nextLine());
				System.out.println("What is your height value");
				double height = Double.parseDouble(scan.nextLine());
				double hexSA = hexagonsurfacearea(side, height);
				System.out.println("The surface area of this hexagonal prism is " + hexSA);
			} else if (SurfaceArea.equals("parallelogram")) {
				System.out.println("What is your base value");
				double base = Double.parseDouble(scan.nextLine());
				System.out.println("What is your height value");
				double height = Double.parseDouble(scan.nextLine());
				System.out.println("What is your length value");
				double length = Double.parseDouble(scan.nextLine());
				double paraSA = parallelogramSA(base, height, length);
				System.out.println("The surface area of this parallelogram is );
			}
		} else if (equation.equals("quadratic")) {
			System.out.println("What is your 'a' value");
			double a = Double.parseDouble(scan.nextLine());
			System.out.println("What is your 'b' value");
			double b = Double.parseDouble(scan.nextLine());
			System.out.println("What is your 'c' value");
			double c = Double.parseDouble(scan.nextLine());
			
		} else {
			System.out.print("Im sorry, this is not a formula we are familiar with");
		}
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
	
	public static double parallelogramarea(double b, double h){
	return(b*h);
	}

	// END AREA
	// START DISTANCE
	public static double distance(double x1, double y1, double x2, double y2) {
	double xpart = Math.pow(x1 - x2, 2);
	double ypart = Math.pow(y1 - y2, 2);
	return Math.sqrt(xpart + ypart);
	}
	// END DISTANCE

	// START VOLUME
	public static double pyramidvolume(double h, double l, double w) {
	double sSquared = (l*w);
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