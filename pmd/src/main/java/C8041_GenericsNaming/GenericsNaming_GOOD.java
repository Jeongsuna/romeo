package C8041_GenericsNaming;


public class GenericsNaming_GOOD {
    public interface GenericDao<E extends BaseModel, K extends Serializable> /*extends BaseDao*/{ }
    private static class BaseModel {
    }
    private static class Serializable {
    }
}
