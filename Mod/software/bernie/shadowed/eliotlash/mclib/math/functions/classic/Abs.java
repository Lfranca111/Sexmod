/*    */ package software.bernie.shadowed.eliotlash.mclib.math.functions.classic;
/*    */ 
/*    */ import software.bernie.shadowed.eliotlash.mclib.math.IValue;
/*    */ import software.bernie.shadowed.eliotlash.mclib.math.functions.Function;
/*    */ 
/*    */ 
/*    */ public class Abs
/*    */   extends Function
/*    */ {
/*    */   public Abs(IValue[] values, String name) throws Exception {
/* 11 */     super(values, name);
/*    */   }
/*    */ 
/*    */   
/*    */   public int getRequiredArguments() {
/* 16 */     return 1;
/*    */   }
/*    */ 
/*    */   
/*    */   public double get() {
/* 21 */     return Math.abs(getArg(0));
/*    */   }
/*    */ }


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\software\bernie\shadowed\eliotlash\mclib\math\functions\classic\Abs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */