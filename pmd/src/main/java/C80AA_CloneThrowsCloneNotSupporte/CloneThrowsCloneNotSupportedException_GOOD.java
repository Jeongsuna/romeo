package C80AA_CloneThrowsCloneNotSupporte;

public class CloneThrowsCloneNotSupportedException_GOOD {
    public class MyClass implements Cloneable{
        public Object clone() throws CloneNotSupportedException {
            MyClass clone = (MyClass)super.clone();
            return clone;
        }
    }
}
