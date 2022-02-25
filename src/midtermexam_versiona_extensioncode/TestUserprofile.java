package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserprofile extends UserProfile{
    
    

    public static void main(String[] args) {
        UserProfile up = new UserProfile();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        
        up.setUserID(name);
        
        System.out.println("Choose your favourite Genre from a displayed list");
        System.out.println("Comedy, " + "Drama, "+ "Action, "+ "Mystery, ");
        String genre = sc.nextLine();
        up.setGenre(genre);
        
        System.out.println("userProfile was created: "+up.getUserID()+"+"+up.getGenre());
        
    }
        
        
    

    

    

}
