import java.io.IOException;
import java.util.Scanner;  // Import the Scanner class

public class TriangleSolver {

        int blocks = 0;

        public int getBlocks(String heightString){


            int height = Integer.parseInt(heightString);


            do{
                blocks = blocks + height;
                height = height-1;
            }
            while(height != 0);

            return blocks;
        }

        public int getStringToInteger(String s){
            int number = 0;
            try{
                number = Integer.parseInt(s);
            }
            catch(NumberFormatException e){
                e.printStackTrace();
            }
            finally {
                System.out.println("the try and catch is completed");
            }
            return number;
        }

        public static void main(String[] args) throws IOException
        {
            System.out.println("Wie hoch soll die Pyramide werden? Der Algorithmus berrechnet wie viele Bloecke es braucht.");

            TriangleSolver triangleSolver = new TriangleSolver();

            int height;

            Scanner scs = new Scanner (System.in);
            String heightString = scs.nextLine();


            // int height = triangleSolver.getStringToInteger(heightString);

            int blocksOutput = triangleSolver.getBlocks(heightString);

            System.out.println("Anzahl Bloecke " + blocksOutput);
        }
    }
