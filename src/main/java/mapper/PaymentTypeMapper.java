package mapper;

import model.PaymentType;
import org.apache.ibatis.annotations.*;

import java.util.Map;

public interface PaymentTypeMapper {
    @Select("Select id_payment_type, name from PaymentType where id_payment_type=#{id}")
    @Results(value = {
            @Result(property = "id", column = "id_payment_type"),
            @Result(property = "name", column = "name")})
    PaymentType getPaymentTypeById(Integer id);

    @Select("select * from PaymentType")
    @MapKey("id")
    @Results(value = {
            @Result(property = "id", column = "id_payment_type"),
            @Result(property = "name", column = "name")})
    Map<Integer, PaymentType> getAllPaymentType();

    @Update("Update PaymentType set name= #{name} where id_payment_type=#{id}")
    void updatePaymentType(PaymentType paymentType);

    @Insert("Insert into PaymentType(id_payment_type, name) values (#{id},#{name})")
    void savePaymentType(PaymentType paymentType);

    @Delete("Delete from PaymentType where id_payment_type=#{id}")
    void deletePaymentType(PaymentType paymentType);
}
