package Exercise11_DI;

public class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomerById(int id) {
        return "Customer#" + id;
    }
}
