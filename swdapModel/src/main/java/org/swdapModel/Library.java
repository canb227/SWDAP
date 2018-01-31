package org.swdapModel;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
  
  ArrayList<Set> sets;
  ArrayList<Card> cards;
  
  public Library(Card[] cards) {
    this.cards = new ArrayList<Card>(Arrays.asList(cards));
  }
  public ArrayList<Set> getSets() {
    return sets;
  }
  public void setSets(ArrayList<Set> sets) {
    this.sets = sets;
  }
  public ArrayList<Card> getCards() {
    return cards;
  }
  public void setCards(ArrayList<Card> cards) {
    this.cards = cards;
  }
  
  public ArrayList<Card> searchCards(String query)
  {
    ArrayList<Card> results = new ArrayList<Card>();
    return results;
    
  }

}
