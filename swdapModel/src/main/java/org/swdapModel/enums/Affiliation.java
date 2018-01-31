package org.swdapModel.enums;

public enum Affiliation {
  
  HERO("hero","Hero"),
  VILLAIN("villain","Villain"),
  NEUTRAL("neutral","Neutral"),
  UNKNOWN("unknown","Unknown");
  
  public String getCode() {
    return code;
  }

  public String getLabel() {
    return label;
  }

  private String code;
  private String label;

  Affiliation(String code, String label) {
    this.code = code;
    this.label = label;
  }
  
  public static Affiliation fromString(String text) {
    for (Affiliation s : Affiliation.values()) {
      if (s.code.equalsIgnoreCase(text)) {
        return s;
      }
    }
    return Affiliation.UNKNOWN;
  }

}
