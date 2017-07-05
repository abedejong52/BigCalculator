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
				System.out.println("What is your lenght value");
				String pyrvol = scan.nextLine();
				System.out.println("What is your width value");
				String pyrvol2 = scan.nextLine();
				System.out.println("What is your height value");
				String pyrvol3 = scan.nextLine();
			} else if (volume.equals("cube")) {
				System.out.print("What is your side length");
				String cube = scan.nextLine();
			} else if (volume.equals("pentagon")) {
				System.out.print("What is your side length");
				String pentvol = scan.nextLine();
				System.out.println("What is your height value");
				String pentvol2 = scan.nextLine();
			} else if (volume.equals("rectangle")) {
				System.out.println("What is your lenght value");
				String rectvol = scan.nextLine();
				System.out.println("What is your width value");
				String rectvol2 = scan.nextLine();
				System.out.println("What is your height value");
				String rectvol3 = scan.nextLine();
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
	
	

}