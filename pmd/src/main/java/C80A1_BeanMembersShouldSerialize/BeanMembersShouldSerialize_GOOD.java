package C80A1_BeanMembersShouldSerialize;

public class BeanMembersShouldSerialize_GOOD {
    public class BeanClass {
        private String name;
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
