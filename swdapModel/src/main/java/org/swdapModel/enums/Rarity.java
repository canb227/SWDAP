package org.swdapModel.enums;

public enum Rarity {
  COMMON("C","Common"),
  UNCOMMON("U","Uncommon"),
  RARE("R","Rare"),
  LEGENDARY("L","Legendary"),
  UNKNOWN("U?","Unknown");
  
  public String getCode() {
    return code;
  }

  public String getLabel() {
    return label;
  }

  private String code;
  private String label;

  Rarity(String code, String label) {
    this.code = code;
    this.label = label;
  }
  
  public static Rarity fromString(String text) {
    for (Rarity s : Rarity.values()) {
      if (s.code.equalsIgnoreCase(text)) {
        return s;
      }
    }
    return Rarity.UNKNOWN;
  }

}
