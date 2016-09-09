package krypto.KeywordTranscriptionCipher;

import static org.junit.Assert.*;

import java.util.Scanner;

import static krypto.KeywordTranscriptionCipher.*;
import org.junit.Test;

public class KeywordTranspositionCipherTest {

	KeywordTranspositionCipher cipher;
	Scanner test = new Scanner(System.in);
	
	@Test
	public void test() {		
		assertEquals(2, cipher.getCountTestcases(test));
	}

}
