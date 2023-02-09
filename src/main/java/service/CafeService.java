package service;

import mapper.CafeMapper;
import model.Cafe;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisUtil;

import java.util.Map;

public class CafeService {
    public Cafe getCafeById(Integer id) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            CafeMapper cafeMapper = sqlSession.getMapper(CafeMapper.class);
            return cafeMapper.getCafeById(id);
        }
    }

    public void insertCafe(Cafe cafe) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            CafeMapper cafeMapper = sqlSession.getMapper(CafeMapper.class);
            cafeMapper.saveCafe(cafe);
            sqlSession.commit();
        }
    }

    public void updateCafe(Cafe cafe) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            CafeMapper cafeMapper = sqlSession.getMapper(CafeMapper.class);
            cafeMapper.updateCafe(cafe);
            sqlSession.commit();
        }
    }

    public void deleteCafe(Cafe cafe) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            CafeMapper cafeMapper = sqlSession.getMapper(CafeMapper.class);
            cafeMapper.deleteCafe(cafe);
            sqlSession.commit();
        }
    }

    public Map<Integer, Cafe> getAllCafe() {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            CafeMapper cafeMapper = sqlSession.getMapper(CafeMapper.class);
            return cafeMapper.getAllCafe();
        }
    }
}

