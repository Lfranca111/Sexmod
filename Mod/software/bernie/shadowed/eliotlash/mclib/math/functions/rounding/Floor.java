/*    */ package software.bernie.shadowed.eliotlash.mclib.math.functions.rounding;
/*    */ 
/*    */ import software.bernie.shadowed.eliotlash.mclib.math.IValue;
/*    */ import software.bernie.shadowed.eliotlash.mclib.math.functions.Function;
/*    */ 
/*    */ public class Floor extends Function {
/*    */   public Floor(IValue[] values, String name) throws Exception {
/*  8 */     super(values, name);
/*    */   }
/*    */ 
/*    */   
/*    */   public int getRequiredArguments() {
/* 13 */     return 1;
/*    */   }
/*    */ 
/*    */   
/*    */   public double get() {
/* 18 */     return Math.floor(getArg(0));
/*    */   }
/*    */ }


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.8.0.jar!\software\bernie\shadowed\eliotlash\mclib\math\functions\rounding\Floor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */