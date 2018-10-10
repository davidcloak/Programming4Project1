/**
 * David Cloak
 * 
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner key = new Scanner(System.in);
        Sort sort = new Sort();
        TextRW rW = new TextRW();
        ArrayList[][] list = new ArrayList[1][4];//array of arrayLists for
        for(int x = 0; x < 4; x++){             //the players and points
            list[0][x] = new ArrayList();
        }
        
        String[] aPlayer = new String[4];//for new players being added
        String answer; // get answer to see if they want to add, get or sort

        
        String[] d = {"What is the name of the Player? (No spaces use _) Note that lower case letters Come last alphabetical"
                + "So make sure first letters are capital.", //ask for information need for player
            "How many baskets did they make?", "How many foul shots?", 
            "What is there total points"};//saves space in later code so it can be read easier


        do{
            answer = "yes"; //to start adding or to exit
            //menu 
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");//clears screan of clutter
            System.out.println("If you want to add a Player type \"Add\", if you"
                    + " want to get a list type \"List\". If your are done"
                    + " type \"exit\".");//asks what is wanted
            answer = key.next();
            if(answer.equalsIgnoreCase("list")){//if list
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");//clears screan of clutter
                //sees how they want it sorted
                System.out.println("Do you want the list sorted? If so type \"A\" for it"
                        + " to be alphabetical, \"B\" for Baskets,"
                        + " \"F\" for Fowl Shots, \"T\" for Total points.");
                answer = key.next();
                if(answer.equalsIgnoreCase("A")){//alphabetical
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");//clears screan of clutter
                    System.out.println("Name \t Baskets \t Fowl Shots \t Total Points");

                    sort.Alphabetical();//sorts it 

                    list = rW.Get();//gets the new list
                    for(int x = 0; x < list[0][0].size(); x++){//grints it out
                        for(int y = 0; y < list[0].length; y++){
                            System.out.print(list[0][y].get(x)+"\t\t"+ list[0][y+1].get(x)+
                                    "\t\t" + list[0][y+2].get(x)+ "\t\t" + list[0][y+3].get(x));

                            y +=4;
                            System.out.println("");
                        }
                    }
                }else if(answer.equalsIgnoreCase("B")){//by most Baskets
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");//clears screan of clutter
                    System.out.println("Name \t Baskets \t Fowl Shots \t Total Points");

                    sort.Baskets();//sorts

                    list = rW.Get();//gets the new list
                    for(int x = 0; x < list[0][0].size(); x++){//print it out
                        for(int y = 0; y < list[0].length; y++){
                            System.out.print(list[0][y].get(x)+"\t\t"+ list[0][y+1].get(x)+
                                    "\t\t" + list[0][y+2].get(x)+ "\t\t" + list[0][y+3].get(x));

                            y +=4;
                            System.out.println("");
                        }
                    }
                }else if(answer.equalsIgnoreCase("F")){// most fowl Shots
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");//clears screan of clutter
                    System.out.println("Name \t Baskets \t Fowl Shots \t Total Points");

                    sort.FowlShots();//sorts

                    list = rW.Get();//get new List
                    for(int x = 0; x < list[0][0].size(); x++){//prints it out
                        for(int y = 0; y < list[0].length; y++){
                            System.out.print(list[0][y].get(x)+"\t\t"+ list[0][y+1].get(x)+
                                    "\t\t" + list[0][y+2].get(x)+ "\t\t" + list[0][y+3].get(x));

                            y +=4;
                            System.out.println("");
                        }
                    }
                }else if(answer.equalsIgnoreCase("T")){//toatl points
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");//clears screan of clutter
                    System.out.println("Name \t Baskets \t Fowl Shots \t Total Points");

                    sort.TotalPoints();//sorts by most toatl points

                    list = rW.Get();//get new List
                    for(int x = 0; x < list[0][0].size(); x++){//prints it out
                        for(int y = 0; y < list[0].length; y++){
                            System.out.print(list[0][y].get(x)+"\t\t"+ list[0][y+1].get(x)+
                                    "\t\t" + list[0][y+2].get(x)+ "\t\t" + list[0][y+3].get(x));

                            y +=4;
                            System.out.println("");
                        }
                    }
                }
                System.out.println("When done viewing press any key then enter.");
                key.next(); // used to make some time

            }else if(answer.equalsIgnoreCase("Add")){//if they want to add
                answer = "yes";//gets it started
                while(answer.equalsIgnoreCase("yes") || !answer.equalsIgnoreCase("done") 
                    && !answer.equalsIgnoreCase("no")){//test to see if they want to add a player
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");//clears screan of clutter
                    for(int x = 0; x < d.length; x++){
                        System.out.println(d[x]);
                        aPlayer[x] = key.next();
                    }
                    System.out.println(rW.Add(aPlayer));//adds players to list
                    System.out.println("Would you like to add an other player if so type "
                            + "\"Yes\" if you are done type \"Done\"");//sees if they want to add more
                    answer = key.next();
                }
            }else if(answer.equalsIgnoreCase("exit")){//just to make sure all is good
                answer = "exit";
            }
        
            
        }while(!answer.equals("exit"));

    }  
}

/**
 * The big Plan
 * A 2D arrayList then it can be sorted by setting one value and Ex.[x][2] then
 * running thought the rest to search how they want.
 */

/**
 * BufferedWriters are not needed unless adding something so if just reading
 * its not needed to read to the text document with bufferReader.
 */

//https://www.mkyong.com/java/java-convert-string-to-int/