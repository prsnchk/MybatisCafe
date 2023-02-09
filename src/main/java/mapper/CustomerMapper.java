package mapper;

import model.Customer;
import org.apache.ibatis.annotations.*;

import java.util.Map;

public interface CustomerMapper {
    @Select("Select id_customer,first_name,second_name,phone,email from Customer where id_customer=#{customerId}")
    @Results(value = {@Result(property = "customerId", column = "id_customer"), @Result(property = "firstName", column = "first_name"), @Result(property = "secondName", column = "second_name"), @Result(property = "phone", column = "phone"), @Result(property = "email", column = "email")})
    Customer getCustomerById(Integer id);

    @Select("select * from Customer")
    @MapKey("customerId")
    @Results(value = {@Result(property = "customerId", column = "id_customer"), @Result(property = "firstName", column = "first_name"), @Result(property = "secondName", column = "second_name"), @Result(property = "phone", column = "phone"), @Result(property = "email", column = "email")})
    Map<Integer, Customer> getAllCustomer();

    @Update("Update Customer set first_name = #{firstName}, second_name = #{secondName}, phone = #{phone}, email = #{email} where id_customer=#{customerId}")
    void updateCustomer(Customer customer);

    @Insert("Insert into Customer(id_customer, first_name, second_name, phone, email ) values (#{customerId},#{firstName},#{secondName},#{phone},#{email})")
    void saveCustomer(Customer customer);

    @Delete("DELETE FROM Customer WHERE id_customer=#{customerId}")
    void deleteCustomer(Customer customer);
}
