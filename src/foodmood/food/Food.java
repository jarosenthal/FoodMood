/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood.food;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author justin
 */
public class Food implements Serializable {

    private final String name;
    private final long timestamp;

    /**
     * The default constructor
     *
     * @param name The name parameter
     */
    public Food(String name) {
        this.timestamp = System.currentTimeMillis();
        this.name = name;
    }

    /**
     * Returns the name of the food
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    public long getTimeAdded() {
        return timestamp;
    }

    public String getDateAdded() {
        Date date = new Date(timestamp);
        return date.toString();
    }
}
