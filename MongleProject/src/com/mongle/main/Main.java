package com.mongle.main;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.mongle.database.DataBase;
import com.mongle.yourapp.LogIn;
import com.mongle.yourapp.SignUp;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		DataBase.dataLoad();
<<<<<<< HEAD
		//LogIn.LogIn();
		//MainMenu.MainMenu();
		SignUp.signUp();
=======
		LogIn.LogIn();
		//MainMenu.MainMenu();
		//SignUp.signUp();
>>>>>>> origin/05
		DataBase.dataSave();
		
		
		
		
		
		
		
		
		
		
	}//main
}
