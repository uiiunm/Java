package edu;

public class Gugudan {

	public void printGugudan(int col)

	{

		// Scanner

//		try (Scanner scanner = new Scanner(System.in)) {

//			System.out.print("Column : ");

//			col = scanner.nextInt();

//		} catch (Exception e) {

//			return;

//		}

		if (col < 1 || 9 <= col) {

			System.out.println("col is not valid!");

			return;

		}

		for (int i = 2; i < 10; i += col) {

			for (int j = 1; j < 10; j++) {

				for (int k = 0; k < col; k++) {

					if (10 <= i + k) {

						System.out.print("\n");

						break;

					}

					System.out.printf("%d*%d=%d", (i + k), j, (i + k) * j);

					if (k < col - 1)
						System.out.print("\t");

					else
						System.out.print("\n");

				}

			}

			System.out.println();

		}

	}

}