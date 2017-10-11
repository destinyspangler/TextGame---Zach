import java.util.Scanner;
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LegendOfSelda
{
    static int currentRoom;
    
    static String playerName;
    static int playerHealth;
    
    static boolean machete;
    
    static boolean iceSword;
    static int iceSwordLocation;
    
    static boolean woolCoat;
    static int woolCoatLocation;
    
    static boolean torch;
    static int torchLocation;
    static boolean torchOn;
    
    static int turnsTaken;
    
    static boolean fireSalts;
    static int fireSaltsLocation;
    
    static boolean tridentOfPoseidon;
    static int tridentOfPoseidonLocation;
    
    static boolean giantBolt;
    static int giantBoltLocation;
    
    static boolean xBow;
    static int xBowLocation;
    
    static boolean baboons;
    static int baboonsHealth;
    
    static boolean yeti;
    static int yetiHealth;
    
    static boolean flameAtronach;
    static int flameAtronachHealth;
    
    static boolean megaladon;
    static int megaladonHealth;
    
    static boolean godzilla;
    static int godzillaHealth;
    
    static boolean dragon;
    static int dragonHealth;
    
    public static void main(String[] args)
    {
        boolean run = true;
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Do you want to begin your journey? ");
            String response = sc.next().toLowerCase();
            if( response.equals("begin") || response.equals("start"))
            {
                startGame();
                run = false;
            }
            else if( response.equals("quit"))
            {
                run = false;
            }
            else
            {
                System.out.println("Error! Input not understood!");
            }
        }while(run);
    }
    public static void init()
    {
        System.out.print( "What is your name? ");
        Scanner sc = new Scanner(System.in);
        String playerName = sc.nextLine();
        
        playerHealth = 100;
        
        currentRoom = 1;
        
        machete = true;
        
        iceSword = false;
        iceSwordLocation = 3;
        
        woolCoat = false;
        woolCoatLocation = 2;
        
        torch = false;
        torchLocation = 2;
        torchOn = false;
        
        turnsTaken = 0;
        
        fireSalts = false;
        fireSaltsLocation = 4;
        
        tridentOfPoseidon = false;
        tridentOfPoseidonLocation = 5;
        
        giantBolt = false;
        giantBoltLocation = 6;
        
        xBow = false;
        xBowLocation = 7;
        
        baboons = true;
        baboonsHealth = 10;
        
        yeti = true;
        yetiHealth = 20;
        
        flameAtronach = true;
        flameAtronachHealth = 30;
        
        megaladon = true;
        megaladonHealth = 40;
        
        godzilla = true;
        godzillaHealth = 50;
        
        dragon = true;
        dragonHealth = 60;
    }
    public static void displayInventory()
    {
        if (machete)
            System.out.println("You have a simple machete");
        if (torch)
        {
            System.out.println("You a torch. Should be helpful when searching.");
            if (torchOn)
                System.out.println("The flames prevent you from becoming too cold.");
            else if (!torchOn)
                System.out.println();
        }
        if (iceSword)
        {
            System.out.println("You have an icy enchanted sword that is cool to the touch.");
            if(torchOn)
                System.out.println("The flames of your torch seem to shy away from the blade");
        }
        if (woolCoat)
        {
            System.out.println( "You have a warm wool coat.");
        }
        if (fireSalts)
        {
            System.out.println( "You firesalts that are scorching hot. You have to carry them in a protective bag. The bag is warm to the touch.");
        }
        if (tridentOfPoseidon)
        {
            System.out.println( "You have trident. When your touching it, you can feel the water around you as if it were an extension of yourself.");
        }
        if (giantBolt)
        {
            System.out.println( "You have giant bolt that you don't quite understand the use of.");
        }
    }
        public static void displayIntro()
    {
        System.out.println("You have intered a Dark and mysterious hallway. You find a machete and place it in your pack.");
        System.out.println("There is a big door with a sign that says keep out.");
        System.out.println("For now, all commands are limited to one word at a time.");

        System.out.println();
        System.out.println();
    }
    public static void displayCurrentRoom()
    {
        switch( currentRoom )
        {
            case 1: // Hallway
            {
                System.out.println("You have intered a Dark and mysterious hallway. You find a machete and place it in your pack.");
                System.out.println("There is a big door with a sign that says keep out..");
                System.out.println("You see a torch and near the torch is a weird looking door.");
                break;
            }
            case 2: // Jungle
            {
                System.out.println("You are in what appears to be a jungle, and in the distance.");
                System.out.println("You can make out what looks like a congress of Baboons .");
                
                if( !baboons )
                {
                    System.out.println("Because you are smart, you skin the Baboons and create a Babooned skin coat.");
                }
              
                break;
            }
            case 3: // Frozen Tundra
            {
                System.out.println("You are now in the Frozen Tundra. Boy aren't you glad you have a wool coat.");
                if( !yeti )
                {
                    System.out.println(" Congrats, you beat the Yeti, but wait there is an Ice Sword in the distace.");
                    System.out.println(" Also there is another one of those doors, of course you go inside.");
                }
                break;
            }
            case 4: // Volcanic
            {
                System.out.println("You have entered into the heart of a volcano, and you think you would be dead from all the lava.");
                System.out.println("But your Ice Sword seems to shield you from all the heat and lava.");
                if( !flameAtronach )
                {
                    System.out.println( "You beat the Flame Atronach and you notice a strange residue on the body.");
                    System.out.println( "Not learning your lesson the last couple times you go into the mysterious door once again.");
                }
                break;
            }
            case 5: // Ocean
            {
                System.out.println("You are in the middle of an Ocean and you make a Scientific discovey the Megaladon still exists.");
                System.out.println(" The only bad news is that it is heading strait for you!");
                if ( !megaladon )
                {
                    System.out.println("Good thinking on using the Fire Salts and cooking the Megaladon.");
                    System.out.println("Hey, you found the Trident Of Poseidon");
                }
                break;
            }
            case 6: // Tokyo
            {
                System.out.println("You are in Tokyo.");
                System.out.println("Is that Godzilla?");
                if(!godzilla)
                System.out.println("What is that strange bolt over there?");
                break;
            }
            case 7: // Endless Forest
            {
                System.out.println("You have entered an Endless Forest.");
                System.out.println("Oops, you awoke the dragon"); 
                if( xBow )
                {
                    System.out.println("You have found a X-Bow.");
                }
                break;
            }
            default:
            {
                System.out.println("You have some how gone into a room that does not exist."); 
                break;
            }
        }
    }
    public static void startGame()
    {
        displayIntro();
        
        init();
        
        displayCurrentRoom();
        
        boolean menu = true;
        do
        {
            Scanner sc = new Scanner(System.in);
            
            String getAction = sc.next().toLowerCase();
            
            switch( getAction )
            {
                case "inventory":
                {
                    displayInventory();
                    break;
                }
                case "look":
                {
                    displayCurrentRoom();
                    break;
                }
                case "take":
                case "get":
                {
                    takeItem();
                    break;
                }
                case "n":
                case "north":
                case "s":
                case "south":
                case "e":
                case "east":
                case "w":
                case "west":
                {
                    move( getAction );
                    break;
                }
                
                case "go":
                case "walk":
                case "run":
                case "jog":
                {
                    System.out.println("Which direction do you want to " + getAction + "?");
                    break;
                }
                
                case "quit":
                {
                    menu = false;
                    break;
                }
                
                default:
                {
                    System.out.println("Error! Command not understood.");
                    break;
                }

            }
            
            System.out.println();
        }while( menu );
    }
    public static void takeItem()
    {
       System.out.print("What item would you like to take?");
       Scanner sc = new Scanner(System.in);
       String item = sc.nextLine().toLowerCase();
       
       switch(item)
       {
           case "sword":
           {
               if (currentRoom==3)
               {
               iceSword = true;
               System.out.println("Ice Sword has been added to your inventory");
            }
               else
               {
               System.out.println("There is no item to take");
            }
            break;
            }
           case "residue":
           {
               if (currentRoom==4)
               {
               fireSalts = true;
               System.out.println("Fire Salts have been added to your inventory");
               
            }
               else
               {
               System.out.println("There is no item to take");
            }
           }
            case "torch":
            {
                if (currentRoom==1)
                {
                    torch = true;
                    System.out.println("The torch has been added to your inventory");
                }
                else
                {
                  System.out.println("There is no item to take");
                }
                break;
            }
            case "wool coat":
            {
                if (currentRoom==2)
                {
                    woolCoat = true;
                    System.out.println("The wool coat has been added to your inventory");
                    
                }
                else
                {
                  System.out.println("There is no item to take");
                }
                break;
            }
            case "trident":
            {
                if (currentRoom==5)
                {
                tridentOfPoseidon = true;
                System.out.println("Trident of Poseidon has been added to your inventory");
            }
                else
                {
                  System.out.println("There is no item to take");
                }
            break;
            }
            case "bolt":
            {
                if (currentRoom==6)
                {
                    giantBolt = true;
                    System.out.println("Giant bolt has been added to your inventory");
                }
                else
                {
                  System.out.println("There is no item to take");
                }
                break;
            }
            default:
            {
                System.out.println("There is no item to take");
                break;
            }
          
        }
            
       
    }
        public static boolean canMove( String direction )
    {
        switch( currentRoom )
        {
            case 1: // Can only move north from this room
            {
                if(direction.equals("n") || direction.equals("north"))
                    return true;
                else
                    return false;
            }
            case 2: // Can only move south from this room
            {
                if(direction.equals("e") || direction.equals("east"))
                    return true;
                else
                    return false;
            }
            case 3: // Can only move south from this room
            {
                if(direction.equals("s") || direction.equals("south"))
                    return true;
                else
                    return false;
            }
            case 4: // Can only move south from this room
            {
                if(direction.equals("s") || direction.equals("south"))
                    return true;
                else
                    return false;
            }
            case 5: // Can only move south from this room
            {
                if(direction.equals("w") || direction.equals("west"))
                    return true;
                else
                    return false;
            }
            case 6: // Can only move south from this room
            {
                if(direction.equals("w") || direction.equals("west"))
                    return true;
                else
                    return false;
            }
            case 7: // Can only move south from this room
            {
                if(direction.equals("n") || direction.equals("north"))
                    return true;
                else
                    return false;
            }
            default:
            {
                return false;
            }
        }
    }
    public static void move(String direction)
    {
        if( canMove(direction) )
        {
            switch(currentRoom)
            {
                case 1: // starting room
                {
                    if( direction.equals("n") || direction.equals("north") )
                    {
                        currentRoom = 2;
                    }
                    
                    break;
                }
                case 2: // cave entrance
                {
                    if( direction.equals("s") || direction.equals("south") )
                    {
                        currentRoom = 1;
                    }
                    else if( direction.equals("e") || direction.equals("east"))
                    {
                        currentRoom = 3;
                    }
                    break;
                }
                    case 3: // cave entrance
                {
                    if( direction.equals("w") || direction.equals("west") )
                    {
                        currentRoom = 2;
                    }
                    if( direction.equals("s") || direction.equals("south"))
                    {
                        currentRoom = 4;
                    }
                    break;
                }
                case 4: // cave entrance
                {
                    if( direction.equals("n") || direction.equals("north") )
                    {
                        currentRoom = 3;
                    }
                    if( direction.equals("s") || direction.equals("south"))
                    {
                        currentRoom = 5;
                    }
                    break;
                }
                case 5: // cave entrance
                {
                    if( direction.equals("n") || direction.equals("north") )
                    {
                        currentRoom = 4;
                    }
                    if( direction.equals("w") || direction.equals("west"))
                    {
                        currentRoom = 6;
                    }
                    break;
                }
                case 6: // cave entrance
                {
                    if( direction.equals("e") || direction.equals("east") )
                    {
                        currentRoom = 5;
                    }
                    if( direction.equals("w") || direction.equals("west"))
                    {
                        currentRoom = 7;
                    }
                    break;
                }
                case 7: // cave entrance
                {
                    if( direction.equals("e") || direction.equals("east") )
                    {
                        currentRoom = 5;
                    }
                    if( direction.equals("n") || direction.equals("north"))
                    
                        
                    
                    break;
                }
                default:
                {
                    break;
                }
            }
        }
        else
        {
            System.out.println("You cannot move in that direction.");
        }
        
        displayCurrentRoom();
    }

}



