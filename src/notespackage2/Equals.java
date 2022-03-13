package notespackage2;

public class Equals {

    String name;
    Equals(String n) {
        name = n;
    }
    // EQUALS(): Each object has a predefined equals() method that is used for semantically equality testing. There is a siple and fast way of generating the equals() method, other than writing it manually. Just right click in your class, right click and go to Source Actions (VSC), then: Generate hashCode() and equals(). This is used to determine where to store the object internally. Whenever you implement equals, you MUST also implement hashCode. | You can use the same menu to generate other useful methods, such as getters and setters for your class attributes.
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Equals other = (Equals) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}
