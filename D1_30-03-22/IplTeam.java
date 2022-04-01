import java.util.*;


public class IplTeam {

    public static void main(String args[]) {
        // TODO Auto-generated method stub
        String team="RCB";
        String p_name ="Om Patel";
        Scanner sc = new Scanner(System.in);
        int wickets = sc.nextInt();
        int run = sc.nextInt();
        if(wickets >= 3 && run >= 50) {
            //show details
            System.out.println("Man of the match");	
            System.out.println("Team p_name: "+team);
            System.out.println("Player p_name: "+p_name);		
        }
        else{
            System.out.println("Better Luck Next time");
        }
        sc.close();
        
    }
}
    

