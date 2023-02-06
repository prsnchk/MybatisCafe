package service;

import mapper.PaymentTypeMapper;
import model.PaymentType;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisUtil;

import java.util.List;
import java.util.Map;

public class PaymentTypeService {

    public PaymentType getPaymentTypeById(Integer id) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            PaymentTypeMapper paymentTypeMapper = sqlSession.getMapper(PaymentTypeMapper.class);
            return paymentTypeMapper.getPaymentTypeById(id);
        }finally{
            sqlSession.close();
        }
    }

    public void insertPaymentType(PaymentType paymentType) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            PaymentTypeMapper paymentTypeMapper = sqlSession.getMapper(PaymentTypeMapper.class);
            paymentTypeMapper.savePaymentType(paymentType);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

    public void updatePaymentType(PaymentType paymentType) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            PaymentTypeMapper paymentTypeMapper = sqlSession.getMapper(PaymentTypeMapper.class);
            paymentTypeMapper.updatePaymentType(paymentType);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

    public void deletePaymentType(PaymentType paymentType) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            PaymentTypeMapper paymentTypeMapper = sqlSession.getMapper(PaymentTypeMapper.class);
            paymentTypeMapper.deletePaymentType(paymentType);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

    public Map<Integer, PaymentType> getAllPaymentType() {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            PaymentTypeMapper paymentTypeMapper = sqlSession.getMapper(PaymentTypeMapper.class);
            return paymentTypeMapper.getAllPaymentType();
        }finally{
            sqlSession.close();
        }
    }
}
