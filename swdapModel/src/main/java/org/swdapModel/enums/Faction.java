package org.swdapModel.enums;

public enum Faction {
  RED("red","Red","Command"),
  YELLOW("yellow","Yellow","Rouge"),
  BLUE("blue","Blue","Force"),
  GENERAL("general","Grey","General"),
  UNKNOWN("unknown","No Color","Unknown Faction");

  
  public String getCode() {
    return code;
  }

  public String getLabel() {
    return label;
  }

public String getColor() {
  return color;
}
  
  private String code;
  private String color;
  private String label;

  Faction(String code, String color, String label) {
    this.code = code;
    this.color = color;
    this.label = label;
  }
  
  public static Faction fromCodeString(String text) {
    for (Faction s : Faction.values()) {
      if (s.code.equalsIgnoreCase(text)) {
        return s;
      }
    }
    return Faction.UNKNOWN;
  }
}