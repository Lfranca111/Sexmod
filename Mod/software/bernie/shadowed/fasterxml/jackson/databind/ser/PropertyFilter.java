package software.bernie.shadowed.fasterxml.jackson.databind.ser;

import software.bernie.shadowed.fasterxml.jackson.core.JsonGenerator;
import software.bernie.shadowed.fasterxml.jackson.databind.JsonMappingException;
import software.bernie.shadowed.fasterxml.jackson.databind.SerializerProvider;
import software.bernie.shadowed.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import software.bernie.shadowed.fasterxml.jackson.databind.node.ObjectNode;

public interface PropertyFilter {
  void serializeAsField(Object paramObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, PropertyWriter paramPropertyWriter) throws Exception;
  
  void serializeAsElement(Object paramObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, PropertyWriter paramPropertyWriter) throws Exception;
  
  @Deprecated
  void depositSchemaProperty(PropertyWriter paramPropertyWriter, ObjectNode paramObjectNode, SerializerProvider paramSerializerProvider) throws JsonMappingException;
  
  void depositSchemaProperty(PropertyWriter paramPropertyWriter, JsonObjectFormatVisitor paramJsonObjectFormatVisitor, SerializerProvider paramSerializerProvider) throws JsonMappingException;
}


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.8.0.jar!\software\bernie\shadowed\fasterxml\jackson\databind\ser\PropertyFilter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */