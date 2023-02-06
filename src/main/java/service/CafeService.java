package service;

import mapper.CafeMapper;
import mapper.PaymentTypeMapper;
import model.Cafe;
import model.PaymentType;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisUtil;

import java.util.Map;

public class CafeService {
    public Cafe getCafeById(Integer id) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            CafeMapper cafeMapper = sqlSession.getMapper(CafeMapper.class);
            return cafeMapper.getCafeById(id);
        }finally{
            sqlSession.close();
        }
    }

    public void insertCafe(Cafe cafe) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            CafeMapper cafeMapper = sqlSession.getMapper(CafeMapper.class);
            cafeMapper.saveCafe(cafe);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

    public void updateCafe(Cafe cafe) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            CafeMapper cafeMapper = sqlSession.getMapper(CafeMapper.class);
            cafeMapper.updateCafe(cafe);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

    public void deleteCafe(Cafe cafe) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            CafeMapper cafeMapper = sqlSession.getMapper(CafeMapper.class);
            cafeMapper.deleteCafe(cafe);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

    public Map<Integer, Cafe> getAllCafe() {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            CafeMapper cafeMapper = sqlSession.getMapper(CafeMapper.class);
            return cafeMapper.getAllCafe();
        }finally{
            sqlSession.close();
        }
    }
}

