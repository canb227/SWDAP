package org.swdapModel;

import java.net.URL;

import org.swdapModel.enums.Affiliation;
import org.swdapModel.enums.Faction;
import org.swdapModel.enums.Rarity;
import org.swdapModel.enums.Type;

public class Card {
  String name;
  Set set;
  Type type;
  Affiliation affil;
  Faction faction;
  Rarity rarity;

  CardDie die;

  URL cardImage;
  String subtitle;

  int health;
  int points;
  int ePoints;
  int cost;
  int positionInSet;

  String subtype;
  String code;
  String text;
  String flavor;
  
  String passive;
  String action;
  String powerAction;
  String special;

  boolean has_Die;
  boolean is_unique;
  boolean has_errata;
  
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Set getSet() {
    return set;
  }
  public void setSet(Set set) {
    this.set = set;
  }
  public Type getType() {
    return type;
  }
  public void setType(Type type) {
    this.type = type;
  }
  public Affiliation getAffil() {
    return affil;
  }
  public void setAffil(Affiliation affil) {
    this.affil = affil;
  }
  public Faction getFaction() {
    return faction;
  }
  public void setFaction(Faction faction) {
    this.faction = faction;
  }
  public Rarity getRarity() {
    return rarity;
  }
  public void setRarity(Rarity rarity) {
    this.rarity = rarity;
  }
  public CardDie getDie() {
    return die;
  }
  public void setDie(CardDie die) {
    this.die = die;
  }
  public String getSubtitle() {
    return subtitle;
  }
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }
  public int getHealth() {
    return health;
  }
  public void setHealth(int health) {
    this.health = health;
  }
  public int getPoints() {
    return points;
  }
  public void setPoints(int points) {
    this.points = points;
  }
  public int getePoints() {
    return ePoints;
  }
  public void setePoints(int ePoints) {
    this.ePoints = ePoints;
  }
  public int getCost() {
    return cost;
  }
  public void setCost(int cost) {
    this.cost = cost;
  }
  public int getPositionInSet() {
    return positionInSet;
  }
  public void setPositionInSet(int positionInSet) {
    this.positionInSet = positionInSet;
  }
  public String getSubtype() {
    return subtype;
  }
  public void setSubtype(String subtype) {
    this.subtype = subtype;
  }
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }
  public String getFlavor() {
    return flavor;
  }
  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }
  public String getPassive() {
    return passive;
  }
  public void setPassive(String passive) {
    this.passive = passive;
  }
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }
  public String getPowerAction() {
    return powerAction;
  }
  public void setPowerAction(String powerAction) {
    this.powerAction = powerAction;
  }
  public String getSpecial() {
    return special;
  }
  public void setSpecial(String special) {
    this.special = special;
  }
  public boolean isHas_Die() {
    return has_Die;
  }
  public void setHas_Die(boolean has_Die) {
    this.has_Die = has_Die;
  }
  public boolean is_unique() {
    return is_unique;
  }
  public void setIs_unique(boolean is_unique) {
    this.is_unique = is_unique;
  }
  public boolean isHas_errata() {
    return has_errata;
  }
  public void setHas_errata(boolean has_errata) {
    this.has_errata = has_errata;
  }
  
  
}
