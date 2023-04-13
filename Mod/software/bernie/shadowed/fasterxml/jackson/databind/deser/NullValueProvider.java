package software.bernie.shadowed.fasterxml.jackson.databind.deser;

import software.bernie.shadowed.fasterxml.jackson.databind.DeserializationContext;
import software.bernie.shadowed.fasterxml.jackson.databind.JsonMappingException;
import software.bernie.shadowed.fasterxml.jackson.databind.util.AccessPattern;

public interface NullValueProvider {
  Object getNullValue(DeserializationContext paramDeserializationContext) throws JsonMappingException;
  
  AccessPattern getNullAccessPattern();
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.8.0.jar!\software\bernie\shadowed\fasterxml\jackson\databind\deser\NullValueProvider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */