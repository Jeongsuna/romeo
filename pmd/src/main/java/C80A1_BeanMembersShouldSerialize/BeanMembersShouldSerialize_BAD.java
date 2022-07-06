package C80A1_BeanMembersShouldSerialize;

public class BeanMembersShouldSerialize_BAD {
    public class BeanClass implements java.io.Serializable {
        private int id;
        private String name;
        public BeanClass()
        {
        }
    }
}
