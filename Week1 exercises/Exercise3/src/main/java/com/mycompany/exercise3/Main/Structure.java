/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercise3.Main;

/**
 *
 * @author Peter
 */
import java.util.HashMap;
import javax.persistence.Persistence;

public class Structure {

    public static void main(String[] args) {

        HashMap puproperties = new HashMap();

        puproperties.put("javax.persistence.sql-load-script-source", "Scripts/data.sql");
        Persistence.generateSchema("jpaPU", puproperties);

        puproperties.remove("javax.persistence.sql-load-script-source", "Scripts/data.sql");
        Persistence.generateSchema("jpaPU", puproperties);
    }

}
