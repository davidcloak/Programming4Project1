/**
 *
 * @author 991804645
 */
import java.io.*;
import java.util.ArrayList;
public class TextRW {
    private File file = new File ("Z:\\Programming 4\\text docs\\Stat Reporter\\text.txt");
    
    TextRW(){
    }
    
    public ArrayList[][] Get() throws IOException{
        ArrayList[][] printO = new ArrayList[1][4];
        for(int x = 0; x < 4; x++){
            printO[0][x] = new ArrayList();
        }
        
        File file = new File ("Z:\\Programming 4\\text docs\\Stat Reporter\\text.txt");
        
        BufferedReader in = new BufferedReader(new FileReader(file));
        String test = "";
        for(int x = 0; x != -1; x++){//to set value to space
            for(int y = 0; y < 4; y++){
                test = in.readLine();//get value
                if(test == null){//test to see if its there
                    x = -2;//-2 because it adds one at end
                }else{
                    printO[0][y].add(x, test);
                }
            }
        }
        in.close();
        return printO;
    }
    
    public String Add(String[] a) throws IOException{
        //makes an array of Array list
        ArrayList[][] printO = new ArrayList[1][4];
        printO = Get();
        
        String test = "";
        File file = new File ("Z:\\Programming 4\\text docs\\Stat Reporter\\text.txt");
        BufferedWriter out = new BufferedWriter(new FileWriter(file)); 
        
        //Needs to add the add part also use get
        printO[0][0].add(a[0]);
        printO[0][1].add(a[1]);
        printO[0][2].add(a[2]);
        printO[0][3].add(a[3]);
        
        for(int x = 0; x < printO[0][0].size(); x++){//adds it all back to
            for(int y = 0; y < printO[0].length; y++){// the text doc.
                out.write((String) printO[0][y].get(x));
                
                out.newLine();
            }
        }
        
        out.close();
        return "finished";
    }
    
    public void Rewrite(ArrayList[][] a) throws IOException{//used for sorting
        //makes an array of Array list
        ArrayList[][] printO = new ArrayList[1][4];
        printO = a;//sets it
        
        File file = new File ("Z:\\Programming 4\\text docs\\Stat Reporter\\text.txt");
        BufferedWriter out = new BufferedWriter(new FileWriter(file)); 
        
        for(int x = 0; x < printO[0][0].size(); x++){//adds it all back to
            for(int y = 0; y < printO[0].length; y++){// the text doc.
                out.write((String) printO[0][y].get(x));
                
                out.newLine();
            }
        }
        
        out.close();
    }
}
