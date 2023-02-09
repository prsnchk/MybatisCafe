package mapper;

import model.Courier;
import org.apache.ibatis.annotations.*;

import java.util.Map;

public interface CourierMapper {
    @Select("Select id, first_name, last_name from Courier where id=#{id}")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "firstName", column = "first_name"),
            @Result(property = "lastName", column = "last_name")})
    Courier getCourierById(Integer id);

    @Select("select * from Courier")
    @MapKey("id")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "firstName", column = "first_name"),
            @Result(property = "lastName", column = "last_name")})
    Map<Integer, Courier> getAllCourier();

    @Update("Update Courier set first_name= #{firstName} where id=#{id}")
    void updateCourier(Courier courier);

    @Insert("Insert into Courier(id, first_name, last_name) values (#{id},#{firstName},#{lastName})")
    void saveCourier(Courier courier);

    @Delete("DELETE FROM Courier WHERE id=#{id}")
    void deleteCourier(Courier courier);
}

