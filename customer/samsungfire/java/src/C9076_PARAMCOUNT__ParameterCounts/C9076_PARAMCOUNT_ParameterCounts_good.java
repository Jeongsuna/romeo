package C9076_PARAMCOUNT__ParameterCounts;

public class C9076_PARAMCOUNT_ParameterCounts_good {
    private void goodMethod(ParamClass param) { // @fix
        //...
    }

    public class ParamClass{
        int param1;
        int param2;
        int param3;
        int param4;
        int param5;
        int param6;
        int param7;
        int param8;
        int param9;
        int param10;
        int param11;
        int param12;

        public void paramClass(int param1, int param2, int param3,
                               int param4, int param5, int param6,
                               int param7, int param8, int param9,
                               int param10, int param11, int param12){
            this.param1 = param1;
            this.param2 = param2;
            this.param3 = param3;
            this.param4 = param4;
            this.param5 = param5;
            this.param6 = param6;
            this.param7 = param7;
            this.param8 = param8;
            this.param9 = param9;
            this.param10 = param10;
            this.param11 = param11;
            this.param12 = param12;
        }
    }
}
