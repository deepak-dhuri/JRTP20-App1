package in.ashokit;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	public static String encode(String txt) {
		Encoder encoder = Base64.getEncoder();
		String encodeToString = encoder.encodeToString(txt.getBytes());
		return encodeToString;
	}

	public static String decode(String encodeTxt) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodeTxt);
		return new String(decode);
	}
	public static void main(String[] args) {
		String encode = PasswordService.encode("Deepak");
		System.out.println(encode);
		String decode = PasswordService.decode(encode);
		System.out.println(decode);
	}
}
