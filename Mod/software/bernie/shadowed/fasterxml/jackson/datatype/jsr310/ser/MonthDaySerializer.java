/*    */ package software.bernie.shadowed.fasterxml.jackson.datatype.jsr310.ser;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.lang.reflect.Type;
/*    */ import java.time.MonthDay;
/*    */ import java.time.format.DateTimeFormatter;
/*    */ import software.bernie.shadowed.fasterxml.jackson.annotation.JsonFormat;
/*    */ import software.bernie.shadowed.fasterxml.jackson.core.JsonGenerator;
/*    */ import software.bernie.shadowed.fasterxml.jackson.core.JsonToken;
/*    */ import software.bernie.shadowed.fasterxml.jackson.databind.BeanProperty;
/*    */ import software.bernie.shadowed.fasterxml.jackson.databind.JavaType;
/*    */ import software.bernie.shadowed.fasterxml.jackson.databind.JsonMappingException;
/*    */ import software.bernie.shadowed.fasterxml.jackson.databind.JsonNode;
/*    */ import software.bernie.shadowed.fasterxml.jackson.databind.JsonSerializer;
/*    */ import software.bernie.shadowed.fasterxml.jackson.databind.SerializerProvider;
/*    */ import software.bernie.shadowed.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
/*    */ import software.bernie.shadowed.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
/*    */ import software.bernie.shadowed.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MonthDaySerializer
/*    */   extends JSR310FormattedSerializerBase<MonthDay>
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/* 45 */   public static final MonthDaySerializer INSTANCE = new MonthDaySerializer();
/*    */   
/*    */   private MonthDaySerializer() {
/* 48 */     this((DateTimeFormatter)null);
/*    */   }
/*    */   
/*    */   public MonthDaySerializer(DateTimeFormatter formatter) {
/* 52 */     super(MonthDay.class, formatter);
/*    */   }
/*    */   
/*    */   private MonthDaySerializer(MonthDaySerializer base, Boolean useTimestamp, DateTimeFormatter formatter) {
/* 56 */     super(base, useTimestamp, formatter, null);
/*    */   }
/*    */ 
/*    */   
/*    */   protected MonthDaySerializer withFormat(Boolean useTimestamp, DateTimeFormatter formatter, JsonFormat.Shape shape) {
/* 61 */     return new MonthDaySerializer(this, useTimestamp, formatter);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void serialize(MonthDay value, JsonGenerator generator, SerializerProvider provider) throws IOException {
/* 68 */     if (_useTimestampExplicitOnly(provider)) {
/* 69 */       generator.writeStartArray();
/* 70 */       generator.writeNumber(value.getMonthValue());
/* 71 */       generator.writeNumber(value.getDayOfMonth());
/* 72 */       generator.writeEndArray();
/*    */     } else {
/* 74 */       String str = (this._formatter == null) ? value.toString() : value.format(this._formatter);
/* 75 */       generator.writeString(str);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void _acceptTimestampVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException {
/* 82 */     SerializerProvider provider = visitor.getProvider();
/* 83 */     boolean useTimestamp = (provider != null && _useTimestampExplicitOnly(provider));
/* 84 */     if (useTimestamp) {
/* 85 */       _acceptTimestampVisitor(visitor, typeHint);
/*    */     } else {
/* 87 */       JsonStringFormatVisitor v2 = visitor.expectStringFormat(typeHint);
/* 88 */       if (v2 != null) {
/* 89 */         v2.format(JsonValueFormat.DATE_TIME);
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected JsonToken serializationShape(SerializerProvider provider) {
/* 96 */     return _useTimestampExplicitOnly(provider) ? JsonToken.START_ARRAY : JsonToken.VALUE_STRING;
/*    */   }
/*    */ }


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\software\bernie\shadowed\fasterxml\jackson\datatype\jsr310\ser\MonthDaySerializer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */