package mapper;

import model.DeliveryProvider;
import org.apache.ibatis.annotations.*;

import java.util.Map;

public interface DeliveryProviderMapper {
    @Select("Select id, provider_name from DeliveryProvider where id=#{id}")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "providerName", column = "provider_name")})
    DeliveryProvider getDeliveryProviderById(Integer id);

    @Select("select * from DeliveryProvider")
    @MapKey("menuId")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "providerName", column = "provider_name")})
    Map<Integer, DeliveryProvider> getAllDeliveryProvider();

    @Update("Update DeliveryProvider set provider_name= #{providerName} where id=#{id}")
    void updateDeliveryProvider(DeliveryProvider deliveryProvider);

    @Insert("Insert into DeliveryProvider(id, provider_name) values (#{id},#{providerName})")
    void saveDeliveryProvider(DeliveryProvider deliveryProvider);

    @Delete("DELETE FROM DeliveryProvider WHERE id=#{id}")
    void deleteDeliveryProvider(DeliveryProvider deliveryProvider);
}

