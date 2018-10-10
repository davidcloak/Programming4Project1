
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author 991804645
 */
public class Sort {

    Sort(){
    }
    
    public void Alphabetical() throws IOException{
        TextRW re = new TextRW();
        //they are strings in case there is a same first letter
        String comp1;//turns it into strings so that we can get the char
        String comp2;//turns it into strings so that we can get the char
        char temp1;
        char temp2;
        String sTemp;//used as a temp thats not need comared
        ArrayList[][] tempList = new ArrayList[1][4];
        tempList = re.Get();

        //used to make sure all is in right place
        for(int i = 0; i < tempList[0][0].size()+tempList[0][0].size()/2; i++){
            for(int x = 0; x < tempList[0][0].size()-1; x++){//run through names
                temp1 = (comp1 = (String) tempList[0][0].get(x)).charAt(0);
                temp2 = (comp2 = (String) tempList[0][0].get(x+1)).charAt(0);
                 
                if(temp1 > temp2){//compares
                    for(int y = 0; y < 4; y++){
                        sTemp = (String) tempList[0][y].get(x);
                        tempList[0][y].set(x, tempList[0][y].get(x+1));
                        tempList[0][y].set(x+1, sTemp);
                    }
                }
                
            }
        }
        re.Rewrite(tempList);//rewrites to file
    }
    
    //mostly reused code from alphebet little changes to work
    public void Baskets() throws IOException{
        TextRW re = new TextRW();
        //they are strings in case there is a same first letter
        int comp1;//used to compare the points
        int comp2;//used to compare the points
                                        
        String sTemp;//used as a temp thats not need comared
        ArrayList[][] tempList = new ArrayList[1][4];
        tempList = re.Get();

        //used to make sure all is in right place
        for(int i = 0; i < tempList[0][0].size()+tempList[0][0].size()/2; i++){
            for(int x = 0; x < tempList[0][0].size()-1; x++){//run through names
                comp1 = Integer.parseInt( (String) tempList[0][1].get(x));
                comp2 = Integer.parseInt((String) tempList[0][1].get(x+1));
                 
                if(comp1 < comp2){//compares
                    for(int y = 0; y < 4; y++){
                        sTemp = (String) tempList[0][y].get(x);
                        tempList[0][y].set(x, tempList[0][y].get(x+1));
                        tempList[0][y].set(x+1, sTemp);
                    }
                }
                
            }
        }
        re.Rewrite(tempList);//rewrites to file
    }
    
    
    //mostly reused code from alphebet little changes to work
    public void FowlShots() throws IOException{
        TextRW re = new TextRW();
        //they are strings in case there is a same first letter
        int comp1;//used to compare the points
        int comp2;//used to compare the points
                                        
        String sTemp;//used as a temp thats not need comared
        ArrayList[][] tempList = new ArrayList[1][4];
        tempList = re.Get();

        //used to make sure all is in right place
        for(int i = 0; i < tempList[0][0].size()+tempList[0][0].size()/2; i++){
            for(int x = 0; x < tempList[0][0].size()-1; x++){//run through names
                comp1 = Integer.parseInt( (String) tempList[0][2].get(x));
                comp2 = Integer.parseInt((String) tempList[0][2].get(x+1));
                 
                if(comp1 < comp2){//compares
                    for(int y = 0; y < 4; y++){
                        sTemp = (String) tempList[0][y].get(x);
                        tempList[0][y].set(x, tempList[0][y].get(x+1));
                        tempList[0][y].set(x+1, sTemp);
                    }
                }
                
            }
        }
        re.Rewrite(tempList);//rewrites to file
    }
    
    
    //mostly reused code from alphebet little changes to work
    public void TotalPoints() throws IOException{
        TextRW re = new TextRW();
        //they are strings in case there is a same first letter
        int comp1;//used to compare the points
        int comp2;//used to compare the points
                                        
        String sTemp;//used as a temp thats not need comared
        ArrayList[][] tempList = new ArrayList[1][4];
        tempList = re.Get();

        //used to make sure all is in right place
        for(int i = 0; i < tempList[0][0].size()+tempList[0][0].size()/2; i++){
            for(int x = 0; x < tempList[0][0].size()-1; x++){//run through names
                comp1 = Integer.parseInt( (String) tempList[0][3].get(x));
                comp2 = Integer.parseInt((String) tempList[0][3].get(x+1));
                 
                if(comp1 < comp2){//compares
                    for(int y = 0; y < 4; y++){
                        sTemp = (String) tempList[0][y].get(x);
                        tempList[0][y].set(x, tempList[0][y].get(x+1));
                        tempList[0][y].set(x+1, sTemp);
                    }
                }
                
            }
        }
        re.Rewrite(tempList);//rewrites to file
    }
}    
