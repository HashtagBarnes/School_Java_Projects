/*
Dylan G Barnes
Lesson Five Homework: Caesars Cipher
CSC1060X04 Computer Science 1 
Monday, March 2nd, 2024.
*/

import java.util.Scanner;

public class lessonfive {
	static final Scanner KEYBOARD = new Scanner(System.in);

	public static char[] ALPHABET = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
									 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
									 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
									 'y', 'z'};
	
	public static void main(String[] args) {
		System.out.println("Welcome to Caesars Cipher!");
		System.out.print("Enter an offset for this encryption between -26 and 26: ");
		int EncryptionOffset = KEYBOARD.nextInt();
		KEYBOARD.nextLine();

		if (EncryptionOffset < -26 || EncryptionOffset > 26) {
			System.out.println("Encryption offset must be between -26 and 26.");
			return;
		}

		char[] EncryptedAlphabet = new char[ALPHABET.length];

        for (int i = 0; i < ALPHABET.length; i++) {
            int newIndex = (i - EncryptionOffset + ALPHABET.length) % ALPHABET.length;
            EncryptedAlphabet[newIndex] = ALPHABET[i];
        }

		for (char letter : ALPHABET) {
			System.out.print(letter + " ");
		}

        System.out.println();
        
		for (char enc_letter : EncryptedAlphabet) {
			System.out.print(enc_letter + " ");
		}
		
		System.out.println();
		System.out.print("Enter the text you would like encrypting: ");
		String EncryptedText = KEYBOARD.nextLine();
		
		StringBuilder EcTextBuilder = new StringBuilder();
		for (char c : EncryptedText.toCharArray()) {
			if (Character.isLetter(c)) {
				int ogIndex = new String(ALPHABET).indexOf(Character.toLowerCase(c));
				char EncryptedChar = EncryptedAlphabet[ogIndex];
				if (Character.isUpperCase(c)) {
					EncryptedChar = Character.toUpperCase(EncryptedChar);
				}
				EcTextBuilder.append(EncryptedChar);
			} else {
				EcTextBuilder.append(c);
			}
		}
		String EncryptedOutput = EcTextBuilder.toString();
		System.out.println("Encrypted text: " + EncryptedOutput);
	}
}