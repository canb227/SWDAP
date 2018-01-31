
package org.swdapParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import org.swdapModel.Card;
import org.swdapParser.swdestinydbParser.CardDeserializer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;

/**
 * Hello world!
 *
 */
public class ParserApp {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    FileReader cardsFile = null;
    try {
      cardsFile = loadJson("library/cards.json");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    GsonBuilder gsonBuilder = new GsonBuilder();

    JsonDeserializer<Card> deserializer = new CardDeserializer();
    gsonBuilder.registerTypeAdapter(Card.class, deserializer);

    Gson customGson = gsonBuilder.create();

    Card[] cards = customGson.fromJson(cardsFile, Card[].class);
    
    System.out.println(cards[0].getName());
  }

  private static FileReader loadJson(String fileName) throws FileNotFoundException {
    ParserApp.class.getClassLoader().getResource(fileName).getFile();
    File file = new File(ParserApp.class.getClassLoader().getResource(fileName).getFile());
    return new FileReader(file);

  }
}