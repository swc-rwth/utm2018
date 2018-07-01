package idgeneration;

public class IDFactory {

   private static Integer idCounter = 1;

   private static IDFactory theInstance;

   public static IDFactory getInstance() {
      if (theInstance == null) {
         theInstance = new IDFactory();
         return theInstance;
      } else {
         return theInstance;
      }

   }

   public String newID() {
      String id = "id_" + idCounter.toString();
      idCounter = idCounter + 1;
      return id;
   }

}