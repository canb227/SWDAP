package org.swdapModel.enums;

public enum Type {

  CHARACTER("character", "Character"), EVENT("event", "Event"), SUPPORT("support", "Support"), UPGRADE("upgrade",
      "Upgrade"), PLOT("plot", "Plot"), BATTLEFIELD("battlefield", "Battlefield"), UNKNOWN("unknown","Unknown");

  public String getCode() {
    return code;
  }

  public String getLabel() {
    return label;
  }

  private String code;
  private String label;

  Type(String code, String label) {
    this.code = code;
    this.label = label;
  }

  public static Type fromString(String text) {
    for (Type s : Type.values()) {
      if (s.code.equalsIgnoreCase(text)) {
        return s;
      }
    }
    return Type.UNKNOWN;
  }
  
}
