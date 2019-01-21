package in.neuw.learning.java8;

import org.apache.commons.lang3.StringUtils;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static in.neuw.learning.java8.FunctionalInterfaces.user_consumer;
import static in.neuw.learning.java8.FunctionalInterfaces.user_supplier;
import static net.andreinc.mockneat.unit.types.Ints.ints;
import static net.andreinc.mockneat.unit.user.Emails.emails;

class MethodReferenceExample {

   public static void main(String[] args) {
       MethodReferenceExampleUser user = user_supplier.get();

       System.out.println(user);
       user_consumer.accept(user);

       Utils.line_out.print();
       System.out.println(user);
       Utils.line_out.print();
       System.out.println(getUser(FunctionalInterfaces::getUser));
       Utils.line_out.print();


   }

   private static MethodReferenceExampleUser getUser(Supplier<MethodReferenceExampleUser> userSupplier){
       return userSupplier.get();
   }

   public final Utils utils(){
       return new Utils();
   }

}

class FunctionalInterfaces {

   public static final MethodReferenceExampleUser getUser() {
       MethodReferenceExampleUser user = new MethodReferenceExampleUser();
       user.setUsername(emails().get());
       user.setId(ints().get());
       return user;
   }

   public static final Function<String, MethodReferenceExampleUser> user_function = username -> {
       MethodReferenceExampleUser user = new MethodReferenceExampleUser();
       if(StringUtils.isNotBlank(username)) {
           user.setUsername(username);
       }else {
           user.setUsername(emails().get());
       }
       user.setId(ints().get());
       return user;
   };

   public static final Supplier<MethodReferenceExampleUser> user_supplier = () -> {
       MethodReferenceExampleUser user = new MethodReferenceExampleUser();
       return user;
   };

   public static final Consumer<MethodReferenceExampleUser> user_consumer = m -> {
       m.setId(ints().get());
       m.setUsername(emails().get());
   };

}

class MethodReferenceExampleUser {

   int id;

   String username;

   public int getId() {
       return id;
   }

   public void setId(int id) {
       this.id = id;
   }

   public String getUsername() {
       return username;
   }

   public void setUsername(String username) {
       this.username = username;
   }

   @Override
   public String toString() {
       return "User{" +
               "id=" + this.getId() +
               ", username='" + StringUtils.defaultString(this.getUsername()) + '\'' +
               '}';
   }
}

class Utils {

   public static final OutLine line_out = () -> {
       System.out.println("----------------------------------------------------------------------------------------");
   };

   public void getLine_out() {
       line_out.print();
   }
}

@FunctionalInterface
interface OutLine {

   void print();

}