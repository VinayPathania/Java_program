package Sprint_4.Day2;

public class Q3 {
    public static void main(String[] args) {
        //Markup Interface
        /*
         Marker Interfaces
            A marker interface is an interface that has no methods or constants inside it.
            It provides run-time type information about objects,
            so the compiler and JVM have additional information about the object.

            A marker interface is also called a tagging interface.

            Though marker interfaces are still in use, they very likely point to a code smell
            and should be used carefully. The main reason for this is that they blur the lines about
            what an interface represents since markers don't define any behavior. Newer development favors
            annotations to solve some of the same problems.

           JDK Marker Interfaces
            Java has many built-in marker interfaces, such as Serializable, Cloneable, and Remote.

            Let's take the example of the Cloneable interface. If we try to clone an object
            that doesn't implement this interface, the JVM throws a CloneNotSupportedException.
            Hence, the Cloneable marker interface is an indicator to the JVM that we can call the Object.clone() method.

            In the same way, when calling the ObjectOutputStream.writeObject() method,
            the JVM checks if the object implements the Serializable marker interface.
            When it's not the case, a NotSerializableException is thrown. Therefore, the object isn't serialized to the output stream.

           Custom Marker Interface
            Let's create our own marker interface.

            For example, we could create a marker that indicates whether an object can be removed from the database:

            public interface Deletable {
            }
            In order to delete an entity from the database, the object representing this entity
            has to implement our Deletable marker interface:

            public class Entity implements Deletable {
                // implementation details
            }
            Let's say that we have a DAO object with a method for removing entities from the database.
            We can write our delete() method so that only objects implementing our marker interface can be deleted:

            public class ShapeDao {

                // other dao methods

                public boolean delete(Object object) {
                    if (!(object instanceof Deletable)) {
                        return false;
                    }

                    // delete implementation details

                    return true;
                }
            }
            As we can see, we are giving an indication to the JVM, about the runtime behavior of our objects.
            If the object implements our marker interface, it can be deleted from the database.
         */
    }
}
