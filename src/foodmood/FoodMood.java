/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood;
import foodmood.login.*;
/**
 *
 * @author justin
 */
public class FoodMood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FoodMoodController foodMoodController = new FoodMoodController();
        LoginUI aUI = new LoginUI(new LoginController());
        aUI.setVisible(true);
    }
    
}
