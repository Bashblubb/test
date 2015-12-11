package Tests;

import java.util.regex.Matcher;
import FizzBuzz.FizzBuzz;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void getOne() {
		assertThat(getFizzAnswer(1), is("1"));
	}

	@Test
	public void getTwo() {
		assertThat(getFizzAnswer(2), is("2"));
	}

	@Test
	public void getFizz() {
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				assertThat(getFizzAnswer(i), is("Fizz"));
			}
		}
	}

	@Test
	public void getBuzz() {
		for (int i = 0; i < 100; i++) {
			if (i % 5 == 0 && i % 3 != 0) {
				assertThat(getFizzAnswer(i), is("Buzz"));
			}
		}
	}

	@Test
	public void getFizzBuzz() {
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				assertThat(getFizzAnswer(i), is("FizzBuzz"));
			}
		}
	}

	@Test
	public void getNegatives() {
		assertThat(getFizzAnswer(-1), is("-1"));
		assertThat(getFizzAnswer(-3), is("Fizz"));
		assertThat(getFizzAnswer(-5), is("Buzz"));
		assertThat(getFizzAnswer(-15), is("FizzBuzz"));
	}

	private static String getFizzAnswer(int i) {
		return FizzBuzz.getAnswerFor(i);
	}

}
