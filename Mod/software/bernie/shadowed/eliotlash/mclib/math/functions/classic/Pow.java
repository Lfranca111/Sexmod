/*    */ package software.bernie.shadowed.eliotlash.mclib.math.functions.classic;
/*    */ 
/*    */ import software.bernie.shadowed.eliotlash.mclib.math.IValue;
/*    */ import software.bernie.shadowed.eliotlash.mclib.math.functions.Function;
/*    */ 
/*    */ public class Pow extends Function {
/*    */   public Pow(IValue[] values, String name) throws Exception {
/*  8 */     super(values, name);
/*    */   }
/*    */ 
/*    */   
/*    */   public int getRequiredArguments() {
/* 13 */     return 2;
/*    */   }
/*    */ 
/*    */   
/*    */   public double get() {
/* 18 */     return Math.pow(getArg(0), getArg(1));
/*    */   }
/*    */ }


/* Location:              C:\Users\Logan\Downloads\SchnurriTV's Sexmod-1.9.0.jar!\software\bernie\shadowed\eliotlash\mclib\math\functions\classic\Pow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */