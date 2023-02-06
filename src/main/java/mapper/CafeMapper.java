package mapper;

import model.Cafe;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface CafeMapper {
    @Select("Select id, cafe_name from Cafe where id=#{id}")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "cafeName", column = "cafe_name")})
    Cafe getCafeById(Integer id);

    @Select("select * from Cafe")
    @MapKey("id")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "cafeName", column = "cafe_name")})
    Map<Integer, Cafe> getAllCafe();

    @Update("Update Cafe set cafe_name= #{cafeName} where id=#{id}")
    void updateCafe(Cafe cafe);

    @Insert("Insert into Cafe(id, cafe_name) values (#{id},#{cafeName})")
    void saveCafe(Cafe cafe);

    @Delete("DELETE FROM Cafe WHERE id=#{id}")
    void deleteCafe(Cafe cafe);
}
