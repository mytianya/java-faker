package com.github.javafaker;

/**
 * Generates aviation related strings.
 */
public class Aviation {

    private final Faker faker;
    private static short[] area={1,2,3,4,5,6,8,9};
    protected Aviation(Faker faker) {
        this.faker = faker;
    }

    /**
     * @return some aircraft name/model/make e.g. "An-2".
     */
    public String aircraft() {
        return faker.fakeValuesService().fetchString("aviation.aircraft");
    }

    /**
     * Returns an airport ICAO code.
     * See also: https://en.wikipedia.org/wiki/List_of_airports_by_ICAO_code:_A
     */
    public String airport() {
        return faker.fakeValuesService().fetchString("aviation.airport");
    }

    /**
     * Provides a METAR weather report.
     * Have a look at https://en.wikipedia.org/wiki/METAR
     */
    public String METAR() {
        return faker.fakeValuesService().fetchString("aviation.metar");
    }

    /**
     * http://airport.anseo.cn/c-china__page-2
     * @return
     */
    public String airportIATA(){
        return faker.fakeValuesService().fetchString("aviation.airportIata");
    }
    public String planeIcao(){return faker.fakeValuesService().fetchString("aviation.planeIcao");}
    public String planeNumber(){
        StringBuffer sb=new StringBuffer();
        sb.append(area[faker.random().nextInt(area.length)]);
        sb.append(area[faker.random().nextInt(area.length)]);
        sb.append(faker.random().nextInt(10,99));
        return faker.fakeValuesService().fetchString("aviation.flightCompanyIcao")+sb.toString();
    }
    public String missionType(){
        return faker.fakeValuesService().fetchString("aviation.missionType");
    }

}