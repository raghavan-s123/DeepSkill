public class Service{
private final ExternalApi api;
public Service(ExternalApi api){this.api=api;}
public String fetch(){return api.getData();}
}
