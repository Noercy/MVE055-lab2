import java.util.ArrayList;
import java.util.Random;


public class lab2math {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            ArrayList<Integer> browserHistory = new ArrayList<Integer>();
            int pageNr = 1; // start on page 1 

            browserHistory.add(pageNr);
            browserHistory = Traversal(browserHistory, pageNr);
            pageNr = browserHistory.get(browserHistory.size() - 1);
            System.out.println(browserHistory);
           
        }
    } 
    

    static ArrayList<Integer> Traversal (ArrayList<Integer> browserHistory ,int pageNr) {
        // assuming the dampening factor is 0 (lambda)

        Random random = new Random();
        int browserHistoryMax = 10; 
       
        while (browserHistory.size() < browserHistoryMax) {
            int randomRoll;
            if(pageNr == 1) {
                randomRoll = random.nextInt(4-2)+2;
            } else if(pageNr == 2) {
                randomRoll = random.nextInt(4-3)+3;  
            } else if(pageNr == 4) {
                randomRoll = random.nextInt(1);  
                if (randomRoll == 1) {
                    randomRoll = 1;
                } else {
                    randomRoll = 3;
                }
            } else {
                randomRoll = 1; 
            }
            browserHistory.add(randomRoll);
            pageNr = randomRoll;
        }
        return browserHistory;
    }
}
