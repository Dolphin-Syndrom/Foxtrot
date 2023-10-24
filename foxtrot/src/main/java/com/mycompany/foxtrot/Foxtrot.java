/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.foxtrot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Foxtrot extends JFrame{
	JButton viewButton = new JButton();
	JButton BuyButton = new JButton();
	JButton SellButton = new JButton();
	JButton convertButton = new JButton();
	JButton exitButton = new JButton();
	public static void main(String args[]){
	new Foxtrot().show();
	}
	public Foxtrot(){
	setTitle("Stock Market Management System");
	getContentPane().setLayout(new GridBagLayout());
	GridBagConstraints gridConstraints = new GridBagConstraints();
        
        
	
	viewButton.setText("View");
	gridConstraints.gridx = 0;
	gridConstraints.gridy = 0;
	getContentPane().add(viewButton, gridConstraints);

	BuyButton.setText("Buy");
	gridConstraints.gridx = 0;
	gridConstraints.gridy = 1;
	getContentPane().add(BuyButton, gridConstraints);
	
 	SellButton.setText("Sell");
	gridConstraints.gridx = 0;
	gridConstraints.gridy = 2;
	getContentPane().add(SellButton, gridConstraints);
	
	convertButton.setText("Convert Currency");
	gridConstraints.gridx = 0;
	gridConstraints.gridy = 3;
	getContentPane().add(convertButton, gridConstraints);
	
	exitButton.setText("Exit");
	gridConstraints.gridx = 0;
	gridConstraints.gridy = 4;
	getContentPane().add(exitButton, gridConstraints);
	
	pack();
	}
}