//RPG Intro_draft1
package game;
import java.util.*;

public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kbd = new Scanner(System.in);
     
        Continue();
        HerosName();
        PlayerCustomization();
    }
    
    public static void HerosName()
    {
        Scanner kbd = new Scanner(System.in);
        String herosName;
        String herosNameCheck;
        do{
        System.out.println(">>ENTER HEROS NAME<<");
        herosName = kbd.nextLine();
        clearScreen();
        System.out.println(">>YOU ENTERED "+herosName+" IS THAT CORRECT?");
        herosNameCheck = kbd.nextLine();
        }while(!(herosNameCheck.equalsIgnoreCase("y"))&&(!(herosNameCheck.equalsIgnoreCase("yes"))));
        clearScreen();
        
    }
    public static void PlayerCustomization()
    {
        Scanner kbd = new Scanner(System.in);
        System.out.println(">>YOU WILL NOW PICK A PRIMARY WEAPON>>");
        Continue();
        int i;
        String[] weapons = {"AXE","BOW AND ARROW","SWORD","MACE"};
        String weaponSelection = "";
    
            do{
              System.out.println(">>SELECT A PRIMARY WEAPON<<");
              for(i=0;i<weapons.length;i++){
              System.out.println(i+1+" "+weapons[i]);
              }
              clearScreen();
              weaponSelection = kbd.nextLine();
            
              if(weaponSelection.equalsIgnoreCase(weapons[0]))
                System.out.println(">>AHH, THE AXE THE WEAPON OF BRUT FORCE");
              else if(weaponSelection.equalsIgnoreCase(weapons[1]))
                System.out.println(">>THE BOW AND ARROW, A RATHER NOBLE CHOICE.");
              else if(weaponSelection.equalsIgnoreCase(weapons[2]))
                System.out.println(">>THE CHOICE WEAPON OF A LEADER.");
              else if(weaponSelection.equalsIgnoreCase(weapons[3]))
                System.out.println(">>A MAN OF GREAT STRENGTH MUST YOU BE TO WIELD THIS WEAPON");
              else
                System.out.println(">>INVALID SLECTION ");
            }while(!(weaponSelection.equalsIgnoreCase(weapons[0]))&&(!(weaponSelection.equalsIgnoreCase(weapons[1])))&&
                (!(weaponSelection.equalsIgnoreCase(weapons[2]))) && (!(weaponSelection.equalsIgnoreCase(weapons[3]))));
            clearScreen();
            
            int j;
            String[] secWeapons = {"SICKLE","THROWING DAGGERS","SAWED OFF","SIX-SHOOTER"};
            String secWeaponSelection = "";
    
            do{
              System.out.println(">>SELECT A SECONDARY WEAPON<<");
              for(j=0;j<secWeapons.length;j++){
                System.out.println(j+1+" "+secWeapons[j]);
              }
              clearScreen();
              secWeaponSelection = kbd.nextLine();
            
              if(secWeaponSelection.equalsIgnoreCase(secWeapons[0]))
                System.out.println(">>PROVIDES A RATHER CLEAN CUT<<");
              else if(secWeaponSelection.equalsIgnoreCase(weapons[1]))
                System.out.println(">>A WEAPON OF GREAT PERCISION<<");
              else if(secWeaponSelection.equalsIgnoreCase(secWeapons[2]))
                System.out.println(">>QUITE THE GORY CHOICE<<");
              else if(secWeaponSelection.equalsIgnoreCase(secWeapons[3]))
                System.out.println(">>YOU MUST BE A GUN GUY..<<");
              else
              System.out.println(">>INVALID SLECTION ");
            }while(!(secWeaponSelection.equalsIgnoreCase(secWeapons[0]))&&(!(secWeaponSelection.equalsIgnoreCase(secWeapons[1]))&&
            (!(secWeaponSelection.equalsIgnoreCase(secWeapons[2]))) &&(!(secWeaponSelection.equalsIgnoreCase(secWeapons[3]))));
    }
    public static void Continue()
    {
        Scanner kbd = new Scanner(System.in);
        String cont = "";
        do{
            System.out.println(">>PRESS ENTER TO CONTINUE<<");
        }while(!(cont.equals(kbd.nextLine())));
        clearScreen();
    }
    public static void clearScreen()//clear screen method for user
     {
        for(int i=0; i<3; i++)
        {
          System.out.println("");
        }
     }
}

