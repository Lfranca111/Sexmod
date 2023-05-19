/*    */ package software.bernie.shadowed.fasterxml.jackson.datatype.jsr310.deser.key;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.time.DateTimeException;
/*    */ import java.time.LocalDate;
/*    */ import java.time.format.DateTimeFormatter;
/*    */ import software.bernie.shadowed.fasterxml.jackson.databind.DeserializationContext;
/*    */ 
/*    */ public class LocalDateKeyDeserializer
/*    */   extends Jsr310KeyDeserializer
/*    */ {
/* 12 */   public static final LocalDateKeyDeserializer INSTANCE = new LocalDateKeyDeserializer();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected LocalDate deserialize(String key, DeserializationContext ctxt) throws IOException {
/*    */     try {
/* 21 */       return LocalDate.parse(key, DateTimeFormatter.ISO_LOCAL_DATE);
/* 22 */     } catch (DateTimeException e) {
/* 23 */       return _rethrowDateTimeException(ctxt, LocalDate.class, e, key);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\software\bernie\shadowed\fasterxml\jackson\datatype\jsr310\deser\key\LocalDateKeyDeserializer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */