package C8041_GenericsNaming;


public class GenericsNaming_BAD {
    public interface GenericDao<e extends BaseModel, KF extends Serializable> { }
    private static class BaseModel {
    }

    private static class Serializable {
    }
}
