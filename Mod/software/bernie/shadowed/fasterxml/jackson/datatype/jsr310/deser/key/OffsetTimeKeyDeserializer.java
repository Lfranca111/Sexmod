/*    */ package software.bernie.shadowed.fasterxml.jackson.datatype.jsr310.deser.key;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.time.DateTimeException;
/*    */ import java.time.OffsetTime;
/*    */ import java.time.format.DateTimeFormatter;
/*    */ import software.bernie.shadowed.fasterxml.jackson.databind.DeserializationContext;
/*    */ 
/*    */ public class OffsetTimeKeyDeserializer
/*    */   extends Jsr310KeyDeserializer
/*    */ {
/* 12 */   public static final OffsetTimeKeyDeserializer INSTANCE = new OffsetTimeKeyDeserializer();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected OffsetTime deserialize(String key, DeserializationContext ctxt) throws IOException {
/*    */     try {
/* 21 */       return OffsetTime.parse(key, DateTimeFormatter.ISO_OFFSET_TIME);
/* 22 */     } catch (DateTimeException e) {
/* 23 */       return _rethrowDateTimeException(ctxt, OffsetTime.class, e, key);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.8.0.jar!\software\bernie\shadowed\fasterxml\jackson\datatype\jsr310\deser\key\OffsetTimeKeyDeserializer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */