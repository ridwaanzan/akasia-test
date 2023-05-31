package com.akasia.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FizzbuzzApplicationTests {

	@Test
	void contextLoads() {
		String string 	 	   = "Result: ";
		StringBuilder response = new StringBuilder(string);
		Integer los     	   = 25;

		for (int i = 1; i < los; i++) {
			// TODO: multiple 3
			if (i % 3 == 0 && i % 5 == 0) {
				response.append("FWD").append(", ");
			} else if (i % 3 == 0) {
				response.append("AKASIA").append(", ");
			} else if (i % 5 == 0) {
				response.append("OK").append(", ");
			} else {
				response.append(String.valueOf(i)).append(", ");
			}
		}

		System.out.println(response);
	}

}
