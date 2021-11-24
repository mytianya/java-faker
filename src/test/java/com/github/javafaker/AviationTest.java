package com.github.javafaker;

import org.junit.Test;

import java.util.Locale;

import static com.github.javafaker.matchers.IsStringWithContents.isStringWithContents;
import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class AviationTest extends AbstractFakerTest {

    @Test
    public void airport() {
        Faker faker=new Faker(Locale.CHINA);
        assertThat(faker.aviation().airport(), matchesRegularExpression("\\w{4}"));
    }

    @Test
    public void aircraft() {
        assertThat(faker.aviation().aircraft(), isStringWithContents());
    }

    @Test
    public void metar() {
        assertThat(faker.aviation().METAR(), isStringWithContents());
    }
    @Test
    public void airprotIATA(){
        System.out.println(faker.aviation().airportIATA());
        assertThat(faker.aviation().airportIATA(), isStringWithContents());
    }
    @Test
    public void planeIcao(){
        System.out.println(faker.aviation().planeIcao());
    }
    @Test
    public void planeNumber(){
        System.out.println(faker.aviation().planeNumber());
    }
}
