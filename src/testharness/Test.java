package testharness;

import foodmood.FoodMoodController;
import foodmood.food.Food;
import foodmood.login.LoginController;
import foodmood.mood.Mood;
import foodmood.navigation.NavigationController;
import foodmood.user.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
public class Test {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("User opens the application and is asked to login with an external service.");
        LoginController theLoginCntl = new LoginController();
        
        System.out.println("The user successfully logs in");
        theLoginCntl.login("username", "password");
        
        User theUser = theLoginCntl.getCurrentUser();
        
        System.out.println("The user is shown the navigation UI");
        NavigationController theNavCntl = new NavigationController();
        theNavCntl.showNavigationUI();
        FoodMoodController theFoodMoodCntl = theNavCntl.getFoodMoodController();
        
        System.out.println("The user is prompted to add their food and navigation is closed.");
        theFoodMoodCntl.showFoodUI();
        
        System.out.println("The food prompt is closed and the user is asked to enter their mood.");
        theFoodMoodCntl.showMoodUI();
        
        System.out.println("The user adds a new food that they consumed and the food");
        theFoodMoodCntl.userConsumedFood(new Mood(), theLoginCntl.getCurrentUser());
        
        System.out.println("The user is shown the navigation.");
        theNavCntl.showNavigationUI();
        
        System.out.println("The user views their food history");
        theFoodMoodCntl.showFoodHistoryUI();
        
        System.out.println("The user views a food correlation");
        theNavCntl.getAnalyticsController().showCorrelationChart(theUser.getFoodConsumed().get(0).getFoodList(), theUser);
        
        System.out.println("Then, the user returns back to the food history UI");
        theFoodMoodCntl.showFoodHistoryUI();
        
        System.out.println("Then, the user views a food relation");
        theNavCntl.getAnalyticsController().showRelationChart(theUser.getFoodConsumed().get(0).getFoodList().get(0), theUser);
        
        System.out.println("Then, the user returns to the main navigation");
        theNavCntl.showNavigationUI();
        
        System.out.println("And the user logs out");
        theUser.logout();
    }
    
}
