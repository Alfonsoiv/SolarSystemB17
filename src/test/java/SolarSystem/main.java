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

        Planet2 xaros = new Planet2();
        xaros.name = "Xaros";
        xaros.color ="BLACK";
        xaros.temp = "32932323k";
        
    }
}
