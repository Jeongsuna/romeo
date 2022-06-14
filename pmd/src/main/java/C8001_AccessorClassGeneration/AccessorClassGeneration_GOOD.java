package C8001_AccessorClassGeneration;

public class AccessorClassGeneration_GOOD {
    public class Outside {
        void Foo(){
            Inside isd = new Inside();
        }
        public class Inside {
            private Inside(){}
        }
    }
}
