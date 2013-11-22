
package com.eecs.seg2505_2013;

import java.util.*;
import java.io.*;


public class Evaluation {
	
	private int score;
	private Object user;
	private String reponse;
	
	public Evaluation(int rating, Object user, String reponse)
	{
		if{0<rating>6}
		{
		this.score=rating;
		}else{
			throw new IllegalArgumentException("The score summited has to be between 1-5");
		}
		
		this.user= user;
		this.reponse = reponse;
		
	}
	public int changeScore()
	{
		rating = rating + Utilisateur.getPoints();
		return rating;
	}
	

}
