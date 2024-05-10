import java.util.Random;

public class Main {
	public static void main(String[] args) {
		// exercise 1
		System.out.println("Exercise 1: So sánh các số trong phạm vi 100 000");
		for (int i = 0; i < 20; i++) {
			System.out.println("\t " + generateExercise1());
		}
		System.out.println("-------------- End of Exercise 1 --------------------");

		System.out.println("Exercise 2: Tính giá trị biểu thức số có đến hai dấu phép tính");
		for (int i = 0; i < 10; i++) {
			System.out.println("\t" + generateExercise2_1());
			System.out.println("\t" + generateExercise2_2());
			System.out.println("\t" + generateExercise2_3());
			System.out.println("\t" + generateExercise2_4());
			System.out.println("\t" + generateExercise2_5());
			System.out.println("\t" + generateExercise2_6());
			System.out.println("\t" + generateExercise2_7());
			System.out.println("\t" + generateExercise2_8());
			System.out.println("\t" + generateExercise2_9());
			System.out.println("\t" + generateExercise2_10());
			System.out.println("\t" + generateExercise2_11());
		}
		System.out.println("-------------- End of Exercise 2 --------------------");

		System.out.println("Exercise 3: Xác định được thành phần chưa biết của phép tính thông qua các giá trị đã biết");
		for (int i = 0; i < 10; i++) {
			System.out.println("\t" + generateExercise3_1());
			System.out.println("\t" + generateExercise3_2());
			System.out.println("\t" + generateExercise3_3());
			System.out.println("\t" + generateExercise3_4());
			System.out.println("\t" + generateExercise3_5());
			System.out.println("\t" + generateExercise3_6());
		}
		System.out.println("-------------- End of Exercise 3 --------------------");
	}

	private static int randomNumber(int maxNum) {
		Random random = new Random();
		return random.nextInt(maxNum) + 2;
	}

	/**
	 * Compare numbers in range [1, 100.000]
	 * @return
	 */
	private static String generateExercise1() {
		int number1 = randomNumber(100000);
		int number2;
		do {
			number2 = randomNumber(100000);
		}while (number1 == number2);
		return new StringBuilder()
				.append("")
				.append(number1)
				.append("           ")
				.append(number2)
				.toString();
	}

	/**
	 * Tính giá trị biểu thức số có đến hai dấu phép tính: + & -
	 * @return
	 */
	private static String generateExercise2_1() {
		int number1 = randomNumber(1000);
		int number2 = randomNumber(100);
		int number3 = randomNumber(100);
		return new StringBuilder()
				.append("")
				.append(number1)
				.append(" + ")
				.append(number2)
				.append(" - ")
				.append(number3)
				.toString();
	}

	/**
	 * Tính giá trị biểu thức số có đến hai dấu phép tính: + & *
	 * @return
	 */
	private static String generateExercise2_2() {
		int number1 = randomNumber(1000);
		int number2 = randomNumber(100);
		int number3 = randomNumber(9);
		return new StringBuilder()
				.append("")
				.append(number1)
				.append(" + ")
				.append(number2)
				.append(" x ")
				.append(number3)
				.toString();
	}

	/**
	 * Tính giá trị biểu thức số có đến hai dấu phép tính: - & *
	 * @return
	 */
	private static String generateExercise2_3() {
		int number1;
		int number2;
		int number3;
		do {
			number1 = randomNumber(100000);
			number2 = randomNumber(100000);
			number3 = randomNumber(9);
		} while (number1 - number2 * number3 < 0);
		return new StringBuilder()
				.append("")
				.append(number1)
				.append(" - ")
				.append(number2)
				.append(" x ")
				.append(number3)
				.toString();
	}

	/**
	 * Tính giá trị biểu thức số có đến hai dấu phép tính: - & :
	 * @return
	 */
	private static String generateExercise2_4() {
		int number1;
		int number2;
		int number3;
		do {
			number1 = randomNumber(100000);
			number2 = randomNumber(100000);
			number3 = randomNumber(9);
		} while (number1 - number2/number3 < 0 || number2%number3 != 0);
		return new StringBuilder()
				.append("")
				.append(number1)
				.append(" - ")
				.append(number2)
				.append(" : ")
				.append(number3)
				.toString();
	}

	/**
	 * Tính giá trị biểu thức số có đến hai dấu phép tính: + & :
	 * @return
	 */
	private static String generateExercise2_5() {
		int number1 = randomNumber(100000);
		int number2;
		int number3;
		do {
			number2 = randomNumber(100000);
			number3 = randomNumber(9);
		} while (number2%number3 != 0);
		return new StringBuilder()
				.append("")
				.append(number1)
				.append(" + ")
				.append(number2)
				.append(" : ")
				.append(number3)
				.toString();
	}

	/**
	 * Tính giá trị biểu thức số có đến hai dấu phép tính: * & :
	 * @return
	 */
	private static String generateExercise2_6() {
		int number1;
		int number2;
		int number3;
		do {
			number1 = randomNumber(100000);
			number2 = randomNumber(9);
			number3 = randomNumber(9);
		} while (number2%number3 != 0 || number1%number3 != 0);
		return new StringBuilder()
				.append("")
				.append(number1)
				.append(" X ")
				.append(number2)
				.append(" : ")
				.append(number3)
				.toString();
	}

	/**
	 * Tính giá trị biểu thức số có đến hai dấu phép tính: : & *
	 * @return
	 */
	private static String generateExercise2_7() {
		int number1;
		int number2;
		int number3;
		do {
			number1 = randomNumber(100000);
			number2 = randomNumber(9);
			number3 = randomNumber(9);
		} while (number1%number2 != 0 || number2%number3 != 0);
		return new StringBuilder()
				.append("")
				.append(number1)
				.append(" : ")
				.append(number2)
				.append(" X ")
				.append(number3)
				.toString();
	}

	/**
	 * Tính giá trị biểu thức số có đến hai dấu phép tính: * & +
	 * @return
	 */
	private static String generateExercise2_8() {
		int number1 = randomNumber(100000);
		int number2 = randomNumber(9);
		int number3 = randomNumber(100000);
		return new StringBuilder()
				.append("")
				.append(number1)
				.append(" X ")
				.append(number2)
				.append(" + ")
				.append(number3)
				.toString();
	}

	/**
	 * Tính giá trị biểu thức số có đến hai dấu phép tính: : & +
	 * @return
	 */
	private static String generateExercise2_9() {
		int number1;
		int number2;
		int number3;
		do {
			number1 = randomNumber(100000);
			number2 = randomNumber(9);
			number3 = randomNumber(100000);
		} while (number1%number2 != 0);
		return new StringBuilder()
				.append("")
				.append(number1)
				.append(" : ")
				.append(number2)
				.append(" + ")
				.append(number3)
				.toString();
	}

	/**
	 * Tính giá trị biểu thức số có đến hai dấu phép tính: : & -
	 * @return
	 */
	private static String generateExercise2_10() {
		int number1;
		int number2;
		int number3;
		do {
			number1 = randomNumber(100000);
			number2 = randomNumber(9);
			number3 = randomNumber(100000);
		} while (number1%number2 != 0 || number1/number2 - number3 < 0);
		return new StringBuilder()
				.append("")
				.append(number1)
				.append(" : ")
				.append(number2)
				.append(" - ")
				.append(number3)
				.toString();
	}

	/**
	 * Tính giá trị biểu thức số có đến hai dấu phép tính: * & -
	 * @return
	 */
	private static String generateExercise2_11() {
		int number1 = randomNumber(100000);
		int number2;
		int number3;
		do {
			number2 = randomNumber(9);
			number3 = randomNumber(100000);
		} while (number1*number2 - number3 < 0);
		return new StringBuilder()
				.append("")
				.append(number1)
				.append(" * ")
				.append(number2)
				.append(" - ")
				.append(number3)
				.toString();
	}

	/**
	 * Xác định được thành phần chưa biết của phép tính thông qua các giá trị đã biết
	 * 1/ Tìm số hạng thứ 1 trong phép cộng
	 * @return
	 */
	private static String generateExercise3_1() {
		int number1;
		int number2;
		int number3;
		do {
			number1 = randomNumber(100000);
			number2 = randomNumber(100000);
			number3 = randomNumber(100000);
		} while (number1 + number2 != number3);
		return new StringBuilder()
				.append("x")
				.append(" + ")
				.append(number2)
				.append(" = ")
				.append(number3)
				.toString();
	}

	/**
	 * Xác định được thành phần chưa biết của phép tính thông qua các giá trị đã biết
	 * 2/ Tìm số hạng thứ 2 trong phép cộng
	 * @return
	 */
	private static String generateExercise3_2() {
		int number1;
		int number2;
		int number3;
		do {
			number1 = randomNumber(100000);
			number2 = randomNumber(100000);
			number3 = randomNumber(100000);
		} while (number1 + number2 != number3);
		return new StringBuilder()
				.append(number1)
				.append(" + ")
				.append("X")
				.append(" = ")
				.append(number3)
				.toString();
	}

	/**
	 * Xác định được thành phần chưa biết của phép tính thông qua các giá trị đã biết
	 * 3/ Tìm tổng trong phép cộng
	 * @return
	 */
	private static String generateExercise3_3() {
		int number1;
		int number2;
		int number3;
		do {
			number1 = randomNumber(100000);
			number2 = randomNumber(100000);
			number3 = randomNumber(100000);
		} while (number1 + number2 != number3);
		return new StringBuilder()
				.append(number1)
				.append(" + ")
				.append(number2)
				.append(" = ")
				.append("X")
				.toString();
	}

	/**
	 * Xác định được thành phần chưa biết của phép tính thông qua các giá trị đã biết
	 * 4/ Tìm bị trừ trong phép trừ
	 * @return
	 */
	private static String generateExercise3_4() {
		int number1;
		int number2;
		int number3;
		do {
			number1 = randomNumber(100000);
			number2 = randomNumber(100000);
			number3 = randomNumber(100000);
		} while (number1 - number2 != number3);
		return new StringBuilder()
				.append("x")
				.append(" - ")
				.append(number2)
				.append(" = ")
				.append(number3)
				.toString();
	}

	/**
	 * Xác định được thành phần chưa biết của phép tính thông qua các giá trị đã biết
	 * 5/ Tìm số trừ trong phép trừ
	 * @return
	 */
	private static String generateExercise3_5() {
		int number1;
		int number2;
		int number3;
		do {
			number1 = randomNumber(100000);
			number2 = randomNumber(100000);
			number3 = randomNumber(100000);
		} while (number1 - number2 != number3);
		return new StringBuilder()
				.append(number1)
				.append(" - ")
				.append("X")
				.append(" = ")
				.append(number3)
				.toString();
	}

	/**
	 * Xác định được thành phần chưa biết của phép tính thông qua các giá trị đã biết
	 * 6/ Tìm hiệu trong phép trừ
	 * @return
	 */
	private static String generateExercise3_6() {
		int number1;
		int number2;
		int number3;
		do {
			number1 = randomNumber(100000);
			number2 = randomNumber(100000);
			number3 = randomNumber(100000);
		} while (number1 - number2 != number3);
		return new StringBuilder()
				.append(number1)
				.append(" - ")
				.append(number2)
				.append(" = ")
				.append("X")
				.toString();
	}
}