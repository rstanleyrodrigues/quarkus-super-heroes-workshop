package io.quarkus.workshop.superheroes.hero;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HeroTest {
	
	static Hero heroTest = new Hero();
	
	@BeforeAll
	public static void setUpHeroTest() {
		
		heroTest.level = 2;
		heroTest.name = "All Might";
		heroTest.otherName = "Toshinori Yagi";
		heroTest.powers = "One For All";
		heroTest.picture = "all_might.png";
		
	}
	
	@Test
	public void testToString() {
		
		Assertions.assertEquals(heroTest.toString(),
				"Hero{id=null, name='All Might', "
				+ "otherName='Toshinori Yagi', "
				+ "level=2, picture='all_might.png', "
				+ "powers='One For All'}");
	}

}
