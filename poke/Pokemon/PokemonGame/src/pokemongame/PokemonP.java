/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

import java.util.ArrayList;

/**
 *
 * @author Half_BlooD PrincE
 */
public class PokemonP {
    int HP,Def,SpDef,Att,SpAtt,Spe;
    String name,type1,type2;
    String moves[][];
    public PokemonP(int h,int a,int d,int sa,int sd, int s, String t1,String t2)
    {
        moves=new String[4][6];
        HP=h;
        Def=d;
        SpDef=sd;
        Att=a;
        SpAtt=sa;
        Spe=s;
        type1=t1;
        type2=t2;
    }
void printMoves()
{
for(int i=0;i<4;i++)
System.out.println((i+1)+". "+moves[i][0]);
}

}
class CharizadP extends PokemonP
{
CharizadP()
{
super(360,293,280,348,295,328,"fire","flying");
moves[0][0]= "Flamethrower";
moves[0][1]= "90";
moves[0][2]= "95";
moves[0][3]= "fire";
moves[0][4]= "special";
moves[1][0]= "Earthquake";
moves[1][1]= "100";
moves[1][2]= "100";
moves[1][3]= "ground";
moves[1][4]= "physical";
moves[2][0]= "Air Slash";
moves[2][1]= "85";
moves[2][2]= "80";
moves[2][3]= "flying";
moves[2][4]= "special";
moves[3][0]= "Rock Slide";
moves[3][1]= "80";
moves[3][2]= "85";
moves[3][3]= "rock";
moves[3][4]= "physical";
}
}
class BlastoiseP extends PokemonP
{
BlastoiseP()
{
super(362,291,328,295,339,280,"water","null");
moves[0][0]= "Surf";
moves[0][1]= "95";
moves[0][2]= "90";
moves[0][3]= "water";
moves[0][4]= "special";
moves[1][0]= "Skull Bash";
moves[1][1]= "80";
moves[1][2]= "90";
moves[1][3]= "normal";
moves[1][4]= "physical";
moves[2][0]= "Ice Beam";
moves[2][1]= "95";
moves[2][2]= "95";
moves[2][3]= "ice";
moves[2][4]= "special";
moves[3][0]= "Earthquake";
moves[3][1]= "100";
moves[3][2]= "100";
moves[3][3]= "ground";
moves[3][4]= "physical";
}
}
class VenasaurP extends PokemonP
{
VenasaurP()
{
super(364,289,291,328,328,284,"grass","poison");
moves[0][0]= "Solar Beam";
moves[0][1]= "120";
moves[0][2]= "75";
moves[0][3]= "grass";
moves[0][4]= "special";
moves[1][0]= "Sludge Bomb";
moves[1][1]= "90";
moves[1][2]= "95";
moves[1][3]= "poison";
moves[1][4]= "special";
moves[2][0]="Wood Hammer";
moves[2][1]= "85";
moves[2][2]= "90";
moves[2][3]= "grass";
moves[2][4]= "physical";
moves[3][0]= "Bulldoze";
moves[3][1]= "60";
moves[3][2]= "100";
moves[3][3]= "ground";
moves[3][4]= "physical";
}
}
class FeraligatrP extends PokemonP
{
    static ArrayList<Attacks> attacks=new ArrayList<Attacks>();
FeraligatrP()
{
    
super(374,339,328,282,291,280,"water","null");
attacks.add(new Attacks("Hydro Pump",120,water));
moves[0][0]= "Hydro Pump";
moves[0][1]= "120";
moves[0][2]= "75";
moves[0][3]= "water";
moves[0][4]= "special";
moves[1][0]= "Superpower";
moves[1][1]= "120";
moves[1][2]= "80";
moves[1][3]= "fighting";
moves[1][4]= "physical";
moves[2][0]= "Ice Fang";
moves[2][1]= "65";
moves[2][2]= "90";
moves[2][3]= "ice";
moves[2][4]= "physical";
moves[3][0]= "Crunch";
moves[3][1]= "80";
moves[3][2]= "100";
moves[3][3]= "dark";
moves[3][4]= "physical";
}
}
class TyphlosionP extends PokemonP
{
    static ArrayList<Attacks> attacks=new ArrayList<Attacks>();
TyphlosionP()
{
super(360,293,280,348,295,328,"fire","null");

attacks.add(new Attacks("Body Slam",80,"normal",30));
/*moves[1][0]= "Body Slam";
moves[1][1]= "80";
moves[1][2]= "100";
moves[1][3]= "normal";
moves[1][4]= "physical";*/
attacks.add(new Attacks("Brick Break",75,"normal",26));
/*moves[2][0]= "Brick Break";
moves[2][1]= "75";
moves[2][2]= "100";
moves[2][3]= "fighting";
moves[2][4]= "physical";*/
attacks.add(new Attacks("Fire Punch",75,"fire",26));
/*moves[3][0]= "Fire Punch";
moves[3][1]= "75";
moves[3][2]= "100";
moves[3][3]= "fire";
moves[3][4]= "physical";*/
attacks.add(new Attacks("Fire Blast",500,"fire",40));
/*moves[0][0]= "Fire Blast";
moves[0][1]= "5000";
moves[0][2]= "75";
moves[0][3]= "fire";
moves[0][4]= "special";*/
}
}

class Attacks{
    String name;
    int damage;
    String type;
    int count;
    public Attacks(String name,int damage,String type,int count){        
        this.name=name;
        this.damage=damage;
        this.type=type;
        this.count=count;
    }
}