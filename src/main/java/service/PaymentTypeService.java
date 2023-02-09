package service;

import mapper.PaymentTypeMapper;
import model.PaymentType;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisUtil;

import java.util.List;
import java.util.Map;

public class PaymentTypeService {

    public PaymentType getPaymentTypeById(Integer id) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            PaymentTypeMapper paymentTypeMapper = sqlSession.getMapper(PaymentTypeMapper.class);
            return paymentTypeMapper.getPaymentTypeById(id);
        }
    }

    public void insertPaymentType(PaymentType paymentType) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            PaymentTypeMapper paymentTypeMapper = sqlSession.getMapper(PaymentTypeMapper.class);
            paymentTypeMapper.savePaymentType(paymentType);
            sqlSession.commit();
        }
    }

    public void updatePaymentType(PaymentType paymentType) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            PaymentTypeMapper paymentTypeMapper = sqlSession.getMapper(PaymentTypeMapper.class);
            paymentTypeMapper.updatePaymentType(paymentType);
            sqlSession.commit();
        }
    }

    public void deletePaymentType(PaymentType paymentType) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            PaymentTypeMapper paymentTypeMapper = sqlSession.getMapper(PaymentTypeMapper.class);
            paymentTypeMapper.deletePaymentType(paymentType);
            sqlSession.commit();
        }
    }

    public Map<Integer, PaymentType> getAllPaymentType() {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            PaymentTypeMapper paymentTypeMapper = sqlSession.getMapper(PaymentTypeMapper.class);
            return paymentTypeMapper.getAllPaymentType();
        }
    }
}
