/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesinvoicegenerator.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DELL
 */
public class ActionHandler implements ActionListener{
    
   

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action Handling Called");
        switch(e.getActionCommand()){
            case "Create New Invoice":
                System.out.println("Create New Invoice");
                
                break;
                case "Delete Invoice":
                    System.out.println("Delete Invoice");
                    break;
                    case "Add Item":
                        System.out.println("Add Item");
                    break;
                    case "Cancel":
                        System.out.println("Item deleted !");
                    break;
                    case "Load Files":
                        System.out.println("Load Files");
                        break;
                    case "Save Files":
                        System.out.println("Save Files");
                        
                        
                        break;
                        case "Save new invoice":
                            System.out.println("Save new invoice");
                            break;
                            
                    
                    
                    
                    
                    
                    
        }
    }
    
}

