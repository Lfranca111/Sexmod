package software.bernie.shadowed.fasterxml.jackson.databind.jsonFormatVisitors;

import software.bernie.shadowed.fasterxml.jackson.core.JsonParser;

public interface JsonIntegerFormatVisitor extends JsonValueFormatVisitor {
  void numberType(JsonParser.NumberType paramNumberType);
  
  public static class Base extends JsonValueFormatVisitor.Base implements JsonIntegerFormatVisitor {
    public void numberType(JsonParser.NumberType type) {}
  }
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\software\bernie\shadowed\fasterxml\jackson\databind\jsonFormatVisitors\JsonIntegerFormatVisitor.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */