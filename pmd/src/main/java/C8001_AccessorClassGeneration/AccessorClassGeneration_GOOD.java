package C8001_AccessorClassGeneration;

public class AccessorClassGeneration_GOOD {
    public class Outside {
        void Foo(){
            Inside isd = new Inside();
        }
        private class Inside {
            private Inside(){}
        }
    }
}
