package com;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class serviceImp {
     private ChuckNorrisQuotes  chuckNorrisQuotes;
     
     public serviceImp()
     {
    	 this.chuckNorrisQuotes = new ChuckNorrisQuotes();
     }
  public String getRJokes()
  {
	  return chuckNorrisQuotes.getRandomQuote();
  }
}
