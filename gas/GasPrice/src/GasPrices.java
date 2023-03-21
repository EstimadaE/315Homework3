
import java.io.*;
import java.util.ArrayList;
 
class GasPrices {

    int month;
    int day;
    int year;
    float price;
    
    GasPrices(int mm, int dd, int yyyy, float p)
    {
        month = mm;
        day = dd;
        year = yyyy;
        price = p;
    }


    //getPrices/month/day/year
    


    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<GasPrices> s = new ArrayList();
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\Eli.Eli\\Desktop\\Spring 2023\\330A3\\GasPrice.txt"));
         
        


        /*Put everything into array -> split all strings in array 
         * 
         * split text:the -> {text, the} : {} .split(:|\\-) {mm,dd,yyyy,price}
         * arr[0][0-3]
        */
       

        String st;
       
            while ((st = br.readLine()) != null) {
            // SPlit
            String[] temp;
            temp = st.split("[:-]");
            int mm = Integer.parseInt(temp[0]);
            int dd = Integer.parseInt(temp[1]);
            int yyyy = Integer.parseInt(temp[2]); 
            float p = Float.parseFloat(temp[3]);

            s.add (new GasPrices(mm,dd,yyyy,p));      
            
            
            
            }

            /*Add Process 
             * public static <T extends Object & Comparable<? super T>>
             * SORTING to lowest to high
             * compare just prices for each one
             * Collections.sort(s,  (gas1,gas2)->. Integer.compare(gas1.getPrice,  gas2.getPrice()))
             * 
            */


            
            }
            catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

    }
}




