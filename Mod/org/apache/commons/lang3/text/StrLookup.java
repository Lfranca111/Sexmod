/*     */ package org.apache.commons.lang3.text;
/*     */ 
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Deprecated
/*     */ public abstract class StrLookup<V>
/*     */ {
/*  46 */   private static final StrLookup<String> NONE_LOOKUP = new MapStrLookup<>(null);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  51 */   private static final StrLookup<String> SYSTEM_PROPERTIES_LOOKUP = new SystemPropertiesStrLookup();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static StrLookup<?> noneLookup() {
/*  60 */     return NONE_LOOKUP;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static StrLookup<String> systemPropertiesLookup() {
/*  75 */     return SYSTEM_PROPERTIES_LOOKUP;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <V> StrLookup<V> mapLookup(Map<String, V> map) {
/*  89 */     return new MapStrLookup<>(map);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract String lookup(String paramString);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static class MapStrLookup<V>
/*     */     extends StrLookup<V>
/*     */   {
/*     */     private final Map<String, V> map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     MapStrLookup(Map<String, V> map) {
/* 140 */       this.map = map;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String lookup(String key) {
/* 154 */       if (this.map == null) {
/* 155 */         return null;
/*     */       }
/* 157 */       Object obj = this.map.get(key);
/* 158 */       if (obj == null) {
/* 159 */         return null;
/*     */       }
/* 161 */       return obj.toString();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static class SystemPropertiesStrLookup
/*     */     extends StrLookup<String>
/*     */   {
/*     */     private SystemPropertiesStrLookup() {}
/*     */ 
/*     */ 
/*     */     
/*     */     public String lookup(String key) {
/* 175 */       if (!key.isEmpty()) {
/*     */         try {
/* 177 */           return System.getProperty(key);
/* 178 */         } catch (SecurityException securityException) {}
/*     */       }
/*     */ 
/*     */       
/* 182 */       return null;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\org\apache\commons\lang3\text\StrLookup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */