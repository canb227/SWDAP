
package org.swdapModel.enums;

import java.net.MalformedURLException;
import java.net.URL;

//TODO: Fix URLs!
public enum Format {
  INFINITE("I", "Infinite", "example.com"),
  STANDARD("S", "Standard", "example.com"),
  TRILOGY("T", "Trilogy", "example.com"),
  UNKNOWN("U", "Unknown Format", null);

  public String getCode() {
    return code;
  }

  public String getLabel() {
    return label;
  }

  private URL holocron;
  private String code;
  private String label;

  Format(String code, String label, String holocron) {
    this.code = code;
    this.label = label;
    try {
      this.holocron = new URL(holocron);
    } catch (MalformedURLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public static Format fromString(String text) {
    for (Format s : Format.values()) {
      if (s.code.equalsIgnoreCase(text)) {
        return s;
      }
    }
    return Format.UNKNOWN;
  }
}
