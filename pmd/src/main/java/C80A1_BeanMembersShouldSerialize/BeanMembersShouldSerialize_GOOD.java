package C80A1_BeanMembersShouldSerialize;

public class BeanMembersShouldSerialize_GOOD {
    public class BeanClass implements java.io.Serializable {
        private transient int id;
        private String name;
        public BeanClass()
        {
        }
        public void setId(int id)
        {
            this.id = id;
        }
        public int getId()
        {
            return id;
        }
        public void setName(String name)
        {
            this.name = name;
        }
        public String getName()
        {
            return name;
        }
    }
}
