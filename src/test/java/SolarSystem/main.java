package SolarSystem;

public class main {
    public static void main(String[] args) {
        solarSystemBasics solarsys = new solarSystemBasics();
        solarsys.Sun= "1";
        solarsys.Moon="2";
        solarsys.Planets="2";
        solarsys.Stars="10";


        //********************Feature Sun******************

        FeatrureSun Sun = new FeatrureSun();
        Sun.name="panther";
        Sun.color="black";
        Sun.temp="122323123kelvin";

        //----------------------Feature Planet1-------------------------

        Planet1 plato = new Planet1();
        plato.color="green";
        plato.name= "abrevsav";
        plato.temp= "299900k";
        plato.radius ="3985895km";
    }
}
