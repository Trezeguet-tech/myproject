package com.webtech.webapp;

import com.webtech.calcul.Calcul;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class WebappApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void addition() {
		Calcul cal1= new Calcul();
		cal1.setX(5);
		cal1.setY(5);
		assertEquals(cal1.addition(),10);
	}

}
