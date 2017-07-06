import java.util.Scanner;

public class MindBaby {
	/*
	 * public static void main(String[] args) { Scanner scan = new
	 * Scanner(System.in);
	 * 
	 * double dist = distance(x1, x2, y1, y2); double Vcube = cubevolume(cube);
	 * double Vpyra = pyramidvolume(pyrvol, pyrvol2, pyrvol3); double Atria =
	 * trianglearea(base, height); double Asqua = squarearea(sqside); double
	 * Arect = rectanglearea(length, width); double Apent =
	 * pentagonarea(pentside); double Ahexa = hexagonarea(hexside); double Vrect
	 * = rectanglevolume(rectvol, rectvol2, rectvol3); double Vpent =
	 * pentagonvolume(pentvol, pentvol2); double Vhexa = hexagonvolume(hexvol,
	 * hexvol2); double SApyr = pyramidsurfacearea(pyrSA, pyrSA2, pyrSA3);
	 * double SAcub = cubesurfacearea(cubeSA); double SArec =
	 * rectangleprismsurfacearea(rectSA, rectSA2, rectSA3); double SApen =
	 * pentagonprismsurfacearea(pentSA, pentSA2); double SAhex =
	 * hexagonprismsurfacearea(hexSA, hexSA2); double Qnega =
	 * quadraticnegative(a, b, c); double Qposi = quadraticpositive(a, b, c);
	 * 
	 * System.out.println(Atria); System.out.println(Asqua);
	 * System.out.println(Arect); System.out.println(Apent);
	 * System.out.println(Ahexa); System.out.println(dist);
	 * System.out.println(Vcube); System.out.println(Vpyra);
	 * System.out.println(Vrect); System.out.println(Vpent);
	 * System.out.println(Vhexa); System.out.println(SApyr);
	 * System.out.println(SAcub); System.out.println(SArec);
	 * System.out.println(SApen); System.out.println(SAhex);
	 * System.out.println(Qnega); System.out.println(Qposi); }
	 */

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
				double Vrect = pyramidvolume(length, width, height);

			} else if (volume.equals("cube")) {
				System.out.print("What is your side length");
				double side = Double.parseDouble(scan.nextLine());
				double Vcube = cubevolume(side);
			} else if (volume.equals("pentagon")) {
				System.out.print("What is your side length");
				double side = Double.parseDouble(scan.nextLine());
				System.out.println("What is your height value");
				double height = Double.parseDouble(scan.nextLine());
				double Vpent = pentagonvolume(side, height);
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
				System.out.print("What is your side length");
				double side = Double.parseDouble(scan.nextLine());
				System.out.println("What is your height value");
				double height = Double.parseDouble(scan.nextLine());
				double hexvolume = hexagonvolume(side, height);
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
			} else if (area.equals("square")) {
				System.out.println("What is your side length");
				double side = Double.parseDouble(scan.nextLine());
				double Asqua = squarearea(side);
			} else if (area.equals("pentagon")) {
				System.out.println("What is your side length");
				double side = Double.parseDouble(scan.nextLine());
				double Apent = pentagonarea(side);
			} else if (area.equals("rectangle")) {
				System.out.println("What is your length value");
				double length = Double.parseDouble(scan.nextLine());
				System.out.println("What is your width value");
				double width = Double.parseDouble(scan.nextLine());
				double Arect = rectanglearea(length, width);
			} else if (area.equals("hexagon")) {
				System.out.println("What is your side length");
				double side = Double.parseDouble(scan.nextLine());
				double Ahexa = hexagonarea(side);
			} else if (area.equals("parallelogram")) {
				System.out.println("What is your base value");
				double base = Double.parseDouble(scan.nextLine());
				System.out.println("What is your height value");
				double height = Double.parseDouble(scan.nextLine());
				double hexarea = hexagonarea(length, width, height);
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
				double length = Double.parseDouble(scan.nextLine());
				System.out.println("What is your height value");
				double length = Double.parseDouble(scan.nextLine());
			} else if (SurfaceArea.equals("cube")) {
				System.out.println("What is your side length");
				double length = Double.parseDouble(scan.nextLine());
			} else if (SurfaceArea.equals("pentagon")) {
				System.out.print("What is your side length");
				double length = Double.parseDouble(scan.nextLine());
				System.out.println("What is your height value");
				double length = Double.parseDouble(scan.nextLine());
			} else if (SurfaceArea.equals("rectangle")) {
				System.out.println("What is your lenght value");
				double length = Double.parseDouble(scan.nextLine());
				System.out.println("What is your width value");
				double length = Double.parseDouble(scan.nextLine());
				System.out.println("What is your height value");
				double length = Double.parseDouble(scan.nextLine());
			} else if (SurfaceArea.equals("hexagon")) {
				System.out.print("What is your side length");
				double length = Double.parseDouble(scan.nextLine());
				System.out.println("What is your height value");
				String hexSA2 = scan.nextLine();
			} else if (SurfaceArea.equals("parallelogram")) {
				System.out.println("What is your base value");
				double length = Double.parseDouble(scan.nextLine());
				System.out.println("What is your height value");
				double length = Double.parseDouble(scan.nextLine());
				System.out.println("What is your length value");
				double length = Double.parseDouble(scan.nextLine());
			}
		} else if (equation.equals("quadratic")) {
			System.out.println("What is your 'a' value");
			double length = Double.parseDouble(scan.nextLine());
			System.out.println("What is your 'b' value");
			double length = Double.parseDouble(scan.nextLine());
			System.out.println("What is your 'c' value");
			double length = Double.parseDouble(scan.nextLine());
		} else {
			System.out.print("Im sorry, this is not a formula we are familiar with");
		}
	}

	public static double rectanglevolume(double w, double h, double l) {
		return (w * h * l);
	}

	public static double cubevolume(double x) {
		double xpart = Math.pow(x, 3);
		return xpart;
	}

	public static double pyramidvolume(double h, double l, double w) {
		return Math.sqrt((w * h * l) / 3);
	}

	public static double distance(double x1, double y1, double x2, double y2) {
		double xpart = Math.pow(x1 - x2, 2);
		double ypart = Math.pow(y1 - y2, 2);
		return Math.sqrt(xpart + ypart);
	}

}