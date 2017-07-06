import java.util.Scanner;

public class MindBaby {
	
	  public static void main(String[] args){
	 
	  
		Scanner scan = new Scanner(System.in);
		System.out.println("What formula would you like to use");
		String equation = scan.nextLine();
		// Distance
		if (equation.equals("distance") || equation.equals("length")) {
			String distance;
			System.out.println("What is your 'x1' value");
			String x1 = scan.nextLine();
			System.out.println("What is the 'x2' value");
			String x2 = scan.nextLine();
			System.out.println("What is your 'y1' value");
			String y1 = scan.nextLine();
			System.out.println("What is your 'y2' value");
			String y2 = scan.nextLine();
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
				double width = Double.parseDouble(scan.nextLine());
				System.out.println("What is your height value");
				double height = Double.parseDouble(scan.nextLine());

			} else if (volume.equals("cube")) {
				System.out.print("What is your side length");
				String cube = scan.nextLine();
			} else if (volume.equals("pentagon")) {
				System.out.print("What is your side length");
				String pentvol = scan.nextLine();
				System.out.println("What is your height value");
				String pentvol2 = scan.nextLine();

			} else if (volume.equals("rectangle")) {
				System.out.println("What is your length value");
				double length = Double.parseDouble(scan.nextLine());
				System.out.println("What is your width value");
				double width = Double.parseDouble(scan.nextLine());
				System.out.println("What is your height value");
				double height = Double.parseDouble(scan.nextLine());
				double rectVolume = rectanglevolume(length, width, height);
				System.out.println("The volume of this rectangle is: " + rectVolume);
			} else if (volume.equals("hexagon")) {
				System.out.print("What is your side length");
				String hexvol = scan.nextLine();
				System.out.println("What is your height value");
				String hexvol2 = scan.nextLine();
			}
		}

		// Area
		else if (equation.equals("area")) {
			System.out.println("What shape are you solving for");
			String area = scan.nextLine();
			if (area.equals("triangle")) {
				System.out.println("What is your base value");
				String base = scan.nextLine();
				System.out.println("What is your height value");
				String height = scan.nextLine();
			} else if (area.equals("square")) {
				System.out.println("What is your side length");
				String sqside = scan.nextLine();
			} else if (area.equals("pentagon")) {
				System.out.println("What is your side length");
				String pentside = scan.nextLine();
			} else if (area.equals("rectangle")) {
				System.out.println("What is your lenght value");
				String length = scan.nextLine();
				System.out.println("What is your width value");
				String width = scan.nextLine();
			} else if (area.equals("hexagon")) {
				System.out.println("What is your side length");
				String hexside = scan.nextLine();
			} else if (area.equals("parallelogram")) {
				System.out.println("What is your base value");
				String parabase = scan.nextLine();
				System.out.println("What is your height value");
				String paraheight = scan.nextLine();
			}
		}

		// Surface Area
		else if (equation.equals("surface area")) {
			System.out.println("What shape are you solving for");
			String SurfaceArea = scan.nextLine();
			if (SurfaceArea.equals("pyramid")) {
				System.out.println("What is your lenght value");
				String pyrSA = scan.nextLine();
				System.out.println("What is your width value");
				String pyrSA2 = scan.nextLine();
				System.out.println("What is your height value");
				String pyrSA3 = scan.nextLine();
			} else if (SurfaceArea.equals("cube")) {
				System.out.println("What is your side length");
				String cubeSA = scan.nextLine();
			} else if (SurfaceArea.equals("pentagon")) {
				System.out.print("What is your side length");
				String pentSA = scan.nextLine();
				System.out.println("What is your height value");
				String pentSA2 = scan.nextLine();
			} else if (SurfaceArea.equals("rectangle")) {
				System.out.println("What is your lenght value");
				String rectSA = scan.nextLine();
				System.out.println("What is your width value");
				String rectSA2 = scan.nextLine();
				System.out.println("What is your height value");
				String rectSA3 = scan.nextLine();
			} else if (SurfaceArea.equals("hexagon")) {
				System.out.print("What is your side length");
				String hexSA = scan.nextLine();
				System.out.println("What is your height value");
				String hexSA2 = scan.nextLine();
			} else if (SurfaceArea.equals("parallelogram")) {
				System.out.println("What is your base value");
				String paraSA = scan.nextLine();
				System.out.println("What is your height value");
				String paraSA2 = scan.nextLine();
				System.out.println("What is your length value");
				String paraSA3 = scan.nextLine();
			}
		} else if (equation.equals("quadratic")) {
			System.out.println("What is your 'a' value");
			String a = scan.nextLine();
			System.out.println("What is your 'b' value");
			String b = scan.nextLine();
			System.out.println("What is your 'c' value");
			String c = scan.nextLine();
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

		// END AREA
		// START DISTANCE
		public static double distance(double x1, double y1, double x2, double y2) {
			double xpart = Math.pow(x1 - x2, 2);
			double ypart = Math.pow(y1 - y2, 2);
			return Math.sqrt(xpart + ypart);
		}
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