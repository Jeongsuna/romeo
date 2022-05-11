package C9035_CONTRACTSCHANGE;


import com.sun.istack.NotNull;
import org.springframework.lang.Nullable;

public class C9035_CONTRACTSCHANGE_good {
    public class good_Season {}

    public class good_Vegetable {

        private good_Season grow;
        private String color;

        public void setGrow(@Nullable good_Season grow) {
            this.grow = grow;
        }

        public @NotNull
        Integer getProtein() {
            return 12;
        }
    }

    public class good_Tomato extends good_Vegetable {

        good_Season grow;

        public void setGrow(@Nullable good_Season grow) {  // compliant
            this.grow = grow;
        }

        public @NotNull Integer getProtein() {  // compliant
            return null;
        }
    }
}

