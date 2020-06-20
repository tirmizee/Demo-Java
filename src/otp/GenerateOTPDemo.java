package otp;

import java.util.SplittableRandom;

public class GenerateOTPDemo {

	public static final SplittableRandom splittableRandom = new SplittableRandom();
	
	public static void main(String[] args) {
		System.out.println(generateOTP(5));
		System.out.println(generateOTP(5));
		System.out.println(generateOTP(5));
	}

	private static String generateOTP(int otpLenth) {
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < otpLenth; i++) {
			builder.append(splittableRandom.nextInt(0, 10));
		}
		return builder.toString();
	}

}
